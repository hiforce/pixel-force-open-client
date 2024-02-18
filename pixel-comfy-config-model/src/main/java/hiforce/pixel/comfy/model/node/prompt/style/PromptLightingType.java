package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptLightingType implements IStyleType {

    BOUNCED("bounced lighting",  "PROMPT-LIGHTING-TYPE-BOUNCED"),
    CANDLE("candlelight", "PROMPT-LIGHTING-TYPE-CANDLE"),
    CHIAROSCURO("chiaroscuro", "PROMPT-LIGHTING-TYPE-CHIAROSCURO"),
    CINEMATIC_LIGHTING("cinematic lighting",  "PROMPT-LIGHTING-TYPE-CINEMATIC-LIGHTING"),
    SOFT_DIFFUSED_LIGHTING("soft diffused lighting",  "PROMPT-LIGHTING-TYPE-SOFT-DIFFUSED-LIGHTING"),
    EDGE_LIGHTING("edge lighting",  "PROMPT-LIGHTING-TYPE-EDGE-LIGHTING"),
    FILL_LIGHTING("fill lighting",  "PROMPT-LIGHTING-TYPE-FILL-LIGHTING"),
    FLASH("flash photography",  "PROMPT-LIGHTING-TYPE-FLASH"),
    GOD_RAYS("god rays", "PROMPT-LIGHTING-TYPE-GOD-RAYS"),
    GOLDEN_HOUR("golden hour",  "PROMPT-LIGHTING-TYPE-GOLDEN_HOUR"),
    HARD_LIGHT("hard light",  "PROMPT-LIGHTING-TYPE-HARD_LIGHT"),
    HIGH_KEY_LIGHTING("high key lighting",  "PROMPT-LIGHTING-TYPE-HIGH_KEY_LIGHTING"),
    LOW_KEY_LIGHTING("low key lighting", "PROMPT-LIGHTING-TYPE-LOW_KEY_LIGHTING"),
    NATURAL_LIGHTING("natural lighting",  "PROMPT-LIGHTING-TYPE-NATURAL_LIGHTING"),
    NEON_LIGHTING("neon lighting",  "PROMPT-LIGHTING-TYPE-NEON_LIGHTING"),
    OVERCAST_LIGHTING("overcast lighting",  "PROMPT-LIGHTING-TYPE-OVERCAST_LIGHTING"),
    RIM_LIGHTING("rim lighting",  "PROMPT-LIGHTING-TYPE-RIM_LIGHTING"),
    SHADOW_PLAY("shadow play",  "PROMPT-LIGHTING-TYPE-SHADOW_PLAY"),
    SILHOUETTE_LIGHTING("silhouette lighting",  "PROMPT-LIGHTING-TYPE-SILHOUETTE_LIGHTING"),
    SOFT_LIGHTING("soft lighting",  "PROMPT-LIGHTING-TYPE-SOFT_LIGHTING");

    @Getter
    private final String value;

    @Getter
    private final String descKey;

    PromptLightingType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }
}
