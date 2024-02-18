package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptLensesType implements IStyleType {

    LENSES_50MM("50mm",  "PROMPT-LENSES-TYPE-50MM"),
    LENSES_8MM_FISHEYE("8mm Fisheye Lens",  1.2f, "PROMPT-LENSES-TYPE-8MM_FISHEYE"),
    VOIGTLANDER_NOKTON_50_MM_F_1_1("Nokton 50mm f1.1",  "PROMPT-LENSES-TYPE-VOIGTLANDER_NOKTON_50_MM_F_1_1");
    @Getter
    private final String value;

    @Getter
    private final String descKey;


    @Getter
    private Float weight;

    PromptLensesType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }
    PromptLensesType(String value, Float weight, String descKey) {
        this.value = value;
        this.weight = weight;
        this.descKey = descKey;
    }
}
