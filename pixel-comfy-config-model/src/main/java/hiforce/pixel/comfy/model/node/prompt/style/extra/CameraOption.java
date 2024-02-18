package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum CameraOption implements IExtraStyleType {

    None("None", "None"),
    AMBIANCE_ADVENTURE_ACTION("Ambiance-Adventure/Action",  "GoPro HERO10 Black"),
    AMBIANCE_BRIGHT_AND_VIBRANT("Ambiance-Bright and vibrant", "Canon EOS R6 with Canon EF 16-35mm f/2.8L III USM lens"),
    AMBIANCE_DARK_AND_MOODY("Ambiance-Dark and moody",  "Sony a7S III with Sony FE 50mm f/1.4 ZA lens"),
    AMBIANCE_DOCUMENTARY("Ambiance-Documentary", "Canon EOS C300 Mark III with Canon CN-E 24mm T1.5 L F lens"),
    AMBIANCE_FANTASY("Ambiance-Fantasy",  "Fujifilm X-T4 with Fujinon XF 56mm f/1.2 R lens"),
    AMBIANCE_HISTORICAL("Ambiance-Historical", "Fujifilm GFX 100S with Fujinon GF 23mm f/4 R LM WR lens"),
    AMBIANCE_HORROR("Ambiance-Horror",  "Blackmagic Pocket Cinema Camera 6K Pro with Sigma 18-35mm f/1.8 DC HSM Art lens"),
    AMBIANCE_MYSTICAL("Ambiance-Mystical",  "Nikon D6 with Nikon AF-S NIKKOR 24mm f/1.4G ED lens"),
    AMBIANCE_ROMANTIC("Ambiance-Romantic",  "Canon EOS R with Canon RF 50mm f/1.2L USM lens"),
    AMBIANCE_RUSTIC("Ambiance-Rustic",  "Panasonic Lumix GH5S with Sigma 18-35mm f/1.8 DC HSM Art lens"),
    ANGLE_AERIAL_SHOT_BIRDS_EYE_VIEW("Angle-Aerial Shot, Bird’s-Eye View",  "DJI Phantom 4 Pro drone camera"),
    ANGLE_CLOSE_UP_SHOT("Angle-Close-up Shot", "Canon EOS 5D Mark IV camera with a Canon EF 50mm f/1.2L USM lens"),
    ANGLE_EXTREME_CLOSE_UP_SHOT("Angle-Extreme Close-Up Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 100mm f/2.8L Macro IS USM lens"),
    ANGLE_EXTREME_HIGH_ANGLE_SHOT("Angle-Extreme High-Angle Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 70-200mm f/2.8L IS III USM lens on a high-angle tripod"),
    ANGLE_EXTREME_LOW_ANGLE_SHOT("Angle-Extreme Low-Angle Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 14mm f/2.8L II USM lens on a low-angle tripod"),
    ANGLE_EYE_LEVEL_SHOT("Angle-Eye-Level Shot",  "Sony Alpha a7 III camera with a Sony FE 24-105mm f/4 G OSS lens"),
    ANGLE_FULL_SHOT("Angle-Full Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 16-35mm f/2.8L III USM lens"),
    ANGLE_GOPRO_STYLE("Angle-GoPro-Style",  "GoPro HERO9 Black camera with GoPro Super Suit Dive Housing"),
    ANGLE_GROUND_LEVEL_SHOT("Angle-Ground-Level Shot", "Canon EOS-1DX Mark III camera with a Canon EF 24-70mm f/2.8L II USM lens"),
    ANGLE_HIGH_ANGLE_SHOT("Angle-High-Angle Shot",  "Nikon D850 camera with a Nikkor 24-70mm f/2.8E ED VR lens"),
    ANGLE_LOW_ANGLE_SHOT("Angle-Low-Angle Shot",  "Sony Alpha a7 III camera with a Sony FE 16-35mm f/2.8 GM lens"),
    ANGLE_MEDIUM_SHOT("Angle-Medium Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 24-70mm f/2.8L II USM lens"),
    ANGLE_SHOT_FROM_BEHIND("Angle-Shot from Behind",  "Nikon D850 camera with a Nikkor 70-200mm f/2.8E FL ED VR lens"),
    ANGLE_SIDE_ANGLE("Angle-Side-Angle",  "Panasonic Lumix GH5S camera with a Panasonic Lumix 12-35mm f/2.8 II lens"),
    ANGLE_UNDERWATER_CLOSE_UP_SHOT("Angle-Underwater Close-Up Shot",  "Canon EOS 5D Mark IV camera with a Canon EF 100mm f/2.8L Macro IS USM lens in an underwater housing"),
    ANGLE_UNDERWATER_SHOT("Angle-Underwater Shot",  "Canon EOS-1D X Mark II camera with a Canon EF 8-15mm f/4L Fisheye USM lens in an underwater housing"),
    ANGLE_WEBCAM_STYLE_SHOT("Angle-Webcam-Style Shot",  "Logitech C920 HD Pro Webcam"),
    GENERAL_ACTION("General-Action",  "Canon EOS-1D X Mark II"),
    GENERAL_AERIAL_SHOTS("General-Aerial Shots",  "DJI Phantom 4 Pro drone camera"),
    GENERAL_CINEMATIC("General-Cinematic",  "Canon Cinema EOS"),
    GENERAL_FASHION("General-Fashion",  "Hasselblad X1D"),
    GENERAL_GENERAL("General-General",  "Panasonic Lumix GH5S"),
    GENERAL_LANDSCAPE("General-Landscape",  "Canon EOS 5D Mark IV"),
    GENERAL_NOSTALGIC_STYLE("General-Nostalgic Style",  "Kodak Portra 800 film"),
    GENERAL_PORTRAIT("General-Portrait",  "Nikon D850"),
    GENERAL_PORTRAITURE("General-Portraiture",  "Canon EOS 5D Mark IV"),
    GENERAL_PRODUCT("General-Product",  "Hasselblad X1D"),
    GENERAL_SPORTS("General-Sports",  "Sony Alpha a7 III"),
    GENERAL_STREET("General-Street",  "Sony Alpha a7 III"),
    GENERAL_VINTAGE_FILM("General-Vintage Film",  "Super-16"),
    GENERAL_WILDLIFE("General-Wildlife",  "Sony Alpha a7 III"),
    LIGHTING_FOGGY("Lighting-Foggy",  "Sony Alpha a7R IV with Sony FE 70-200mm f/2.8 GM OSS"),
    LIGHTING_HAZY("Lighting-Hazy",  "Canon EOS R6 with Canon RF 24-105mm f/4L IS USM"),
    LIGHTING_OVERCAST("Lighting-Overcast", "Panasonic Lumix GH5S with Panasonic Lumix 12-35mm f/2.8 II"),
    LIGHTING_PARTLY_CLOUDY("Lighting-Partly Cloudy",  "Nikon D850 with Nikkor 24-70mm f/2.8E ED VR"),
    LIGHTING_RAINY("Lighting-Rainy",  "Sony Alpha a7 III with Sony FE 16-35mm f/2.8 GM"),
    LIGHTING_SNOWY("Lighting-Snowy", "Canon EOS-1D X Mark II with Canon EF 24-105mm f/4L IS II USM"),
    LIGHTING_SUNNY("Lighting-Sunny",  "Canon EOS 5D Mark IV with Canon EF 24-70mm f/2.8L II USM"),
    TIME_OF_THE_DAY_AFTERNOON("Time of the Day-Afternoon",  "Sony A7 III camera with a Sony FE 70-200mm f/2.8 GM OSS lens"),
    TIME_OF_THE_DAY_GOLDEN_HOUR("Time of the Day-Golden Hour",  "Canon EOS R5 camera with a Canon RF 50mm f/1.2L USM lens"),
    TIME_OF_THE_DAY_MORNING("Time of the Day-Morning",  "Fujifilm X-T4 camera with a Fujinon XF 16-55mm f/2.8 R LM WR lens"),
    TIME_OF_THE_DAY_NIGHT("Time of the Day-Night",  "Sony A7S III camera with a Sigma 35mm f/1.2 DG DN Art lens"),
    TIME_OF_THE_DAY_SUNRISE("Time of the Day-Sunrise",  "Sony A7R IV camera with a Canon RF 15-35mm f/2.8L IS USM lens"),
    TIME_OF_THE_DAY_SUNSET("Time of the Day-Sunset",  "Sony A7R IV camera with a Sony FE 16-35mm f/2.8 GM lens"),
    TIME_OF_THE_DAY_TWILIGHT("Time of the Day-Twilight",  "Panasonic Lumix S1H camera with a Panasonic Lumix S Pro 50mm f/1.4 lens");

    @Getter
    private final String value;

    @Getter
    private final String words;


    CameraOption(String value, String words) {
        this.value = value;
        this.words = words;
    }
}
