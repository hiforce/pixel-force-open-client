package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum IlluminationType implements IPromptType {
    RIM_LIGHT("rim light", "轮廓光"),
    VOLUMETRIC_LIGHTING("Volumetric Lighting", "体积光"),
    GLOWING_NEON_LIGHTS("glowing neon lights", "霓虹灯"),
    CINEMATIC_LIGHTING("Cinematic Lighting", "电影级光照"),
    LENS_FLARE("lens flare", "透镜光晕"),
    METALLIC_LUSTER("metallic luster", "金属光泽"),
    MOODY_LIGHTING("moody lighting", "氛围光照"),
    TYNDALL_EFFECT("Tyndall effect", "丁达尔效应"),
    LIGHT_LEAKS("light leaks", "漏光光效"),
    BACKGROUND_LIGHT("background light", "背景光"),
    AVAILABLE_LIGHT("available light", "自然光");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    IlluminationType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
