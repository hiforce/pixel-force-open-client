package hiforce.pixel.open.client.request.reserve_cloth;

import hiforce.pixel.open.client.param.depth.DepthDTO;
import hiforce.pixel.open.client.param.edge.EdgeDTO;
import hiforce.pixel.open.client.param.mode.ModeType;
import hiforce.pixel.open.client.param.mode.ReserveClothType;
import hiforce.pixel.open.client.param.prompt.PromptDTO;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;
public class ReserveClothReq extends ClientReqDTO {

    private static final long serialVersionUID = -3336375738426671088L;

    @Getter
    @Setter
    private ModeType mode = ModeType.AUTO;

    @Getter
    @Setter
    private ReserveClothType reserveClothType = ReserveClothType.PERFECT;

    @Getter
    @Setter
    private String inputImagePath;

    @Getter
    @Setter
    private boolean enableMask = false;

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
        return ScenarioType.RESERVE_CLOTH;
    }
}
