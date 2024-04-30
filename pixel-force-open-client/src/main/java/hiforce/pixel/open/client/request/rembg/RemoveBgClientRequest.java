package hiforce.pixel.open.client.request.rembg;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/2/27
 */
@Setter
@Getter
public class RemoveBgClientRequest extends ClientReqDTO {

    private static final long serialVersionUID = 756954615638167890L;

    private String inputImagePath;

    private boolean transparent = true;

    private boolean colorMode = true;

    private String colorHex = "#FFFFFF";

    private String bgImagePath;

    private boolean needMask;

    @Override
    public ScenarioType getType() {
        return ScenarioType.REMOVE_BG;
    }
}
