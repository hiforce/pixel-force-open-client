package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ArtType implements IPromptType {
    MONOCHROME("monochrome", "单色图片"),
    COLLAGE("Collage", "拼贴艺术"),
    DALLE_DE_VERRE("Dalle de verre", "彩色玻璃"),
    PIXEL_ART("pixel art", "像素画"),
    ENCAUSTIC_PAINTING("Encaustic painting", "瓷画"),
    INK_WASH_PAINTING("Ink wash painting", "水墨画"),
    MEZZOTINT("Mezzotint", "铜版雕刻"),
    SILHOUETTE("silhouette", "剪影"),
    ILLUSTRATION("illustration", "插画"),
    INK_WATERCOLOR("(((ink))), ((watercolor))", "水彩画"),
    ILLUSTRATION_("illustration,(((ukiyoe))),((sketch)),((japanese_art))", "浮世绘"),
    WASH_PAINTING_INK_S("((wash painting)),((ink s...))", "中国风"),
    DYEING_OIL_PAINTING_IMPASTO("((dyeing)),((oil painting)),((impasto))", "油画"),
    POSING_SKETCH_MONOCHROME("(posing sketch), (monochrome)", "黑白草图"),
    SKETCH("sketch", "手画草稿"),
    MONOCHROME_GRAY_SCALE_PENCIL_SKETCH_LINES("(monochrome), (gray scale), (pencil sketch lines", "铅笔速写"),
    WATERCOLOR_PENCIL("(watercolor pencil)", "彩铅画");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ArtType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
