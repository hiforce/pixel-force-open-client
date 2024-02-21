package hiforce.pixel.open.client.request.text2Img;

import hiforce.pixel.comfy.model.common.ImageSize;
import hiforce.pixel.open.client.param.model.ModelDTO;
import hiforce.pixel.open.client.param.pose.PoseDTO;
import hiforce.pixel.open.client.param.prompt.PromptDTO;
import hiforce.pixel.open.client.param.result.ResultDTO;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/11/18
 */
public class Text2ImgClientRequest extends ClientReqDTO {

    private static final long serialVersionUID = 4847655871120039611L;

    @Getter
    @Setter
    private ImageSize size = ImageSize.SIZE_768_1;

    @Getter
    @Setter
    private int width;

    @Getter
    @Setter
    private int height;

    @Getter
    @Setter
    private PromptDTO prompt = new PromptDTO();

    @Getter
    @Setter
    private ModelDTO model = new ModelDTO();

    @Getter
    @Setter
    private PoseDTO pose = new PoseDTO();

    @Getter
    @Setter
    private ResultDTO result = new ResultDTO();

    @Override
    public ScenarioType getType() {
        return ScenarioType.TXT_2_IMG;
    }
}
