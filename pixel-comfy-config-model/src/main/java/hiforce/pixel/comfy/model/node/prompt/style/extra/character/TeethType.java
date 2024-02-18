package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum TeethType implements IPromptType {
    TEETH("teeth", "牙齿"),
    UPPER_TEETH("upper_teeth", "上牙"),
    FANG("fang", "虎牙"),
    SKIN_FANG("skin_fang", "肤色虎牙"),
    ROUND_TEETH("round_teeth", "圆齿"),
    SHARP_TEETH("sharp_teeth", "锋利的牙齿"),
    CLENCHED_TEETH("clenched_teeth", "咬紧牙关"),
    TONGUE("tongue", "舌头"),
    BUCK_TEETH("buck_teeth", "龅牙"),
    FANG_OUT("fang_out", "露出虎牙|露出尖牙"),
    FANGS("fangs", "尖牙"),
    SPIKED_CLUB("spiked_club", "狼牙棒"),
    TOOTH("tooth", "牙"),
    TOOTHBRUSH("toothbrush", "牙刷"),
    TUSKS("tusks", "象牙"),
    SHARK_MOUTH("shark_mouth", "鲨鱼牙");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    TeethType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
