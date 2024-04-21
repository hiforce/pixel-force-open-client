package hiforce.pixel.open.client.param.style;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2024/4/21
 */
@Getter
public enum ReferStyleStrength implements IIntType {

    NORMAL(1),
    MIDDLE(2),
    STRONG(3);

    private final int value;

    ReferStyleStrength(int value) {
        this.value = value;
    }

    public static ReferStyleStrength of(int value) {
        for (ReferStyleStrength style : ReferStyleStrength.values()) {
            if (style.value == value) {
                return style;
            }
        }
        return null;
    }
}