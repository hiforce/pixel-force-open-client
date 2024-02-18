package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum BellyTpe implements IPromptType {
    MIDRIFF("midriff", "腹部"),
    BELLY("belly", "肚子"),
    ABSOLUTE_TERRITORY("absolute_territory", "腹肌"),
    INFLATION("inflation", "隆起的腹部"),
    NAVEL("navel", "肚脐"),
    GROIN("groin", "腹股沟"),
    PREGNANT("pregnant", "怀孕");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    BellyTpe(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
