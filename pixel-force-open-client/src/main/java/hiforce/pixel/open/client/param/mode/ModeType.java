package hiforce.pixel.open.client.param.mode;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public enum ModeType implements IIntType {
    AUTO(1, "Auto Mode", "智能模式"), //智能模式
    CUSTOM(2, "Custom Mode", "自由模式");//自由模式

    @Getter
    private final int value;

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    ModeType(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }
}
