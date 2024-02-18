package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum BackgroundType implements IPromptType {
    FANTASY("fantasy", "幻想风格"),
    BAN("ban", "科技幻想"),
    CYBERPUNK("cyberpunk", "赛博朋克"),
    DEPTH_OF_FIELD("depth_of_field", "景深(画法)"),
    BLURRY("blurry", "背景模糊"),
    BLURRY_FOREGROUND("blurry_foreground", "前景模糊"),
    SIMPLE_BACKGROUND("simple_background", "简单的背景"),
    BLACK_BACKGROUND("black_background", "黑色背景"),
    WHITE_BACKGROUND("white_background", "白色背景"),
    TRANSPARENT_BACKGROUND("transparent_background", "透明背景"),
    BEIGE_BACKGROUND("beige_background", "米色背景"),
    BROWN_BACKGROUND("brown_background", "棕色背景"),
    TAN_BACKGROUND("tan_background", "棕褐色背景"),
    GREY_BACKGROUND("grey_background", "灰色背景"),
    TWO_TONE_BACKGROUND("two-tone_background", "双色调背景"),
    GRADIENT_BACKGROUND("gradient_background", "渐变的背景"),
    MULTICOLORED_BACKGROUND("multicolored_background", "多彩的背景"),
    RAINBOW_BACKGROUND("rainbow_background", "彩虹背景"),
    ABSTRACT_BACKGROUND("abstract_background", "抽象背景"),
    ARGYLE_BACKGROUND("argyle_background", "菱形背景"),
    CHECKERED_BACKGROUND("checkered_background", "方格背景"),
    FLORAL_BACKGROUND("floral_background", "花朵点缀的背景"),
    HALFTONE_BACKGROUND("halftone_background", "网点图背景"),
    HEART_BACKGROUND("heart_background", "桃色背景"),
    HONEYCOMB_BACKGROUND("honeycomb_background", "蜂窝风格背景"),
    PLAID_BACKGROUND("plaid_background", "格子呢背景"),
    POLKA_DOT("polka_dot", "圆斑背景"),
    STRIPED_BACKGROUND("striped_background", "圆斑背景"),
    SCENERY("scenery", "风景"),
    LANDSCAPE("landscape", "景观"),
    FORAL_BACKGROUND("foral_background", "花卉图案装饰的背景"),
    CROP_TOP_OVERHANG("crop_top_overhang", "作物顶部悬垂"),
    STARRY_BACKGROUND("starry_background", "星空背景"),
    SPARKLE_BACKGROUND("sparkle_background", "闪着星光的背景"),
    CITYSCAPE("cityscape", "城市背景"),
    CITY_LIGHTS("city_lights", "城市灯光背景"),
    CLOCK_BACKGROUND("clock_background", "时钟背景"),
    BUBBLE_BACKGROUND("bubble_background", "气泡背景"),
    BORDER("border", "边框"),
    PILLARBOXED("pillarboxed", "柱状画布背景"),
    ROUNDED_CORNERS("rounded_corners", "背景或画框是圆角"),
    VIEWFINDER("viewfinder", "相机取景框"),
    WINDOWBOXED("windowboxed", "套着画框(背景)"),
    OUTSIDE_BORDER("outside_border", "一部分画到了背景框外"),
    FLASHBACK("flashback", "回忆场景"),
    WALL_OF_TEXT("wall_of_text", "文字背景"),
    BACKGROUND_TEXT("background_text", "背景文字");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    BackgroundType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
