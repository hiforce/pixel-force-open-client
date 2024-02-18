package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ArmorType implements IPromptType {
    ARMOR("armor", "盔甲"),
    BIKINI_ARMOR("bikini_armor", "比基尼盔甲"),
    FULL_ARMOR("full_armor", "穿着全套盔甲的"),
    PLATE_ARMOR("plate_armor", "板甲"),
    JAPANESE_ARMOR("japanese_armor", "日本铠甲"),
    KUSAZURI("kusazuri", "腹当|草摺(日式下半盔甲"),
    POWER_ARMOR("power_armor", "动力装甲"),
    MECHA("mecha", "机甲"),
    HELMET("helmet", "头盔"),
    KABUTO("kabuto", "头盔(日式)"),
    OFF_SHOULDER_ARMOR("off-shoulder_armor", "無肩甲盔甲"),
    SHOULDER_ARMOR("shoulder_armor", "肩甲"),
    MUNEATE("muneate", "日本弓道護胸甲"),
    BREASTPLATE("breastplate", "胸甲"),
    FAULDS("faulds", "腹甲"),
    GREAVES("greaves", "胫甲"),
    SHIN_GUARDS("shin_guards", "胫甲"),
    ARMORED_BOOTS("armored_boots", "装甲靴");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ArmorType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
