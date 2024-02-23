package hiforce.pixel.open.sample.common;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.config.PixelForceClientProperties;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.result.TaskResultClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/**
 * @author Rocky Yu
 * @since 2024/2/22
 */
public abstract class BaseRemoteSample {
    protected void initClient() {
        PixelForceClientProperties.getInstance().setEndpoint("https://api-gateway.hiforce.net/pixel_force_open_api");
        PixelForceClientProperties.getInstance().setAccessKey("e964682dcb5248898b1c77d0a89cdff4");
        PixelForceClientProperties.getInstance().setAccessSecret("ISWq8nvF");
    }


    public void waitAndQueryTaskExecuteResult(InvokeResult invokeResult, String resourceId) throws Exception {
        TaskResultClientRequest taskResultReq = TaskResultClientRequest.builder().taskId(invokeResult.getTaskId()).build();
        taskResultReq.getResourceIds().add(resourceId);
        Timer timer = new Timer();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskResult taskResult = PixelForceClient.getInstance().getTaskResult(taskResultReq);
                if (taskResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
                    System.out.println("Task finished:" + JSON.toJSONString(taskResult));
                    countDownLatch.countDown();
                    timer.cancel();
                } else if (taskResult.getStatus().equals(ApiStatusEnum.RUNNING.getCode())) {
                    System.out.println("Task task running:" + JSON.toJSONString(taskResult));
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public ResourceResult getFirstAvailableResource() {
        ResourceResult result = PixelForceClient.getInstance().getResourceList(ResourceClientRequest.builder().build());
        if (!result.getStatus().equals(ApiStatusEnum.SUCCESS.getCode()) ||
                CollectionUtils.isEmpty(result.getResources())) {
            throw new RuntimeException("No available ComfyUI container resource");
        }
        return result;
    }

    public abstract void execute() throws Exception;

    public final void run() {
        try {
            initClient();
            execute();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public String getTextFromResource(String resource) {
        URL url = BaseRemoteSample.class.getResource(resource);
        assert null != url;
        File file = new File(url.getPath());
        try {
            return FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
