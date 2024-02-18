package hiforce.pixel.open.client.param.depth;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public enum DepthType implements IIntType {

    NEAR_FOCUS(1, "Near Focus", "近景优先"),
    FAR_FOCUS(2, "Far Up", "远景优先"),
    BALANCED(3, "Balanced ", "均衡模式");

    @Getter
    private final int value;

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    DepthType(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }

}
