package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum WeatherType implements IExtraStyleType {
    None("None"),
    Foggy("Foggy"),
    Hazy("Hazy"),
    Overcast("Overcast"),
    Partly_Cloudy("Partly Cloudy"),
    Rainy("Rainy"),
    Snowy("Snowy"),
    Sunny("Sunny"),
    Afternoon("Afternoon"),
    Golden_Hour("Golden Hour"),
    Morning("Morning"),
    Night("Night"),
    Sunrise("Sunrise"),
    Sunset("Sunset"),
    Twilight("Twilight");

    @Getter
    private final String value;

    @Getter
    private String words;

    WeatherType(String value) {
        this.value = value;
        this.words = value;
    }
}
