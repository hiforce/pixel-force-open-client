package hiforce.pixel.open.sample.change_bg;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.config.PixelForceClientProperties;
import hiforce.pixel.open.client.request.change_bg.ChangeBgReq;
import hiforce.pixel.open.client.request.resource.ResourceReq;
import hiforce.pixel.open.client.request.result.TaskResultReq;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.request.submit.UploadImgReq;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import hiforce.pixel.open.client.response.UploadResult;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class ChangeBgSample {

    private void initClient(){
        PixelForceClientProperties.getInstance().setEndpoint("https://api-paas-gateway-dev.hiforce.dev/pixel_force_open_api");
        PixelForceClientProperties.getInstance().setAccessKey("b4fed2437feb48e7b8b994a92e9f0dff");
        PixelForceClientProperties.getInstance().setAccessSecret("d585e50c833b4b648442da05f23ea223");
    }

    private void sample() throws Exception{
        ResourceResult result = PixelForceClient.getInstance().getResourceList(ResourceReq.builder().build());
        if(!result.getStatus().equals(ApiStatusEnum.SUCCESS.getCode()) ||
                CollectionUtils.isEmpty(result.getResources())){
            throw new RuntimeException("changeBackground resources is empty");
        }
        String resourceId = result.getResources().get(0).getId();
        UploadImgReq uploadImgReq = new UploadImgReq();
        uploadImgReq.getResourceIds().add(resourceId);
        uploadImgReq.setImagePath(Objects.requireNonNull(ChangeBgSample.class.getResource("/changeBg.png")).getPath());
        UploadResult uploadResult = PixelForceClient.getInstance().uploadImage(uploadImgReq);
        if(!uploadResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())){
            throw new RuntimeException("changeBackground uploadImage fail");
        }
        ChangeBgReq changeBgReq = new ChangeBgReq();
        changeBgReq.setInputImagePath(uploadResult.getPath());
        changeBgReq.getPrompt().setMainPositiveWords("street,sunshine,car");
        changeBgReq.getResourceIds().add(resourceId);
        changeBgReq.setProvider(ResourceProvider.CUSTOMER);
        InvokeResult invokeResult = PixelForceClient.getInstance().changeBackground(changeBgReq);
        if(!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())){
            throw new RuntimeException("changeBackground fail");
        }
        System.out.println("changeBackground invokeResult:" + JSON.toJSONString(invokeResult));
        TaskResultReq taskResultReq = TaskResultReq.builder().taskId(invokeResult.getTaskId()).build();
        taskResultReq.getResourceIds().add(resourceId);
        Timer timer = new Timer();
        CountDownLatch countDownLatch=new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskResult taskResult = PixelForceClient.getInstance().getTaskResult(taskResultReq);
                if(taskResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())){
                    System.out.println("changeBackground task finished:" + JSON.toJSONString(taskResult));
                    countDownLatch.countDown();
                    timer.cancel();
                }else if (taskResult.getStatus().equals(ApiStatusEnum.RUNNING.getCode())) {
                    System.out.println("changeBackground task running:" + JSON.toJSONString(taskResult));
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public void run(){
        try{
            initClient();
            sample();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ChangeBgSample changeBgSample = new ChangeBgSample();
        changeBgSample.run();
    }
}
