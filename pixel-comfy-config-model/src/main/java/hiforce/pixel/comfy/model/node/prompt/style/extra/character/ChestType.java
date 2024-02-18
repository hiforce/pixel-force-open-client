package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum ChestType implements IPromptType {
    CHEST("chest", "胸部"),
    FLAT_CHEST("flat chest", "贫乳(A_)"),
    SMALL_BREASTS("small_breasts", "小胸部(B)"),
    MEDIUM_BREASTS("medium breasts", "中等胸部(C)"),
    BIG_BREASTS("big breasts", "大胸部(D)"),
    HUGE_BREASTS("huge breasts", "巨乳(E)"),
    BETWEEN_BREASTS("between breasts", "两胸之间"),
    PECTORALS("pectorals", "胸肌"),
    LARGE_PECTORALS("large_pectorals", "大胸肌"),;
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ChestType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
