package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum WingType implements IPromptType {
    WINGS("wings", "翅膀"),
    BAT_WINGS("bat_wings", "蝙蝠翅膀"),
    BUTTERFLY_WINGS("butterfly_wings", "蝴蝶翅膀"),
    BLACK_WINGS("black_wings", "黑色之翼"),
    DEMON_WINGS("demon_wings", "恶魔之翼"),
    ASYMMETRICAL_WINGS("asymmetrical_wings", "不对称的翅膀"),
    DETACHED_WINGS("detached_wings", "不与本体相连的翅膀"),
    FAIRY_WINGS("fairy_wings", "妖精的翅膀"),
    FAKE_WINGS("fake_wings", "仿造的翅膀"),
    FIERY_WINGS("fiery_wings", "燃烧着的翅膀"),
    INSECT_WINGS("insect_wings", "昆虫翅膀"),
    LARGE_WINGS("large_wings", "大翅膀"),
    LOW_WINGS("low_wings", "腰间的翅膀"),
    MINI_WINGS("mini_wings", "迷你翅膀"),
    MULTICOLORED_WINGS("multicolored_wings", "有多种颜色的翅膀"),
    MULTIPLE_WINGS("multiple_wings", "多对翅膀"),
    NO_WINGS("no_wings", "去掉了(原设有的)翅膀"),
    WINGED_HELMET("winged_helmet", "带翅膀的头盔");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    WingType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
