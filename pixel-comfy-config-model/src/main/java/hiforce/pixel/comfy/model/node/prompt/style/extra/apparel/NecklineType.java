package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum NecklineType implements IPromptType {
    SAILOR_COLLAR("sailor_collar", "水手领"),
    FUR_COLLAR("fur_collar", "毛皮衣领"),
    FRILLED_COLLAR("frilled_collar", "花边衣领"),
    POPPED_COLLAR("popped_collar", "竖起来的衣领"),
    CHOKER("choker", "颈部饰品"),
    BLACK_CHOKER("black_choker", "黑色颈圈"),
    BELT_COLLAR("belt_collar", "皮带颈环"),
    FRILLED_CHOKER("frilled_choker", "褶边项链"),
    NECKERCHIEF("neckerchief", "领巾"),
    RED_NECKERCHIEF("red_neckerchief", "红领巾"),
    NECKTIE("necktie", "领带"),
    SHORT_NECKTIE("short_necktie", "短领带"),
    WHITE_NECKTIE("white_necktie", "白色领带"),
    BOWTIE("bowtie", "蝴蝶结领带"),
    HEADPHONES_AROUND_NECK("headphones_around_neck", "挂在脖子上的耳机"),
    GOGGLES_AROUND_NECK("goggles_around_neck", "脖子上护目镜"),
    NECK_BELL("neck_bell", "颈铃"),
    NECK_RUFF("neck_ruff", "领口"),
    V_NECK("v-neck", "V领"),
    TOWEL_AROUND_NECK("towel_around_neck", "脖子上的毛巾"),
    LOOSE_NECKTIE("loose_necktie", "宽松领带"),
    NECK_TATTOO("neck_tattoo", "颈部纹身"),
    ASCOT("ascot", "领巾状宽领带"),
    RIBBON_CHOKER("ribbon_choker", "颈丝带"),
    MAEBARI_PASTIES("maebari/pasties", "阴贴/乳贴"),
    LATEX("latex", "乳贴"),
    TORN_CLOTHES("torn_clothes", "破烂衣服"),
    IRON_CROSS("iron_cross", "铁十字勋章"),
    CHINESE_KNOT("chinese_knot", "中国结"),
    CROSS_NECKLACE("cross_necklace", "十字架项链"),
    BEAD_NECKLACE("bead_necklace", "珠子项链"),
    PEARL_NECKLACE("pearl_necklace", "珍珠项链"),
    HEART_NECKLACE("heart_necklace", "心形项链"),
    CARROT_NECKLACE("carrot_necklace", "胡萝卜项链"),
    CHAIN_NECKLACE("chain_necklace", "锁链项链"),
    MAGATAMA_NECKLACE("magatama_necklace", "珠玉项链"),
    TOOTH_NECKLACE("tooth_necklace", "牙项链"),
    KEY_NECKLACE("key_necklace", "钥匙项链"),
    ANCHOR_NECKLACE("anchor_necklace", "锚项链"),
    SKULL_NECKLACE("skull_necklace", "骷髅项链"),
    SHELL_NECKLACE("shell_necklace", "贝壳项链"),
    GOLD_NECKLACE("gold_necklace", "金项链"),
    CRESCENT_NECKLACE("crescent_necklace", "新月项链"),
    RING_NECKLACE("ring_necklace", "戒指项链"),
    FEATHER_NECKLACE("feather_necklace", "羽毛项链"),
    BONE_NECKLACE("bone_necklace", "骨项链"),
    ANKH_NECKLACE("ankh_necklace", "十字项链"),
    MULTIPLE_NECKLACES("multiple_necklaces", "多条项链"),
    BULLET_NECKLACE("bullet_necklace", "子弹项链"),
    HOLDING_NECKLACE("holding_necklace", "拿着项链"),
    NECKLACE_REMOVED("necklace_removed", "项链被移除"),
    BROWN_NECKWEAR("brown_neckwear", "棕色领饰"),
    CHECKERED_NECKWEAR("checkered_neckwear", "格子领口"),
    DIAGONAL_STRIPED_NECKWEAR("diagonal-striped_neckwear", "斜纹领结"),
    HALTERNECK("halterneck", "绕颈系带"),
    MOLE_ON_NECK("mole_on_neck", "脖子上有痣"),
    NECK("neck", "脖子"),
    NECK_RIBBON("neck_ribbon", "颈部系着缎带"),
    NECK_RING("neck_ring", "颈环"),
    NECKLACE("necklace", "项链"),
    PLAID_NECKWEAR("plaid_neckwear", "格子呢领子"),
    PLUNGING_NECKLINE("plunging_neckline", "深领"),
    PRINT_NECKWEAR("print_neckwear", "印花领带"),
    SLEEVELESS_TURTLENECK("sleeveless_turtleneck", "无袖高领毛衣"),
    STAR_NECKLACE("star_necklace", "星形项链"),
    STRIPED_NECKWEAR("striped_neckwear", "条纹领子"),
    TURTLENECK_SWEATER("turtleneck_sweater", "高领毛衣"),
    UNDONE_NECKTIE("undone_necktie", "解开领带"),
    WHISTLE_AROUND_NECK("whistle_around_neck", "脖子上挂着口哨");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    NecklineType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
