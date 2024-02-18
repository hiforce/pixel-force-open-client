package hiforce.pixel.open.client.param.edge;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/28
 */
public enum EdgeSource implements IIntType {
    ORIGIN(1, "Origin", "原图"),
    MASK(2, "Mask", "蒙版"),
    SPECIFIC(3, "Specific", "指定图片");

    @Getter
    private final int value;
    @Getter
    private final String text;
    @Getter
    private final String textCn;

    EdgeSource(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }
}
