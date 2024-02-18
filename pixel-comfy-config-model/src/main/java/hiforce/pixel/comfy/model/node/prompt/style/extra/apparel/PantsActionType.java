package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum PantsActionType implements IPromptType {

    ASYMMETRICAL_LEGWEAR("asymmetrical_legwear", "不对称的裤子"),
    LEOTARD_ASIDE("leotard_aside", "把连衣裤裆部剥到一边"),
    OPEN_FLY("open_fly", "解开的裤子拉链"),
    PANTS_DOWN("pants_down", "褪下裤子"),
    PANTS_ROLLED_UP("pants_rolled_up", "裤子卷起来"),
    PANTS_TUCKED_IN("pants_tucked_in", "裤子塞进去"),
    TORN_JEANS("torn_jeans", "破损的牛仔裤"),
    TORN_PANTS("torn_pants", "破损的裤子"),
    TORN_SHORTS("torn_shorts", "破损的短裤");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    PantsActionType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
