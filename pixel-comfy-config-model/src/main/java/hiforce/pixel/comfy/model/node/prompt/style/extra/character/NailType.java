package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum NailType implements IPromptType {
    FINGERNAILS("fingernails", "手指甲"),
    TOENAILS("toenails", "脚趾甲"),
    NAIL_POLISH("nail_polish", "指甲油"),
    TOENAIL_POLISH("toenail_polish", "脚趾甲油"),
    BLACK_NAILS("black_nails", "黑指甲"),
    RED_NAILS("red_nails", "红指甲"),
    PINK_NAILS("pink_nails", "粉色指甲"),
    LONG_FINGERNAILS("long_fingernails", "长指甲"),
    NAIL("nail", "钉子|指甲"),
    MULTICOLORED_NAILS("multicolored_nails", "多彩指甲"),
    NAIL_ART("nail_art", "美甲"),
    BROWN_VEST("brown_vest", "棕色马甲");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    NailType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
