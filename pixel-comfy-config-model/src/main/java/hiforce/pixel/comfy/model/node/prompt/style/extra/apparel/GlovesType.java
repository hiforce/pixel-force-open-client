package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum GlovesType implements IPromptType {
    GLOVES("gloves", "手套"),
    GLOVES_REMOVED("gloves_removed", "脱下手套"),
    NO_GLOVES("no_gloves", "去掉了(原设有的)手套"),
    SINGLE_GLOVE("single_glove", "单只手套"),
    SINGLE_ELBOW_GLOVE("single_elbow_glove", "单手戴着过肘的手套"),
    LONG_GLOVES("long_gloves", "长手套"),
    ELBOW_GLOVES("elbow_gloves", "长袖手套（肘部手套）"),
    BRIDAL_GAUNTLETS("bridal_gauntlets", "新娘手套"),
    HALF_GLOVES("half_gloves", "很短的手套|半截手套"),
    FINGERLESS_GLOVES("fingerless_gloves", "露指手套"),
    PARTIALLY_FINGERLESS_GLOVES("partially_fingerless_gloves", "部分露指手套"),
    PAW_GLOVES("paw_gloves", "爪子手套(分指手套)"),
    MITTENS("mittens", "连指手套(两指手套)"),
    BASEBALL_MITT("baseball_mitt", "棒球手套"),
    FUR_TRIMMED_GLOVES("fur-trimmed_gloves", "毛边手套"),
    LATEX_GLOVES("latex_gloves", "乳胶手套"),
    LACE_TRIMMED_GLOVES("lace-trimmed_gloves", "蕾丝边手套"),
    LEATHER_GLOVES("leather_gloves", "皮手套"),
    FRILLED_GLOVES("frilled_gloves", "花边手套"),
    MISMATCHED_GLOVES("mismatched_gloves", "双色手套"),
    MULTICOLORED_GLOVES("multicolored_gloves", "多色款手套"),
    ASYMMETRICAL_GLOVES("asymmetrical_gloves", "不对称的手套"),
    BROWN_GLOVES("brown_gloves", "棕色手套"),
    OVEN_MITTS("oven_mitts", "隔热手套"),
    PRINT_GLOVES("print_gloves", "印花手套"),
    STRIPED_GLOVES("striped_gloves", "条纹手套"),
    TORN_GLOVES("torn_gloves", "破损的手套");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    GlovesType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
