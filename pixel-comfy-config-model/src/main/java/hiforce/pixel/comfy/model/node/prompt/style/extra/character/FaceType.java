package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum FaceType implements IPromptType {
    SLENDER_FACE("slender face", "瘦脸"),
    ROUND_FACE("round face", "圆脸"),
    OVAL_FACE("oval face", "鹅蛋脸"),
    BABY_FACE("baby face", "娃娃脸"),
    INVERTED_TRIANGLE_FACE("inverted triangle face", "倒三角脸"),
    HEART_SHAPED_FACE("heart shaped face", "心形脸"),
    DIAMOND_FACE("diamond face", "菱形脸"),
    SQUARE_FACE("square face", "方脸"),
    LONG_FACE("long face", "长脸"),
    TRIANGULAR_FACE("triangular face", "三角脸");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    FaceType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
