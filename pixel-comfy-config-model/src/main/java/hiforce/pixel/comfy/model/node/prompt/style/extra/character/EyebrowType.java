package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum EyebrowType implements IPromptType {
    THICK_EYEBROWS("thick eyebrows", "浓眉"),
    COCKED_EYEBROW("cocked eyebrow", "眉毛翘起"),
    SHORT_EYEBROWS("short eyebrows", "短眉毛"),
    V_SHAPED_EYEBROWS("v-shaped eyebrows", "V字眉");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    EyebrowType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
