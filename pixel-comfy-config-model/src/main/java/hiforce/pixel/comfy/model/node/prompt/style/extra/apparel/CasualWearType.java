package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CasualWearType implements IPromptType {
    CASUAL("casual", "休闲"),
    LOUNGEWEAR("loungewear", "休闲服"),
    HOODIE("hoodie", "卫衣"),
    HOMEWEAR("homewear", "居家服"),
    PAJAMAS("pajamas", "睡衣"),
    NIGHTGOWN("nightgown", "睡衣"),
    SLEEPWEAR("sleepwear", "睡衣"),
    BABYDOLL("babydoll", "情趣睡衣"),
    PRINT_PAJAMAS("print_pajamas", "印花睡衣"),
    POLKA_DOT_PAJAMAS("polka_dot_pajamas", "波点睡衣"),
    YUKATA("yukata", "浴衣"),
    CHINESE_CLOTHES("chinese_clothes", "唐装"),
    HANFU("hanfu", "汉服"),
    TAOIST_ROBE("Taoist robe", "道袍"),
    ROBE("robe", "长袍"),
    ROBE_OF_BLENDING("robe_of_blending", "混合长袍"),
    CLOAK("cloak", "斗篷"),
    HOODED_CLOAK("hooded_cloak", "连帽斗篷"),
    WINTER_CLOTHES("winter_clothes", "冬装"),
    DOWN_JACKET("down jacket", "羽绒服"),
    SANTA("santa", "圣诞装"),
    HAREM_OUTFIT("harem_outfit", "舞娘服"),
    SHRUG_CLOTHING("shrug_(clothing)", "耸肩（服装）");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CasualWearType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
