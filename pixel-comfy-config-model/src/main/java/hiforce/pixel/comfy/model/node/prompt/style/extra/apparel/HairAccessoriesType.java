package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum HairAccessoriesType implements IPromptType {
    HAIR_RIBBON("hair_ribbon", "发_带"),
    HAIRBAND("hairband", "发_带"),
    HAIR_TIE("hair_tie", "发_带"),
    LOLITA_HAIRBAND("lolita_hairband", "洛丽塔发带"),
    FRILLED_HAIRBAND("frilled_hairband", "褶边发带"),
    LACE_TRIMMED_HAIRBAND("lace-trimmed_hairband", "蕾丝边饰发带"),
    HAIR_BOBBLES("hair_bobbles", "头绳"),
    HAIR_ORNAMENT("hair_ornament", "发饰"),
    HAIR_FLOWER("hair_flower", "发_花"),
    X_HAIR_ORNAMENT("x_hair_ornament", "x_发饰"),
    HAIR_BOW("hair_bow", "蝴蝶结发饰"),
    FROG_HAIR_ORNAMENT("frog_hair_ornament", "青蛙发饰"),
    HEART_HAIR_ORNAMENT("heart_hair_ornament", "心形发饰"),
    BUTTERFLY_HAIR_ORNAMENT("butterfly_hair_ornament", "蝴蝶发饰"),
    STAR_HAIR_ORNAMENT("star_hair_ornament", "星星发饰"),
    FOOD_THEMED_HAIR_ORNAMENT("food-themed_hair_ornament", "食物主题发饰"),
    ANCHOR_HAIR_ORNAMENT("anchor_hair_ornament", "锚形发饰"),
    BAT_HAIR_ORNAMENT("bat_hair_ornament", "蝙蝠发饰"),
    CARROT_HAIR_ORNAMENT("carrot_hair_ornament", "胡萝卜发饰"),
    CAT_HAIR_ORNAMENT("cat_hair_ornament", "猫系发饰"),
    CLOVER_HAIR_ORNAMENT("clover_hair_ornament", "三叶草发饰"),
    CRESCENT_HAIR_ORNAMENT("crescent_hair_ornament", "月牙发饰"),
    CROSS_HAIR_ORNAMENT("cross_hair_ornament", "十字发饰"),
    D_PAD_HAIR_ORNAMENT("d-pad_hair_ornament", "方向键发饰"),
    FISH_HAIR_ORNAMENT("fish_hair_ornament", "鱼形发饰"),
    HAIRPODS("hairpods", "头发上成对的像无线蓝牙的发饰"),
    LEAF_HAIR_ORNAMENT("leaf_hair_ornament", "叶子发饰"),
    MUSICAL_NOTE_HAIR_ORNAMENT("musical_note_hair_ornament", "音符发饰"),
    PUMPKIN_HAIR_ORNAMENT("pumpkin_hair_ornament", "南瓜发饰"),
    SKULL_HAIR_ORNAMENT("skull_hair_ornament", "骷髅发饰"),
    SNAKE_HAIR_ORNAMENT("snake_hair_ornament", "蛇形发饰|蛙头发饰"),
    SNOWFLAKE_HAIR_ORNAMENT("snowflake_hair_ornament", "雪花发饰"),
    STRAWBERRY_HAIR_ORNAMENT("strawberry_hair_ornament", "草莓发饰"),
    SUNFLOWER_HAIR_ORNAMENT("sunflower_hair_ornament", "向日葵发饰"),
    HAIRPIN("hairpin", "发夹"),
    HAIR_TUBES("hair_tubes", "发管"),
    HAIR_STICK("hair_stick", "发棒"),
    HAIR_BUN("hair_bun", "发髻"),
    SINGLE_HAIR_BUN("single_hair_bun", "发髻(单)"),
    HAIR_BELL("hair_bell", "发铃"),
    HAIR_RINGS("hair_rings", "发圈");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HairAccessoriesType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
