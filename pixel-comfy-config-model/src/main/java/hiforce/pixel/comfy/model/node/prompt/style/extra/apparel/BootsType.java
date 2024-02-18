package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum BootsType implements IPromptType {

    BOOTS("boots", "靴子"),
    BOOTS_REMOVED("boots_removed", "脱下的靴子"),
    THIGH_BOOTS("thigh_boots", "大腿靴"),
    KNEE_BOOTS("knee_boots", "及膝靴(马靴)"),
    CROSS_LACED_FOOTWEAR("cross-laced_footwear", "系带靴"),
    ANKLE_BOOTS("ankle_boots", "踝靴"),
    HIGH_HEEL_BOOTS("high_heel_boots", "高跟靴"),
    TOELESS_BOOTS("toeless_boots", "露趾靴"),
    LACE_UP_BOOTS("lace-up_boots", "系带靴"),
    FUR_TRIMMED_BOOTS("fur-trimmed_boots", "毛边靴子"),
    SNOW_BOOTS("snow_boots", "雪地靴"),
    ANKLET("anklet", "脚链"),
    RUBBER_BOOTS("rubber_boots", "胶靴"),
    SANTA_BOOTS("santa_boots", "圣诞靴"),
    LEATHER_BOOTS("leather_boots", "皮靴"),
    THIGHHIGHS_UNDER_BOOTS("thighhighs_under_boots", "靴子下的长筒袜"),
    COMBAT_BOOTS("combat_boots", "作战靴"),
    DOC_MARTENS("doc_martens", "马丁靴"),
    RAIN_BOOTS("rain_boots", "雨靴"),
    BELT_BOOTS("belt_boots", "皮带靴"),
    FUR_BOOTS("fur_boots", "矮跟休闲皮草靴"),
    SINGLE_BOOT("single_boot", "一只脚没穿靴子");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    BootsType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
