package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum RealisticType implements IPromptType {
    REALISTIC("realistic", "写实"),
    HIGHRES("highres", "厚涂（风格）"),
    PHOTO_MEDIUM("photo_(medium)", "照片（风格）"),
    OIL_PAINTING("oil_painting", "油画"),
    REALITY("reality", "真实"),
    POLAROID("polaroid", "照片(拍立得)");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    RealisticType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
