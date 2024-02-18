package hiforce.pixel.open.client.param.edge;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public enum EdgeType implements IIntType {

    SOFT_EDGE(1, "Soft Edge", "强边缘固定"),
    CANNY(2, "Canny", "均衡固定");

    @Getter
    private final int value;
    @Getter
    private final String text;

    @Getter
    private final String textCn;

    EdgeType(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }

}
