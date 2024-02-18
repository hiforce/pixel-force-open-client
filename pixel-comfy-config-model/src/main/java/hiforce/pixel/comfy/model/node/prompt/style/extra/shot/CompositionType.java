package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CompositionType implements IPromptType {
    AERIAL("aerial", "空中", "aerial"),
    TURN_ONES_BACK("turn_one's_back", "转身", "turn_one's_back"),
    UPSKIRT("upskirt", "裙底视角", "upskirt"),
    PHONE_SCREEN("phone_screen", "手机屏幕", "phone_screen"),
    MULTIPLE_VIEWS("multiple_views", "多视角分解", "multiple_views"),
    MIRROR_SELFIE("mirror selfie", "对镜自拍", "mirror selfie"),
    THREE_QUARTER_VIEW("three-quarter view", "3/4视角", "three-quarter view");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CompositionType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
