package hiforce.pixel.open.client.param.mode;

import hiforce.pixel.comfy.model.node.IIntType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/30
 */
public enum ReserveClothType implements IIntType {

    PERFECT(1, "Real Person", "真人图"),
    MANNEQUIN(2, "Mannequin", "人台图"),
    IMPERFECT(3, "Imperfect Mannequin", "残缺人台图");

    @Getter
    private final int value;

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    ReserveClothType(int value, String text, String textCn) {
        this.value = value;
        this.text = text;
        this.textCn = textCn;
    }
}
