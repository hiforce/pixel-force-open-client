package hiforce.pixel.open.client.param.result;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class ProgressiveDTO extends BaseParamDTO implements Serializable {

    private static final long serialVersionUID = -6791587098075666942L;

    @Getter
    @Setter
    @InputAutoSetValue
    private boolean enable;

    @Getter
    @Setter
    @InputAutoSetValue
    private float startRedrawStrength = 0.25f;

    @Getter
    @Setter
    @InputAutoSetValue
    private float finalRedrawStrength = 0.9f;

    @Override
    public long getEstTime() {
        return 0;
    }

    @Override
    public String getSignatureStr() {
        return "";
    }
}
