package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CryType implements IPromptType {
    SAD("sad", "伤心"),
    TEAR("tear", "啜泣"),
    CRYING("crying", "大哭"),
    CRYING_WITH_EYES_OPEN("crying_with_eyes_open", "睁着眼睛哭"),
    STREAMING_TEARS("streaming_tears", "流泪"),
    TEARDROP("teardrop", "泪珠"),
    TEARING_CLOTHES("tearing_clothes", "撕破衣服"),
    TEARING_UP("tearing_up", "要哭的表情"),
    TEARS("tears", "眼泪"),
    WIPING_TEARS("wiping_tears", "擦眼泪"),
    BADMOOD("badmood", "心情不好");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CryType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
