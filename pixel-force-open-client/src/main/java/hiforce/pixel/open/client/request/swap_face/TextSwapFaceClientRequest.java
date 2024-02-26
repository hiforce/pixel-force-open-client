package hiforce.pixel.open.client.request.swap_face;

import hiforce.pixel.open.client.param.model.ModelDTO;
import hiforce.pixel.open.client.param.prompt.PromptDTO;
import hiforce.pixel.open.client.param.result.ResultDTO;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

import static hiforce.pixel.open.client.request.ScenarioType.TEXT_SWAP_FACE;

/**
 * @author Rocky Yu
 * @since 2024/2/26
 */
public class TextSwapFaceClientRequest extends ClientReqDTO {

    private static final long serialVersionUID = -7352486924898288237L;

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

    /**
     * 之前已经存在的蒙版地址
     */
    @Getter
    @Setter
    private String maskImagePath;

    @Getter
    @Setter
    private ModelDTO model = new ModelDTO();

    @Getter
    @Setter
    private PromptDTO prompt = new PromptDTO();

    @Getter
    @Setter
    private ResultDTO result = new ResultDTO();

    @Override
    public ScenarioType getType() {
        return TEXT_SWAP_FACE;
    }
}
