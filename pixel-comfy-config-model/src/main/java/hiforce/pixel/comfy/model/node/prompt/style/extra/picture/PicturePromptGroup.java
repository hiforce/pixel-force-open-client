package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

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
public enum PicturePromptGroup implements IPromptGroup {

    BACKGROUND("Background", "背景", BackgroundType.class),
    COLOR("Color", "颜色", ColorType.class),
    ILLUMINATION("Illumination", "光照", IlluminationType.class),
    REALISTIC("Realistic", "写实", RealisticType.class),
    SKETCH("Sketch", "素描", SketchType.class),
    IMAGE_QUALITY("Image Quality", "画质", ImageQualityType.class),
    ART_STYLE("Art Style", "艺术风格", ArtStyleType.class),
    ART_TYPE("Art Type", "艺术类型", ArtType.class),
    ART_FACTION("Art Faction", "艺术派系", ArtFactionType.class),
    ARTIST_STYLE("Artist Style", "艺术家风格", ArtistStyleType.class),
    BRUSH("Brush", "画笔", BrushType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;

    PicturePromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }

}
