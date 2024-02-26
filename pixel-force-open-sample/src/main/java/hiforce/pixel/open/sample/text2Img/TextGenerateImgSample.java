package hiforce.pixel.open.sample.text2Img;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.comfy.model.common.ImageSize;
import hiforce.pixel.comfy.model.node.prompt.style.CameraAngleType;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.result.TaskResultClientRequest;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.request.text2Img.Text2ImgClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class TextGenerateImgSample extends BaseRemoteSample {

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
            throw new RuntimeException("resources is empty");
        }
        Text2ImgClientRequest text2ImgReq = new Text2ImgClientRequest();
        text2ImgReq.setProvider(ResourceProvider.CUSTOMER);
        text2ImgReq.setSize(ImageSize.SIZE_768_1);
        text2ImgReq.getPrompt().setMainPositiveWords("street,sunshine,tree");
        text2ImgReq.getPrompt().setCameraAngle(CameraAngleType.FROM_ABOVE);
        InvokeResult invokeResult = PixelForceClient.getInstance().textGenerateImg(text2ImgReq);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("textGenerateImg invoke fail");
        }
        System.out.println("textGenerateImg invokeResult:" + JSON.toJSONString(invokeResult));
        String resourceId = result.getResources().get(0).getId();
        TaskResultClientRequest taskResultReq = TaskResultClientRequest.builder().taskId(invokeResult.getTaskId()).build();
        taskResultReq.getResourceIds().add(resourceId);
        Timer timer = new Timer();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskResult taskResult = PixelForceClient.getInstance().getTaskResult(taskResultReq);
                if (taskResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
                    System.out.println("textGenerateImg task finished:" + JSON.toJSONString(taskResult));
                    countDownLatch.countDown();
                    timer.cancel();
                } else if (taskResult.getStatus().equals(ApiStatusEnum.RUNNING.getCode())) {
                    System.out.println("textGenerateImg task running:" + JSON.toJSONString(taskResult));
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public static void main(String[] args) {
        TextGenerateImgSample sample = new TextGenerateImgSample();
        sample.run();
    }
}
