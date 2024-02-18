package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum TongueType implements IPromptType {

    TONGUE_ON_UPPER_LIP(":q", "舌头放在上唇"),
    TONGUE_ON_LOWER_LIP(":p", "舌头放在下唇"),
    BLINK_AND_STICK_OUT_TONGUE(";p", "眨眼舌头上伸"),
    LONG_TONGUE("long_tongue", "长舌头"),
    TONGUE("tongue", "舌头"),
    TONGUE_OUT("tongue_out", "吐舌头"),
    UVULA("uvula", "小舌头|口盖垂|悬雍垂");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    TongueType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
