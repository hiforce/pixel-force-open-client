package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ContemptType implements IPromptType {
    DISGUST("disgust", "厌恶(看垃圾一样的眼神)"),
    DISDAIN("disdain", "轻蔑"),
    CONTEMPT("contempt", "蔑视"),
    SHADED_FACE("shaded_face", "脸上有阴影，配合蔑视"),
    CONTEMPTUOUS_LOOK("contemptuous look", "鄙夷的眼神"),
    FROWN("frown", "皱眉/蹙额"),
    FURROWED_BROW("furrowed_brow", "眉头紧锁"),
    FEAR_KUBRICK("fear_kubrick", "害怕侧目");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ContemptType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
