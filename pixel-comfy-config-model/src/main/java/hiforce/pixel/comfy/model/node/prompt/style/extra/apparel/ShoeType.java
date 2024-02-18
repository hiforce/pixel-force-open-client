package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ShoeType implements IPromptType {
    BAREFOOT("barefoot", "赤脚"),
    NO_SHOES("no_shoes", "没有鞋子"),
    SHOES_REMOVED("shoes_removed", "脱下的鞋子"),
    SINGLE_SHOE("single_shoe", "单鞋"),
    THE_ONLY_SHOE("the_only_shoe", "单鞋"),
    BLACK_LOAFERS("black_loafers", "乐福鞋(小皮鞋)"),
    SHOES("shoes", "运动鞋"),
    UWABAKI("uwabaki", "室内鞋"),
    PLATFORM_FOOTWEAR("platform_footwear", "厚底鞋"),
    HIGH_HEELS("high_heels", "高跟鞋"),
    STILETTO_HEELS("stiletto_heels", "细跟高跟鞋"),
    STRAPPY_HEELS("strappy_heels", "带束带的高跟鞋"),
    PLATFORM_HEELS_("platform_heels_", "厚底高跟鞋"),
    RUDDER_FOOTWEAR("rudder_footwear", "舰C舰娘专用鞋"),
    SANDALS("sandals", "凉鞋"),
    BAREFOOT_SANDALS("barefoot_sandals", "裸足凉鞋"),
    CLOG_SANDALS("clog_sandals", "木屐凉鞋"),
    GETA("geta", "木屐"),
    SLIPPERS("slippers", "拖鞋"),
    SKATES("skates", "溜冰鞋"),
    ROLLER_SKATES("roller_skates", "旱冰鞋"),
    ANIMAL_FEET("animal_feet", "动物脚"),
    ANIMAL_SLIPPERS("animal_slippers", "动物拖鞋"),
    ANKLET("anklet", "脚环"),
    SHACKLES("shackles", "镣铐"),
    BROWN_FOOTWEAR("brown_footwear", "棕色鞋类"),
    CROSS_LACED_FOOTWEAR("cross-laced_footwear", "交叉系带鞋"),
    LOAFERS("loafers", "乐福鞋"),
    MARY_JANES("mary_janes", "珍妮鞋"),
    MISMATCHED_FOOTWEAR("mismatched_footwear", "双色鞋子"),
    POINTY_FOOTWEAR("pointy_footwear", "尖头鞋"),
    PUMPS("pumps", "低胸装高跟鞋打扮"),
    SANDALS_REMOVED("sandals_removed", "脱下凉鞋"),
    SHOE_SOLES("shoe_soles", "鞋底"),
    SHOELACES("shoelaces", "鞋带"),
    SNEAKERS("sneakers", "运动鞋"),
    WINGED_FOOTWEAR("winged_footwear", "带翅膀的鞋子"),
    ZOURI("zouri", "日式草鞋");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ShoeType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
