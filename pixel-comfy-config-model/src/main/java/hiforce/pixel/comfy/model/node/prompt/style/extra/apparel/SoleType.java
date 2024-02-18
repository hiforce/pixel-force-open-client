package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SoleType implements IPromptType {
    SHOE_SOLES("shoe_soles", "鞋底"),
    ARCHED_SOLES("arched_soles", "拱形鞋底"),
    PAW_PRINT_SOLES("paw_print_soles", "爪印鞋底"),
    HORSESHOE("horseshoe", "马蹄铁");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SoleType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }

}
