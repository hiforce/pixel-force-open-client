package hiforce.pixel.open.client.param.system;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/1/24
 */
public class SystemDTO extends BaseParamDTO {

    private static final long serialVersionUID = 4293338894729146662L;

    @Getter
    @Setter
    @InputAutoSetValue
    private String vae = "Baked VAE";

    @Override
    public long getEstTime() {
        return 0;
    }

    @Override
    public String getSignatureStr() {
        return "";
    }
}
