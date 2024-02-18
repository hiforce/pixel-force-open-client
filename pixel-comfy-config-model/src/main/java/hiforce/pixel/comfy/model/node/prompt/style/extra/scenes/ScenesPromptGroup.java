package hiforce.pixel.comfy.model.node.prompt.style.extra.scenes;

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
public enum ScenesPromptGroup implements IPromptGroup {

    OUTDOOR("Outdoor", "室外", OutdoorType.class),
    INDOOR("Indoor", "室内", IndoorType.class),
    CITY("City", "城市", CityScenesType.class),
    HOME("Home", "家居", HomeSceneType.class);
    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;

    ScenesPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }

}
