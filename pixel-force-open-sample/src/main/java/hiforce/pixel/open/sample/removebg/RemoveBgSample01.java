package hiforce.pixel.open.sample.removebg;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.rembg.RemoveBgClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;

/**
 * @author Rocky Yu
 * @since 2024/2/27
 */
public class RemoveBgSample01 extends BaseRemoteSample {

    public static void main(String[] args) {
        RemoveBgSample01 changeBgSample = new RemoveBgSample01();
        changeBgSample.run();
    }

    @Override
    public String getAccessKey() {
        return "YOUR_ACCESS_KEY";
    }

    @Override
    public String getAccessSecret() {
        return "YOUR_ACCESS_SECRET";
    }

    @Override
    public void execute() throws Exception {
        ResourceResult result = getFirstAvailableResource();
        String resourceId = result.getResources().get(0).getId();

        UploadResult uploadResult = uploadAttachment(resourceId, "/remove_bg/01.png");

        RemoveBgClientRequest request = new RemoveBgClientRequest();
        request.setInputImagePath(uploadResult.getPath());
        request.setTransparent(true);
        request.setNeedMask(true);

        InvokeResult invokeResult = PixelForceClient.getInstance().removeBackground(request);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Failed to invoke Remove BG");
        }

        System.out.println("Remove Bg InvokeResult:" + JSON.toJSONString(invokeResult));
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);

    }
}
