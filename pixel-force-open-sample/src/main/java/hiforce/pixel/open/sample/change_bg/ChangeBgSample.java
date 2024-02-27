package hiforce.pixel.open.sample.change_bg;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.comfy.model.node.prompt.style.extra.MagicStyleType;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.change_bg.ChangeBgClientRequest;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;

public class ChangeBgSample extends BaseRemoteSample {

    @Override
    public String getAccessKey() {
        return "YOUR_ACCESS_KEY";
    }

    @Override
    public String getAccessSecret() {
        return "YOUR_ACCESS_SECRET";
    }

    public void execute() throws Exception {
        ResourceResult result = getFirstAvailableResource();
        String resourceId = result.getResources().get(0).getId();
        UploadResult uploadResult = uploadAttachment(resourceId, "/changeBg.png");

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
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);
    }

    public static void main(String[] args) {
        ChangeBgSample changeBgSample = new ChangeBgSample();
        changeBgSample.run();
    }
}
