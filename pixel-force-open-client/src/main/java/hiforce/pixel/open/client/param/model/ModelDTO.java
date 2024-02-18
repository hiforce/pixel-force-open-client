package hiforce.pixel.open.client.param.model;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class ModelDTO extends BaseParamDTO {

    private static final long serialVersionUID = 4607488921963869883L;

    /**
     * 主要底模
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private String mainBaseModel;

    @Getter
    @Setter
    @InputAutoSetValue
    private String lora1name;

    @Getter
    @Setter
    @InputAutoSetValue
    private float lora1strength = 1.0f;

    @Getter
    @Setter
    @InputAutoSetValue
    private String lora2name;

    @Getter
    @Setter
    @InputAutoSetValue
    private float lora2strength = 1.0f;

    @Getter
    @Setter
    @InputAutoSetValue
    private String lora3name;

    @Getter
    @Setter
    @InputAutoSetValue
    private float lora3strength = 1.0f;

    @Override
    public long getEstTime() {
        long est = 20000; //基础模型加载时间
        if (StringUtils.isNotEmpty(getLora1name())
                || StringUtils.isNotEmpty(getLora2name())
                || StringUtils.isNotEmpty(getLora3name())) {
            est += 5000;
        }
        return est;
    }

    @Override
    public String getSignatureStr() {
        return String.format("[model - {name:%s} ]", null == mainBaseModel ? "" : mainBaseModel);
    }
}
