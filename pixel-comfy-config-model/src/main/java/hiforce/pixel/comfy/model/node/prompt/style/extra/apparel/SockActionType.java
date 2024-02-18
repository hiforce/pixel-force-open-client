package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SockActionType implements IPromptType {
    LEG_CUTOUT("leg_cutout", "袜子有开口"),
    THIGHHIGHS_UNDER_BOOTS("thighhighs_under_boots", "靴子穿在袜子外面"),
    ADJUSTING_LEGWEAR("adjusting_legwear", "整理裤袜"),
    PANTYHOSE_PULL("pantyhose_pull", "褪下的裤袜"),
    SOCKS_REMOVED("socks_removed", "脱袜子"),
    SOCK_PULL("sock_pull", "拉着袜子(短袜)"),
    THIGHHIGHS_PULL("thighhighs_pull", "拉着袜子(长袜)");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SockActionType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
