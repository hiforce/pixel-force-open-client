package hiforce.pixel.open.client.param.pose;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class PoseDTO extends BaseParamDTO {

    private static final long serialVersionUID = -7754580074248349513L;

    @Getter
    @Setter
    @InputAutoSetValue
    private boolean enable;

    @Getter
    @Setter
    @InputAutoSetValue
    private String specificPosePath;


    @Override
    public long getEstTime() {
        if (!enable)
            return 0;
        return 20000;
    }

    @Override
    public String getSignatureStr() {
        return String.format("[pose - {enable:%s} ]", enable);
    }
}
