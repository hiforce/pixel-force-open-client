package hiforce.pixel.open.client.param.result;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public enum ClarityType implements IIntType {
    NORMAL(1,"Normal", "普清"),
    HD(2, "HD", "高清");

    @Getter
    private final int value;
    @Getter
    private final String text;
    @Getter
    private final String textCn;

    ClarityType(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }
}
