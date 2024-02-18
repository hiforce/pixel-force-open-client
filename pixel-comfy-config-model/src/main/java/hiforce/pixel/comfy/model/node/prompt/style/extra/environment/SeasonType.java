package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SeasonType implements IPromptType {
    IN_SPRING("in spring", "春天", "in spring"),
    IN_SUMMER("in summer", "夏天", "in summer"),
    IN_AUTUMN("in autumn", "秋天", "in autumn"),
    IN_WINTER("in winter", "冬天", "in winter"),
    AUTUMN_SCENERY("autumn scenery", "秋景", "(autumn maple forest:1.3),(very few fallen leaves),(path)");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SeasonType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
