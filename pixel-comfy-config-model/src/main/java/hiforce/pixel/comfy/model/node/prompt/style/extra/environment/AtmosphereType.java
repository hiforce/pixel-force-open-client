package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum AtmosphereType implements IPromptType {
    NEW_YEAR("new year", "新年", "new year"),
    YEAR_OF_THE_RABBIT("year of the rabbit", "兔年", "year of the rabbit"),
    VALENTINE("valentine", "情人节", "valentine"),
    LANTERN_FESTIVAL("lantern festival", "元宵节", "lantern festival"),
    SUMMER_FESTIVAL("summer festival", "夏日祭", "summer festival"),
    TANABATA("tanabata", "七夕节", "tanabata"),
    MID_AUTUMN_FESTIVAL("mid-autumn festival", "中秋节", "mid-autumn festival"),
    HALLOWEEN("halloween", "万圣节", "halloween"),
    CHRISTMAS("christmas", "圣诞节", "christmas"),
    EXPLOSION("explosion", "爆炸", "explosion"),
    WATER_VAPOR("water vapor", "蒸汽", "water vapor"),
    FIREWORKS("fireworks", "焰火", "fireworks"),
    CEILING_WINDOW("ceiling window", "落地窗", "ceiling window"),
    COLOURFUL_GLASS("colourful glass", "彩色玻璃", "colourful glass"),
    STAIN_GLASS("stain glass", "染色玻璃", "stain glass"),
    GRAFFITI_WALL("Graffiti wall", "涂鸦墙", "Graffiti wall"),
    MOSAIC_BACKGROUND("mosaic background", "马赛克背景", "mosaic background"),
    LIQUID_BACKGROUND_SPUTTERED_WATER("liquid background, Sputtered water", "液体背景", "liquid background, Sputtered water"),
    MAGIC_CIRCLES("magic circles", "魔法环", "magic circles"),
    FLUORESCENT_MUSHROOM_FORESTS_BACKGROUND("fluorescent mushroom forests background", "荧光蘑菇森林", "fluorescent mushroom forests background"),
    COLORFUL_BUBBLE("(((colorful bubble)))", "彩色泡泡", "(((colorful bubble)))"),
    IN_THE_OCEAN("in the ocean", "海边日落", "in the ocean"),
    AGAINST_BACKLIGHT_AT_DUSK("against backlight at dusk", "傍晚背对阳光", "against backlight at dusk"),
    GOLDEN_HOUR_LIGHTING("golden hour lighting", "黄金时段照明", "golden hour lighting"),
    STRONG_RIM_LIGHT("strong rim light", "强边缘光", "strong rim light"),
    INTENSE_SHADOWS("intense shadows", "强阴影", "intense shadows");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    AtmosphereType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
