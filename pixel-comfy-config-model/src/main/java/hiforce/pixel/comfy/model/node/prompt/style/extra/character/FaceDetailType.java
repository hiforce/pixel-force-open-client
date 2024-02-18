package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum FaceDetailType implements IPromptType {
    MAKEUP("makeup", "化妆"),
    FUNDOSHI("fundoshi", "粉底"),
    EYESHADOW("eyeshadow", "眼影"),
    LIPSTICK("lipstick", "口红"),
    MASCARA("mascara", "睫毛膏"),
    LONG_EYELASHES("long_eyelashes", "长睫毛"),
    RED_LIPS_("red_lips_", "红唇"),
    FACEPAINT("facepaint", "面部涂装"),
    LIPGLOSS("lipgloss", "唇彩"),
    COLORED_EYELASHES("colored_eyelashes", "彩色睫毛"),
    BLUSH("blush", "脸红"),
    LIGHT_BLUSH("light_blush", "淡淡的腮红"),
    ANIME_STYLE_BLUSH("anime_style_blush", "动画式脸红"),
    NOSE_BLUSH("nose_blush", "鼻腮红"),
    NOSEBLEED("nosebleed", "鼻血"),
    BRUISE_ON_FACE("bruise_on_face", "脸上有瘀伤"),
    FACIAL_MARK("facial_mark", "面部标记"),
    FOREHEAD_MARK("forehead_mark", "额头标记"),
    ANGER_VEIN("anger_vein", "头部愤怒符号"),
    MOLE("mole", "痣"),
    MOLE_UNDER_EYE("mole_under_eye", "眼睛下方的痣"),
    FRECKLES("freckles", "雀斑"),
    FOOD_ON_FACE("food_on_face", "食物在脸上"),
    RICE_ON_FACE("rice_on_face", "饭在脸上"),
    CREAM_ON_FACE("cream_on_face", "奶油在脸上"),
    MUSTACHE("mustache", "小胡子"),
    GOATEE("goatee", "山羊胡"),
    WHISKER_MARKINGS("whisker_markings", "胡须斑纹"),
    SCAR("scar", "疤痕"),
    SCAR_ACROSS_EYE("scar_across_eye", "穿过眼睛的疤痕"),
    SMOKING_PIPE("smoking_pipe", "烟斗"),
    TATTOO("tattoo on face", "纹身");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    FaceDetailType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
