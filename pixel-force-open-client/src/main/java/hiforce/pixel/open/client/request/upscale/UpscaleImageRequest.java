package hiforce.pixel.open.client.request.upscale;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/4/30
 */
@Getter
@Setter
public class UpscaleImageRequest extends ClientReqDTO {

    @Override
    public ScenarioType getType() {
        return ScenarioType.UPSCALE_4X_ULTRA_SHARP;
    }

    private String inputImagePath;

    private boolean enableMask = false;

    private String maskImagePath;
}
