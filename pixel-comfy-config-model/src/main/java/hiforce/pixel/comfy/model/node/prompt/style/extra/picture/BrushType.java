package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum BrushType implements IPromptType {
    TRADITIONAL_MEDIA("traditional_media", "传统画布（如纸等）"),
    FAUX_TRADITIONAL_MEDIA("faux_traditional_media", "签绘风格"),
    MARKER_MEDIUM("marker_(medium)", "马克笔"),
    COPICS("copics", "马克笔（中性灰色）"),
    PENCIL_SKETCH_LINES("pencil_sketch_lines", "铅笔速写"),
    GRAPHITE_MEDIUM("graphite_(medium)", "石墨铅笔"),
    COLORED_PENCIL_MEDIUM("colored_pencil_(medium)", "彩色铅笔"),
    MILLIPEN_MEDIUM("millipen_(medium)", "绘图笔"),
    NIB_PEN_MEDIUM("nib_pen_(medium)", "绘图笔"),
    BALLPOINT_PEN_MEDIUM_("ballpoint_pen_(medium)_", "圆珠笔"),
    PASTEL_COLOR("pastel_color", "柔和的色彩"),
    WATERCOLOR_MEDIUM("watercolor_(medium)", "水彩"),
    ACRYLIC_PAINT_MEDIUM("acrylic_paint_(medium)", "丙烯漆料画"),
    CONTOUR_DEEPENING("contour_deepening", "线条变粗");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    BrushType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
