package hiforce.pixel.open.client.param.prompt;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.comfy.model.node.prompt.style.extra.*;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class StylePromptDTO extends BaseParamDTO {

    private static final long serialVersionUID = -251856002891344220L;

    /**
     * 拍摄角度
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private ShotType shotType = ShotType.None;

    /**
     * 画面风格
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private CameraOption cameraOption = CameraOption.None;

    @Getter
    @Setter
    @InputAutoSetValue
    private MagicStyleType magicType = MagicStyleType.None;

    /**
     * 天气类型
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private WeatherType weatherType = WeatherType.None;

    /**
     * 情绪类型
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private EmotionType emotionType = EmotionType.None;

    /**
     * 材质类型
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private MaterialType materialType = MaterialType.None;

    @Override
    public long getEstTime() {
        return 0;
    }

    @Override
    public String getSignatureStr() {
        return "";
    }
}
