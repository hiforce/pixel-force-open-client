package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SkyType implements IPromptType {
    SKY("sky", "天空", "sky"),
    GRADIENT_SKY("gradient_sky", "倾斜的天空", "gradient_sky"),
    NIGHT_SKY("night_sky", "夜空", "night_sky"),
    STARRY_SKY("starry_sky", "星空", "starry_sky"),
    HYPER_GALAXY("hyper_galaxy", "超级银河", "hyper_galaxy"),
    STAR_SKY("star_(sky)", "星星(天空中的)", "star_(sky)"),
    STAR_TRAIL("star_trail", "星星轨迹", "star_trail"),
    SUNSET("sunset", "落日", "sunset"),
    MOON("moon", "月亮", "moon"),
    LUNAR("lunar", "月的,_月球的;", "lunar"),
    CRESCENT("crescent", "月牙", "crescent"),
    CRESCENT_MOON("crescent_moon", "新月", "crescent_moon"),
    FULL_MOON("full_moon", "满月", "full_moon"),
    MOONLIGHT("moonlight", "月光", "moonlight"),
    SCARLET_MOON("scarlet_moon", "猩红月亮", "scarlet_moon"),
    UNIVERSE("universe", "宇宙", "universe"),
    SPACE("space", "太空", "space"),
    PLANET("planet", "星球", "planet"),
    FROM_SPACE_STATION("from_space_station", "空间站", "from_space_station"),
    SATELLITE("satellite", "卫星", "satellite");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SkyType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
