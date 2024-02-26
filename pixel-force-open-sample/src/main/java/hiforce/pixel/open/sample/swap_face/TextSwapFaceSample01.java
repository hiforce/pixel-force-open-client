package hiforce.pixel.open.sample.swap_face;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.swap_face.TextSwapFaceClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author Rocky Yu
 * @since 2024/2/26
 */
public class TextSwapFaceSample01 extends BaseRemoteSample {

    public static void main(String[] args) {
        TextSwapFaceSample01 sample = new TextSwapFaceSample01();
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
        ResourceResult result = PixelForceClient.getInstance().getResourceList(ResourceClientRequest.builder().build());
        if (!result.getStatus().equals(ApiStatusEnum.SUCCESS.getCode()) ||
                CollectionUtils.isEmpty(result.getResources())) {
            throw new RuntimeException("Resources is empty");
        }
        String resourceId = result.getResources().get(0).getId();

        //Upload the Image which face to be replaced
        UploadResult uploadResult = uploadAttachment(resourceId, "/swap_face/01.png");

        TextSwapFaceClientRequest request = new TextSwapFaceClientRequest();
        request.setInputImagePath(uploadResult.getPath());
        request.getPrompt().setMainPositiveWords("French Beauty");
        request.getResult().setRedrawStrength(0.5f);
        request.getResult().setBatchSize(1);
        request.getResourceIds().add(resourceId);
        InvokeResult invokeResult = PixelForceClient.getInstance().textSwapFace(request);

        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Invoke Failed");
        }
        System.out.println("Text Swap Face invoke Result:" + JSON.toJSONString(invokeResult));
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);
    }

}
