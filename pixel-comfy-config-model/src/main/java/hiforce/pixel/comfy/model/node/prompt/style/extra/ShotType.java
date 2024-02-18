package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum ShotType implements IExtraStyleType {
    None("None"),
    BIRD_EYE_VIEW_SHOT("Bird's Eye View Shot"),
    CANDID_SHOT("Candid Shot"),
    CLOSEUP_SHOT("Closeup Shot"),
    DRONE_SHOT("Drone Shot"),
    DUTCH_ANGLE_SHOT("Dutch Angle Shot"),
    ESTABLISHING_SHOT(" Establishing Shot"),
    EXTREME_CLOSEUP_SHOT("Extreme Closeup Shot"),
    EXTREME_LONG_SHOT("Extreme Long Shot"),
    EYE_LEVEL_SHOT("Eye Level Shot"),
    FULL_SHOT("Full Shot"),
    GROUND_LEVEL_VIEW("Ground-level view"),
    HIGH_ANGLE_SHOT("High Angle Shot"),
    LONG_SHOT(" Long Shot (Wide Shot)"),
    LOW_ANGLE_SHOT("Low Angle Shot"),
    MASTER_SHOT("Master Shot"),
    MEDIUM_SHOT(" Medium Shot"),
    OFF_CENTER_VIEW("Off-Center View"),
    OVER_THE_SHOULDER_SHOT("Over-the-Shoulder Shot"),
    OVERHEAD_SHOT("Overhead Shot"),
    POINT_OF_VIEW_SHOT("Point of View Shot"),
    RULE_OF_THIRDS_SHOT("Rule of Thirds Shot"),
    SHOT_FROM_BEHIND(" Shot from Behind"),
    SIDE_VIEW("Side View"),
    SILHOUETTE_SHOT("Silhouette Shot"),
    TWO_SHOT("Two-Shot"),
    UNDERWATER_SHOT(" Underwater Shot"),
    WORM_EYE_VIEW("Worm's-eye view");


    @Getter
    private final String value;

    @Getter
    private final String words;

    ShotType(String value,  String words) {
        this.value = value;
        this.words = words;
    }

    ShotType(String value) {
        this.value = value;
        this.words = value;
    }
}
