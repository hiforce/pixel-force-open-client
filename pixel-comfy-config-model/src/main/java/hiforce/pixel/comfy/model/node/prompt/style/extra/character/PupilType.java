package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum PupilType implements IPromptType {
    PUPILS("pupils", "瞳孔"),
    BRIGHT_PUPILS("bright_pupils", "明亮的瞳孔"),
    HETEROCHROMIA("heterochromia", "异色瞳"),
    SLIT_PUPILS("slit_pupils", "竖的瞳孔/猫眼"),
    SNAKE_PUPILS("snake_pupils", "瞳孔闪光"),
    SYMBOL_SHAPED_PUPILS("symbol-shaped_pupils", "符号形瞳孔"),
    HEART_SHAPED_PUPILS("heart-shaped_pupils", "爱心形瞳孔"),
    DIAMOND_SHAPED_PUPILS("diamond-shaped_pupils", "钻石形状瞳孔"),
    STAR_SHAPED_PUPILS("star-shaped_pupils", "五角星形状瞳孔"),
    DILATED_PUPILS("dilated_pupils", "瞳孔散大"),
    NO_PUPILS("no_pupils", "没有瞳孔"),
    RINGED_EYES("ringed_eyes", "轮回眼"),
    CONSTRICTED_PUPILS("constricted_pupils", "收缩的瞳孔(没有效果"),
    STAR_IN_EYE("star_in_eye", "眼睛里的星星"),
    X_SHAPED_PUPILS("x-shaped_pupils", "X形瞳孔"),
    HORIZONTAL_PUPILS("horizontal_pupils", "水平瞳孔"),
    DASHED_EYES("dashed_eyes", "虚线的眼睛"),
    BUTTERFLY_SHAPED_PUPILS("butterfly-shaped_pupils", "蝴蝶形瞳孔"),
    RECTANGULAR_PUPILS("rectangular_pupils", "长方形瞳孔"),
    SQUARE_PUPILS("square_pupils", "方形瞳孔"),
    DOT_PUPILS("dot_pupils", "点瞳孔"),
    EXTRA_PUPILS("extra_pupils", "额外的瞳孔"),
    MISMATCHED_PUPILS("mismatched_pupils", "不匹配的瞳孔"),
    CROSS_STAR_EYE("+_+", "十字星星眼"),
    CROSS_SHAPED_PUPILS("cross-shaped_pupils", "符号形瞳孔(没有效果"),
    PURPLE_PUPILS("purple_pupils", "紫色瞳孔"),
    ORANGE_PUPILS("orange_pupils", "橙色瞳孔"),
    BLUE_PUPILS("blue_pupils", "橙色瞳孔"),
    SYMBOL_IN_EYE("symbol_in_eye", "眼睛里有符号");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    PupilType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
