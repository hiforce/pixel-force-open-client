package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import com.google.common.collect.Lists;
import hiforce.pixel.comfy.model.node.prompt.IPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum EnvironmentPromptGroup implements IPromptGroup {

    SEASON("Season", "季节", SeasonType.class),
    WEATHER("Weather", "天气", WeatherType.class),
    NATURE("Nature", "大自然", NatureType.class),
    WATER("Water", "水", WaterType.class),
    SKY("Sky", "天空", SkyType.class),
    CLOUD("Cloud", "云", CloudType.class),
    ATMOSPHERE("Atmosphere", "氛围", AtmosphereType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;


    EnvironmentPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
