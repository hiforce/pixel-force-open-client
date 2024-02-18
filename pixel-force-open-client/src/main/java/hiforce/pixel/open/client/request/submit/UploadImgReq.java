package hiforce.pixel.open.client.request.submit;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author tongwei
 * @Date 2024/1/26 12:02 PM
 * @Version 1.0
 */
public class UploadImgReq extends ClientReqDTO {
    private static final long serialVersionUID = -6108312368781040331L;

    @Getter
    @Setter
    private String imagePath;

    @Override
    public ScenarioType getType() {
        return ScenarioType.UPLOAD_IMG;
    }
}
