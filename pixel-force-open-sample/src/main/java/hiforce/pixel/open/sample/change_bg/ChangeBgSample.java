package hiforce.pixel.open.sample.change_bg;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.comfy.model.node.prompt.style.extra.MagicStyleType;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.change_bg.ChangeBgClientRequest;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.result.TaskResultClientRequest;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.request.submit.UploadImageClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseSample;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class ChangeBgSample extends BaseSample {


    public void execute() throws Exception {
        ResourceResult result = PixelForceClient.getInstance().getResourceList(ResourceClientRequest.builder().build());
        if (!result.getStatus().equals(ApiStatusEnum.SUCCESS.getCode()) ||
                CollectionUtils.isEmpty(result.getResources())) {
            throw new RuntimeException("changeBackground resources is empty");
        }
        String resourceId = result.getResources().get(0).getId();
        UploadImageClientRequest uploadImgReq = new UploadImageClientRequest();
        uploadImgReq.getResourceIds().add(resourceId);
        uploadImgReq.setImagePath(Objects.requireNonNull(ChangeBgSample.class.getResource("/changeBg.png")).getPath());
        UploadResult uploadResult = PixelForceClient.getInstance().uploadImage(uploadImgReq);
        if (!uploadResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("changeBackground uploadImage fail");
        }
        ChangeBgClientRequest changeBgReq = new ChangeBgClientRequest();
        changeBgReq.setInputImagePath(uploadResult.getPath());
        changeBgReq.getPrompt().setMainPositiveWords("in the park");
        changeBgReq.getPrompt().getExtraStyle().setMagicType(MagicStyleType.NATURE_MAGIC);
        changeBgReq.getResult().setRedrawStrength(1.0f);
        changeBgReq.getResourceIds().add(resourceId);
        changeBgReq.setProvider(ResourceProvider.CUSTOMER);
        InvokeResult invokeResult = PixelForceClient.getInstance().changeBackground(changeBgReq);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("changeBackground fail");
        }
        System.out.println("changeBackground invokeResult:" + JSON.toJSONString(invokeResult));
        TaskResultClientRequest taskResultReq = TaskResultClientRequest.builder().taskId(invokeResult.getTaskId()).build();
        taskResultReq.getResourceIds().add(resourceId);
        Timer timer = new Timer();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskResult taskResult = PixelForceClient.getInstance().getTaskResult(taskResultReq);
                if (taskResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
                    System.out.println("changeBackground task finished:" + JSON.toJSONString(taskResult));
                    countDownLatch.countDown();
                    timer.cancel();
                } else if (taskResult.getStatus().equals(ApiStatusEnum.RUNNING.getCode())) {
                    System.out.println("changeBackground task running:" + JSON.toJSONString(taskResult));
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public static void main(String[] args) {
        ChangeBgSample changeBgSample = new ChangeBgSample();
        changeBgSample.run();
    }
}
