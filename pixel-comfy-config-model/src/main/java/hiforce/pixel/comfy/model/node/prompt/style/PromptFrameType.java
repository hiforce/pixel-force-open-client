package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptFrameType implements IStyleType {
    CLOSE_ON_FACE("close up on face", "脸部聚焦", 1.2f,"CAMERA-TYPE-CLOSE-ON-FACE"),
    FULL_BODY("full body", "全身", 1.2f,"CAMERA-TYPE-FULL-BODY"),
    HEAD_SHOT("head shot", "头部特写", 1.2f,"CAMERA-TYPE-HEAD-SHOT"),
    UPPER_BODY("upper body", "上半身", 1.2f,"CAMERA-TYPE-UPPER-BODY");

    @Getter
    private final String value;

    @Getter
    private final String descKey;

    @Getter
    private Float weight;


    PromptFrameType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }

    PromptFrameType(String value, String valueCn, float weight, String descKey) {
        this.value = value;
        this.descKey = descKey;
        this.weight = weight;
    }
}
