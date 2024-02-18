package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum UnhappyType implements IPromptType {
    FRUSTRATED("frustrated", "沮丧"),
    FRUSTRATED_BROW("frustrated_brow", "沮丧的眉头"),
    ANNOYED("annoyed", "苦恼的"),
    ANGUISH("anguish", "苦闷"),
    SIGH("sigh", "叹气"),
    GLOOM("gloom", "忧郁的"),
    DISAPPOINTED("disappointed", "失望的"),
    DESPAIR("despair", "绝望");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    UnhappyType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
