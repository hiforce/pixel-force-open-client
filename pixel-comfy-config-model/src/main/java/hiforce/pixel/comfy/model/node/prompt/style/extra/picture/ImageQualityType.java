package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ImageQualityType implements IPromptType {
    CHECKERED("checkered", "格子的"),
    LOWRES("lowres", "低分辨率"),
    HIGHRES("highres", "高分辨率"),
    ABSURDRES("absurdres", "超高分辨率"),
    INCREDIBLY_ABSURDRES("incredibly absurdres", "极高分辨率"),
    HUGE_FILESIZE("huge filesize", "超级高分辨率/大文件"),
    WALLPAPER("wallpaper", "壁纸"),
    PIXEL_ART("pixel art", "点阵图"),
    MONOCHROME("monochrome", "单色图片"),
    COLORFUL("colorful", "色彩斑斓的");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ImageQualityType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
