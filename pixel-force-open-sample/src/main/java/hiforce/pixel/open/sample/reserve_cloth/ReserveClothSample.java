package hiforce.pixel.open.sample.reserve_cloth;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.reserve_cloth.ReserveClothClientRequest;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.result.TaskResultClientRequest;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.request.submit.UploadImageClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class ReserveClothSample extends BaseRemoteSample {

    @Override
    public String getAccessKey() {
        return "YOUR_ACCESS_KEY";
    }

    @Override
    public String getAccessSecret() {
        return "YOUR_ACCESS_SECRET";
    }

    public void execute() throws Exception {
        ResourceResult result = PixelForceClient.getInstance().getResourceList(ResourceClientRequest.builder().build());
        if (!result.getStatus().equals(ApiStatusEnum.SUCCESS.getCode()) ||
                CollectionUtils.isEmpty(result.getResources())) {
            throw new RuntimeException("reserveClothReq resources is empty");
        }
        String resourceId = result.getResources().get(0).getId();
        UploadImageClientRequest uploadImgReq = new UploadImageClientRequest();
        uploadImgReq.getResourceIds().add(resourceId);
        uploadImgReq.setImagePath(Objects.requireNonNull(ReserveClothSample.class.getResource("/reserveCloth.png")).getPath());
        UploadResult uploadResult = PixelForceClient.getInstance().uploadImage(uploadImgReq);
        if (!uploadResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("reserveCloth uploadImage fail");
        }
        ReserveClothClientRequest reserveClothReq = new ReserveClothClientRequest();
        reserveClothReq.setProvider(ResourceProvider.CUSTOMER);
        reserveClothReq.setInputImagePath(uploadResult.getPath());
        reserveClothReq.getResourceIds().add(resourceId);
        reserveClothReq.getPrompt().setMainPositiveWords("car,street,sunshine");
        InvokeResult invokeResult = PixelForceClient.getInstance().reserveCloth(reserveClothReq);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("reserveClothReq fail");
        }
        System.out.println("reserveClothReq invokeResult:" + JSON.toJSONString(invokeResult));
        TaskResultClientRequest taskResultReq = TaskResultClientRequest.builder().taskId(invokeResult.getTaskId()).build();
        taskResultReq.getResourceIds().add(resourceId);
        Timer timer = new Timer();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskResult taskResult = PixelForceClient.getInstance().getTaskResult(taskResultReq);
                if (taskResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
                    System.out.println("reserveClothReq task finished:" + JSON.toJSONString(taskResult));
                    countDownLatch.countDown();
                    timer.cancel();
                } else if (taskResult.getStatus().equals(ApiStatusEnum.RUNNING.getCode())) {
                    System.out.println("reserveClothReq task running:" + JSON.toJSONString(taskResult));
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public static void main(String[] args) {
        ReserveClothSample reserveClothSample = new ReserveClothSample();
        reserveClothSample.run();
    }
}
