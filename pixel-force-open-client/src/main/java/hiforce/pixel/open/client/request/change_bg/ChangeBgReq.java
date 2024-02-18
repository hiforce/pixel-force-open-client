package hiforce.pixel.open.client.request.change_bg;

import hiforce.pixel.open.client.param.depth.DepthDTO;
import hiforce.pixel.open.client.param.edge.EdgeDTO;
import hiforce.pixel.open.client.param.mode.ModeType;
import hiforce.pixel.open.client.param.prompt.PromptDTO;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author tongwei
 * @Date 2023/12/27 4:14 PM
 * @Version 1.0
 */
public class ChangeBgReq extends ClientReqDTO {

    private static final long serialVersionUID = -1050607719840203544L;

    @Getter
    @Setter
    private ModeType mode = ModeType.AUTO;

    @Getter
    @Setter
    private String inputImagePath;

    @Getter
    @Setter
    private boolean enableMask = false;

    /**
     * invert mask = false时，黑色区域保留
     * invert mask = true时，白色区域保留
     */
    @Getter
    @Setter
    private boolean invertMask = false;

    @Getter
    @Setter
    private String maskImagePath;

    @Getter
    @Setter
    private boolean fixEdge = true;

    @Getter
    private final EdgeDTO edge = new EdgeDTO();

    @Getter
    private final DepthDTO depth = new DepthDTO();

    @Getter
    private final PromptDTO prompt = new PromptDTO();

    @Override
    public ScenarioType getType() {
        return ScenarioType.CHANGE_BG;
    }
}
