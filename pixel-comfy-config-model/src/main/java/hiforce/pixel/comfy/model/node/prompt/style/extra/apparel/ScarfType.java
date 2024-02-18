package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ScarfType implements IPromptType {
    PLAID_SCARF("plaid_scarf", "格子围巾"),
    STRIPED_SCARF("striped_scarf", "条纹围巾"),
    PRINT_SCARF("print_scarf", "印花围巾"),
    VERTICAL_STRIPED_SCARF("vertical-striped_scarf", "竖条纹围巾"),
    POLKA_DOT_SCARF("polka_dot_scarf", "波点围巾"),
    ARGYLE_SCARF("argyle_scarf", "菱形围巾"),
    BEIGE_SCARF("beige_scarf", "米色围巾"),
    SCARF_BOW("scarf_bow", "围巾蝴蝶结"),
    FUR_SCARF("fur_scarf", "皮草围巾"),
    NAKED_SCARF("naked_scarf", "裸围巾"),
    MULTICOLORED_SCARF("multicolored_scarf", "五彩围巾"),
    FLOATING_SCARF("floating_scarf", "漂浮围巾"),
    LONG_SCARF("long_scarf", "长围巾"),
    ARM_SCARF("arm_scarf", "手臂围巾"),
    SCARF_ON_HEAD("scarf_on_head", "头上的围巾"),
    SCARF_OVER_MOUTH("scarf_over_mouth", "围巾在嘴上"),
    SCARF_REMOVED("scarf_removed", "围巾被取下"),
    ADJUSTING_SCARF("adjusting_scarf", "调整围巾"),
    HOLDING_SCARF("holding_scarf", "拿着围巾"),
    SCARF_PULL("scarf_pull", "扯围巾"),
    BROWN_SCARF("brown_scarf", "棕色围巾"),
    SCARF("scarf", "围巾");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ScarfType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
