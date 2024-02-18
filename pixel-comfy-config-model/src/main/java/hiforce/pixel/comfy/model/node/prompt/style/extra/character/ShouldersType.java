package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum ShouldersType implements IPromptType {
    BARE_SHOULDERS("bare shoulders", "赤肩"),
    COLLARBONEA("collarbonea", "锁骨"),
    ARMPITS("armpits", "腋下"),
    ARMPIT_CREASE("armpit_crease", "腋窝皱痕");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ShouldersType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
