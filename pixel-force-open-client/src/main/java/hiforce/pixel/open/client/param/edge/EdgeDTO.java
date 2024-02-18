package hiforce.pixel.open.client.param.edge;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class EdgeDTO extends BaseParamDTO {

    private static final long serialVersionUID = -1143033688050325470L;

    @Getter
    @Setter
    @InputAutoSetValue
    private boolean enable;

    /**
     * 边缘检测图片来源
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private EdgeSource source = EdgeSource.ORIGIN;

    @Getter
    @Setter
    @InputAutoSetValue
    private EdgeType edgeType = EdgeType.CANNY;

    /**
     * 边缘强度
     */
    @Getter
    @Setter
    private int edgeStrength = 150;

    /**
     * 纹理强度
     */
    @Getter
    @Setter
    private int textureStrength = 150;

    @Override
    public long getEstTime() {
        if (!enable)
            return 0;
        return 15000;
    }

    @Override
    public String getSignatureStr() {
        return String.format("[edge - {enable:%s, type: %s}]", enable, null == edgeType ? "" : edgeType.name());
    }
}
