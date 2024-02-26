package hiforce.pixel.open.sample.common;

import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.submit.UploadImageClientRequest;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.sample.change_bg.ChangeBgSample;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

/**
 * @author Rocky Yu
 * @since 2024/2/26
 */
public abstract class BaseSample {

    public abstract void execute() throws Exception;


    public UploadResult uploadAttachment(String resourceId, String resourcePath) {
        UploadImageClientRequest uploadImgReq = new UploadImageClientRequest();
        uploadImgReq.getResourceIds().add(resourceId);
        uploadImgReq.setImagePath(Objects.requireNonNull(
                ChangeBgSample.class.getResource(resourcePath)).getPath());
        UploadResult uploadResult = PixelForceClient.getInstance().uploadImage(uploadImgReq);
        if (!uploadResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Failed to upload attachment");
        }
        return uploadResult;
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
