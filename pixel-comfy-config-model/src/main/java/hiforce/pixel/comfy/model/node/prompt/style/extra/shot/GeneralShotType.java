package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum GeneralShotType implements IPromptType {
    PANORAMA("panorama", "全景", "panorama"),
    LANDSCAPE("landscape", "风景镜头(远景)", "landscape"),
    WIDE_SHOT("wide_shot", "全景镜头(广角镜头)", "wide_shot"),
    MEDIUM_SHOT("medium_shot", "中景镜头", "medium_shot"),
    MID_SHOT("mid_shot", "中景镜头", "mid_shot"),
    FULL_SHOT("full_shot", "全身像", "full_shot"),
    BUST("bust", "半身像", "bust"),
    UPPER_BODY("upper_body", "上半身", "upper_body"),
    LOWER_BODY("lower_body", "下半身", "lower_body"),
    COWBOY_SHOT("cowboy_shot", "上半身+上半大腿(牛仔镜头)", "cowboy_shot"),
    PORTRAIT("portrait", "肖像画(脸+肩+偶尔再加胸)", "portrait"),
    PROFILE("profile", "侧面肖像画(portrait的侧脸版)", "profile");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    GeneralShotType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
