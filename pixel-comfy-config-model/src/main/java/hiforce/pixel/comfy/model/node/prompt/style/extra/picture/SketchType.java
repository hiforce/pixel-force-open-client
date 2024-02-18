package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SketchType implements IPromptType {
    SKETCH("sketch", "素描"),
    FLAT_COLOR("flat_color", "色块"),
    MONOCHROME("monochrome", "单色"),
    SPOT_COLOR("spot_color", "纯色"),
    HALFTONE("halftone", "半色调"),
    GREYSCALE("greyscale", "灰度"),
    HIGH_CONTRAST("high_contrast", "高对比度"),
    PARTIALLY_COLORED("partially_colored", "部分着色"),
    CHROMATIC_ABERRATION("chromatic_aberration", "色差、色失焦"),
    CONTOUR_DEEPENING("contour_deepening", "轮廓加深"),
    OUTLINE("outline", "轮廓线"),
    SILHOUETTE("silhouette", "剪影");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SketchType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
