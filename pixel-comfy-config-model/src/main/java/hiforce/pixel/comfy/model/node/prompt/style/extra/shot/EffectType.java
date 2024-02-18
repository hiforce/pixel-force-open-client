package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum EffectType implements IPromptType {
    DEPTH_OF_FIELD("depth of field", "景深（协调人景）", "depth of field"),
    LENS_FLARE("lens_flare", "镜头光晕", "lens_flare"),
    MOTION_BLUR("motion_blur", "运动导致的模糊", "motion_blur"),
    MOTION_LINES("motion_lines", "体现运动的线", "motion_lines"),
    SPEED_LINES("speed_lines", "速度线", "speed_lines"),
    BOKEH("bokeh", "焦散", "bokeh"),
    CHROMATIC_ABERRATION("chromatic_aberration", "色差", "chromatic_aberration"),
    OVEREXPOSURE("overexposure", "过曝", "overexposure"),
    CONTOUR_DEEPENING("contour_deepening", "等高线强化", "contour_deepening");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    EffectType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
