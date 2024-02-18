package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum MaskType implements IPromptType {
    MASK("mask", "面具"),
    HALF_MASK("half_mask", "半面罩"),
    MASKED("masked", "蒙面"),
    MASK_LIFT("mask_lift", "抬起面罩"),
    MASK_ON_HEAD("mask_on_head", "掀到头上的面具"),
    MASK_REMOVED("mask_removed", "摘下的面具"),
    MOUTH_MASK("mouth_mask", "口罩"),
    SURGICAL_MASK("surgical_mask", "医用口罩"),
    PLAGUE_DOCTOR_MASK("plague_doctor_mask", "瘟疫医生口罩"),
    GAS_MASK("gas_mask", "防毒面具"),
    VISOR("visor", "面甲"),
    HELMET("helmet", "头盔"),
    FOX_MASK("fox_mask", "狐狸面具"),
    DIVING_MASK("diving_mask", "潜水面罩"),
    DIVING_MASK_ON_HEAD("diving_mask_on_head", "头戴式潜水面罩"),
    ONI_MASK("oni_mask", "鬼面具"),
    TENGU_MASK("tengu_mask", "天狗面具"),
    NINJA_MASK("ninja_mask", "忍者面具"),
    SKULL_MASK("skull_mask", "骷髅面具"),
    HOCKEY_MASK("hockey_mask", "曲棍球面具"),
    BIRD_MASK("bird_mask", "鸟面具"),
    STONE_MASK("stone_mask", "石鬼面"),
    HORSE_MASK("horse_mask", "马面具"),
    MASQUERADE_MASK("masquerade_mask", "化妆舞会面具"),
    DOMINO_MASK("domino_mask", "SM面具");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    MaskType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
