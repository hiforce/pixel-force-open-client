package hiforce.pixel.open.client.request.reserve_cloth;

import hiforce.pixel.open.client.param.depth.DepthDTO;
import hiforce.pixel.open.client.param.edge.EdgeDTO;
import hiforce.pixel.open.client.param.mode.ModeType;
import hiforce.pixel.open.client.param.mode.ReserveClothType;
import hiforce.pixel.open.client.param.prompt.PromptDTO;
import hiforce.pixel.open.client.param.result.ResultDTO;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

public class ReserveClothClientRequest extends ClientReqDTO {

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
    private boolean fixEdge = false;

    @Getter
    @Setter
    private EdgeDTO edge = new EdgeDTO();

    @Getter
    @Setter
    private DepthDTO depth = new DepthDTO();

    @Getter
    @Setter
    private PromptDTO prompt = new PromptDTO();

    @Getter
    @Setter
    private ResultDTO result = new ResultDTO();

    @Override
    public ScenarioType getType() {
        return ScenarioType.RESERVE_CLOTH;
    }
}
