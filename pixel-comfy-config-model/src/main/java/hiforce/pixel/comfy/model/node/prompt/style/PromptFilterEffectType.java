package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptFilterEffectType implements IStyleType {

    BLACK_AND_WHITE("black and white",  1.5f,"PROMPT-EFFECT-TYPE-BLACK_AND_WHITE"),
    COLOR_FILTER("color filter",  "PROMPT-EFFECT-TYPE-COLOR_FILTER"),
    BOKEH("bokeh",  "PROMPT-EFFECT-TYPE-BOKEH"),
    DESATURATED("desaturated",  "PROMPT-EFFECT-TYPE-DESATURATED"),
    GRUNGE_FILTER("grunge filter",  "PROMPT-EFFECT-TYPE-GRUNGE_FILTER"),
    DREAMY_HAZE("dreamy haze",  "PROMPT-EFFECT-TYPE-DREAMY_HAZE"),
    GLITCH_STYLE("glitch style",  "PROMPT-EFFECT-TYPE-GLITCH_STYLE"),
    HOLOGRAM_EFFECT("hologram effect",  "PROMPT-EFFECT-TYPE-HOLOGRAM_EFFECT"),
    INFRARED_FILTER("(infrared filter:1.4)",  "PROMPT-EFFECT-TYPE-INFRARED_FILTER"),
    LENS_FLARE("lens flare",  "PROMPT-EFFECT-TYPE-LENS_FLARE"),
    SEPIA_TONE("sepia tone",  "PROMPT-EFFECT-TYPE-SEPIA_TONE"),
    SOFT_FOCUS("soft focus",  "PROMPT-EFFECT-TYPE-SOFT_FOCUS"),
    SOLARIZED("solarized", "PROMPT-EFFECT-TYPE-SOLARIZED"),
    LONG_EXPOSURE("long exposure",  "PROMPT-EFFECT-TYPE-LONG_EXPOSURE"),
    ND_FILTER("ND filter",  "PROMPT-EFFECT-TYPE-ND_FILTER"),
    OVEREXPOSED("overexposed",  "PROMPT-EFFECT-TYPE-OVEREXPOSED"),
    TECHNICOLOR("technicolor",  "PROMPT-EFFECT-TYPE-TECHNICOLOR"),
    UNDEREXPOSED("underexposed",  "PROMPT-EFFECT-TYPE-UNDEREXPOSED"),
    VIGNETTE("vignette",  "PROMPT-EFFECT-TYPE-VIGNETTE");


    @Getter
    private final String value;

    @Getter
    private final String descKey;

    @Getter
    private Float weight;


    PromptFilterEffectType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }

    PromptFilterEffectType(String value, float weight, String descKey) {
        this.value = value;
        this.descKey = descKey;
        this.weight = weight;
    }
}
