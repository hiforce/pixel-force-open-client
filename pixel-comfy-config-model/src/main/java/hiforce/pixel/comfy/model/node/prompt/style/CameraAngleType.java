package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum CameraAngleType implements IStyleType {

    DUTCH_ANGLE("dutch angle", "斜视镜头", "PROMPT-CAMERA-ANGLE-TYPE-DUTCH_ANGLE"),
    FROM_ABOVE("from above/high angle", "俯视镜头", "PROMPT-CAMERA-ANGLE-TYPE-FROM_ABOVE"),
    FROM_BELOW("from below/low angle", "仰视镜头", "PROMPT-CAMERA-ANGLE-TYPE-FROM_BELOW"),
    EYE_LEVEL("eye level", "视线水平", "PROMPT-CAMERA-ANGLE-TYPE-EYE_LEVEL");

    @Getter
    private final String value;

    @Getter
    private final String nameKey;

    @Getter
    private final String descKey;



    CameraAngleType(String value, String nameKey, String descKey) {
        this.value = value;
        this.nameKey = nameKey;
        this.descKey = descKey;
    }
}
