package hiforce.pixel.open.client.param.depth;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/28
 */
public enum DepthSource implements IIntType {
    ORIGIN(1, "Origin", "原图景深"),
    TEMPLATE(2, "Specific", "模板景深");

    @Getter
    private final int value;
    @Getter
    private final String text;
    @Getter
    private final String textCn;

    DepthSource(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }
}
