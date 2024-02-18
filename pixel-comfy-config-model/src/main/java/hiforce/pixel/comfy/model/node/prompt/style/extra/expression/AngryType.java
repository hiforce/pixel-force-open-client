package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum AngryType implements IPromptType {
    ANGRY("angry", "生气的"),
    GLARING("glaring", "怒目而视"),
    SERIOUS("serious", "严肃的（和angry有点像）"),
    KUBRICK_STARE("kubrick_stare", "侧头瞪着你"),
    EVIL("evil", "邪恶的"),
    SULKING("sulking", "生_闷气"),
    SCREAMING("screaming", "尖叫|大声喊"),
    SHOUTING("shouting", "喊叫");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    AngryType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
