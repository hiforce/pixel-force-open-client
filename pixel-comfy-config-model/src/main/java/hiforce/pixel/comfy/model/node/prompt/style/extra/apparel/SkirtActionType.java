package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SkirtActionType implements IPromptType {
    SKIRT_HOLD("skirt_hold", "优雅地提着裙子"),
    SKIRT_TUG("skirt_tug", "扯住裙摆|按住裙摆"),
    DRESS_TUG("dress_tug", "压住裙摆"),
    SKIRT_LIFT("skirt_lift", "掀起裙子"),
    SKIRT_AROUND_ONE_LEG("skirt_around_one_leg", "一条腿上挂着短裙"),
    SKIRT_REMOVED("skirt_removed", "脱下的短裙"),
    DRESS_REMOVED("dress_removed", "脱下裙子"),
    OPEN_SKIRT("open_skirt", "敞开的裙子");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SkirtActionType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
