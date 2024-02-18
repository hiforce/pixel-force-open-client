package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum WeatherType implements IPromptType {
    DAY("day", "白天", "day"),
    DUSK("dusk", "黄昏", "dusk"),
    NIGHT("night", "夜晚", "night"),
    RAIN("rain", "下雨", "rain"),
    RAINY_DAYS("rainy days", "雨天", "rainy days"),
    SUNSET("sunset", "日落", "sunset"),
    CLOUDY("cloudy", "多云", "cloudy"),
    FULL_MOON("full moon", "满月", "full moon, full_moon"),
    SUN("sun", "太阳", "sun"),
    MOON("moon", "月亮", "moon"),
    STARS("stars", "星星", "stars"),
    SKY("sky", "天空", "sky"),
    UNIVERSE("universe", "宇宙", "universe"),
    SNOW_ICE("snow,ice", "冰雪", "snow,ice"),
    SNOWFLAKES("snowflakes", "雪花", "snowflakes"),
    LIGHTING("lighting", "闪电", "lighting"),
    RAINBOW("rainbow", "彩虹", "rainbow"),
    METEOR_SHOWER("meteor shower", "流星雨", "meteor shower"),
    CUMULONIMBUS("cumulonimbus", "积雨云", "cumulonimbus");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    WeatherType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }

}
