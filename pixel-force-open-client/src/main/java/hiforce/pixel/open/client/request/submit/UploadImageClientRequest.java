package hiforce.pixel.open.client.request.submit;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;
public class UploadImageClientRequest extends ClientReqDTO {
    private static final long serialVersionUID = -6108312368781040331L;

    @Getter
    @Setter
    private String imagePath;

    @Override
    public ScenarioType getType() {
        return ScenarioType.UPLOAD_IMG;
    }
}
