package hiforce.pixel.open.client.request.rembg;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/2/27
 */
public class RemoveBgClientRequest extends ClientReqDTO {

    private static final long serialVersionUID = 756954615638167890L;

    @Getter
    @Setter
    private String inputImagePath;

    @Getter
    @Setter
    private boolean transparent = true;

    @Getter
    @Setter
    private boolean colorMode = true;

    @Getter
    @Setter
    private String colorHex = "#FFFFFF";

    @Getter
    @Setter
    private String bgImagePath;

    @Getter
    @Setter
    private boolean needMask;

    @Override
    public ScenarioType getType() {
        return ScenarioType.REMOVE_BG;
    }
}
