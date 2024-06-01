package hiforce.pixel.open.client.param.prompt;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.comfy.model.mapping.InputField;
import hiforce.pixel.comfy.model.mapping.InputMapping;
import hiforce.pixel.comfy.model.node.prompt.style.*;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
@Setter
@Getter
public class PromptDTO extends BaseParamDTO {

    private static final long serialVersionUID = 5288857969930443641L;

    /**
     * 主要风格选择
     */
    @InputAutoSetValue
    private PromptStyleType mainStyle;

    /**
     * 主要画风选择
     */
    @InputAutoSetValue
    private PaintStyleType paintStyle = PaintStyleType.BASE;

    /**
     * 结构选择
     */
    @InputAutoSetValue
    private PromptFrameType frameType;

    /**
     * 光线类型选择
     */
    @InputAutoSetValue
    private PromptLightingType lightingType;

    /**
     * 相机角度选择
     */
    @InputAutoSetValue
    private CameraAngleType cameraAngle;

    /**
     * 镜头类型设置
     */
    @InputAutoSetValue
    private CameraPropertyType cameraProperty;

    /**
     * 焦距设置
     */
    @InputAutoSetValue
    private PromptLensesType lensesType;

    /**
     * 胶卷类型选择
     */
    @InputAutoSetValue
    private PromptFilmType filmType;

    /**
     * 滤镜特效
     */
    @InputAutoSetValue
    private PromptFilterEffectType filterEffect;

    /**
     * 大师风格类型
     */
    @InputAutoSetValue
    private PhotographerType photographer;


    /**
     * 主要正向提示词
     */
    @InputAutoSetValue
    private String mainPositiveWords;

    /**
     * 主要负向提示词
     */
    @InputAutoSetValue
    private String mainNegativeWords;

    /**
     * 额外风格设置
     */
    private StylePromptDTO extraStyle = new StylePromptDTO();

    @Override
    public long getEstTime() {
        return 1000;
    }

    @Override
    public String getSignatureStr() {
        return "";
    }

    @Override
    public List<InputField> toInputFields(InputMapping mapping) {
        List<InputField> values = super.toInputFields(mapping);
        values.addAll(extraStyle.toInputFields(mapping));
        return values;
    }
}
