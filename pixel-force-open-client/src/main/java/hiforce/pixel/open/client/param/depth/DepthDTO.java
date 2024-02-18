package hiforce.pixel.open.client.param.depth;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class DepthDTO extends BaseParamDTO {

    private static final long serialVersionUID = 4800988150768859077L;

    @Getter
    @Setter
    @InputAutoSetValue
    private boolean enable;

    @Getter
    @Setter
    @InputAutoSetValue
    private DepthSource source = DepthSource.ORIGIN;

    @Getter
    @Setter
    @InputAutoSetValue
    private DepthType type = DepthType.BALANCED;

    @Getter
    @Setter
    @InputAutoSetValue
    private String specificImagePath;

    @Override
    public long getEstTime() {
        if (!enable) {
            return 0;
        }
        return 25000;
    }

    @Override
    public String getSignatureStr() {
        return String.format("[depth - {enable:%s, type: %s}]", enable, null == type ? "" : type.name());
    }
}
