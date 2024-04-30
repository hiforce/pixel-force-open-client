package hiforce.pixel.open.sample.upscale;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.rembg.RemoveBgClientRequest;
import hiforce.pixel.open.client.request.upscale.UpscaleImageRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;

/**
 * @author Rocky Yu
 * @since 2024/2/27
 */
public class UpscaleBgSample01 extends BaseRemoteSample {

    public static void main(String[] args) {
        UpscaleBgSample01 sample = new UpscaleBgSample01();
        sample.run();
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

        UploadResult uploadResult = uploadAttachment(resourceId, "/upscale/01.png");

        UpscaleImageRequest request = new UpscaleImageRequest();
        request.setInputImagePath(uploadResult.getPath());

        InvokeResult invokeResult = PixelForceClient.getInstance().upscaleTo4xUltraSharp(request);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Failed to invoke Upscale Image");
        }

        System.out.println("Upscale Image InvokeResult:" + JSON.toJSONString(invokeResult));
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);

    }
}
