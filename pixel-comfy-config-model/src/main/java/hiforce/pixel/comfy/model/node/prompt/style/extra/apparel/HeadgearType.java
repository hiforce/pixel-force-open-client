package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum HeadgearType implements IPromptType {
    HALO("halo", "光环"),
    MECHANICAL_HALO("mechanical_halo", "机械光环"),
    HEADWEAR("headwear", "头饰"),
    HEADPIECE("headpiece", "头饰"),
    HEADWEAR_REMOVED("headwear_removed", "头饰已移除"),
    HEAD_WREATH("head_wreath", "头花环"),
    CROWN("crown", "皇冠"),
    MINI_CROWN("mini_crown", "迷你皇冠"),
    TIARA("tiara", "头冠"),
    DIADEM("diadem", "同上"),
    TILTED_HEADWEAR("tilted_headwear", "倾斜的头饰"),
    HEAD_FINS("head_fins", "头鳍"),
    MAID_HEADDRESS("maid_headdress", "女仆头饰"),
    BRIDAL_VEIL("bridal_veil", "新娘头纱"),
    HEADBAND("headband", "头带"),
    HELMET("helmet", "头盔"),
    ALTERNATE_HEADWEAR("alternate_headwear", "与原设不同的头饰"),
    FUR_TRIMMED_HEADWEAR("fur-trimmed_headwear", "毛边头饰"),
    GOGGLES_ON_HEADWEAR("goggles_on_headwear", "帽子上的护目镜"),
    EARPHONES("earphones", "耳机"),
    EARMUFFS("earmuffs", "耳罩"),
    EARS_THROUGH_HEADWEAR("ears_through_headwear", "耳朵穿过头饰"),
    XX_ON_HEAD("xx_on_head", "xx在头上"),
    LEAF_ON_HEAD("leaf_on_head", "头上的叶子"),
    TOPKNOT("topknot", "纂"),
    SUIGINTOU("suigintou", "水银头"),
    TRIANGULAR_HEADPIECE("triangular_headpiece", "三角头饰"),
    FOREHEAD_PROTECTOR("forehead_protector", "护额"),
    RADIO_ANTENNA("radio_antenna", "天线"),
    ANIMAL_HOOD("animal_hood", "兽耳头罩"),
    ARROW_SYMBOL("arrow_(symbol)", "箭头"),
    AXE("axe", "斧头"),
    BALD("bald", "秃头"),
    BANDANA("bandana", "头巾"),
    BOB_CUT("bob_cut", "波波头"),
    BONE("bone", "骨头"),
    BOWL_CUT("bowl_cut", "锅盖头"),
    CIRCLET("circlet", "头冠"),
    DOUBLE_BUN("double_bun", "团子头"),
    DOUBLE_DILDO("double_dildo", "双头假阴茎"),
    DRILL("drill", "钻头"),
    FAUCET("faucet", "水龙头"),
    HACHIMAKI("hachimaki", "扎头巾(名词)"),
    HAIR_BEHIND_EAR("hair_behind_ear", "耳后有头发"),
    HAIR_BELL("hair_bell", "头发上系着铃铛"),
    HAIR_BUN("hair_bun", "发髻|团子头"),
    HAIR_DOWN("hair_down", "披下来的头发"),
    HAIR_FLAPS("hair_flaps", "在摆动的头发"),
    HAIR_FLIP("hair_flip", "拨头发"),
    HAIR_FLOWER("hair_flower", "头发上别着花"),
    HAIR_SPREAD_OUT("hair_spread_out", "散开的头发"),
    HAIR_UP("hair_up", "盘起来的头发"),
    HELM("helm", "戴着头盔的"),
    HELMET_REMOVED("helmet_removed", "摘下头盔|被摘下的头盔"),
    HORNED_HELMET("horned_helmet", "带角头盔"),
    JAPARI_BUN("japari_bun", "加帕里馒头"),
    KERCHIEF("kerchief", "方头巾"),
    MAMI_MOGU_MOGU("mami_mogu_mogu", "麻美断头梗"),
    MOB_CAP("mob_cap", "头巾式室内女帽"),
    ONE_SIDE_UP("one_side_up", "只扎了一边的头发"),
    OWL("owl", "猫头鹰"),
    PIER("pier", "突码头"),
    PILLOW("pillow", "枕头"),
    RAISED_FIST("raised_fist", "举起的拳头"),
    SKULL_AND_CROSSBONES("skull_and_crossbones", "头骨和交叉的骨头"),
    STONE("stone", "石头"),
    TURBAN("turban", "穆斯林头巾"),
    TWIN_DRILLS("twin_drills", "双钻头发型"),
    UPDO("updo", "头发往上蜷的发型"),
    WET_HAIR("wet_hair", "湿头发"),
    HEADDRESS("headdress", "头部穿戴物(偏笼统)"),
    ADJUSTING_HEADWEAR("adjusting_headwear", "整理头饰"),
    BEAR_HAIR_ORNAMENT("bear_hair_ornament", "熊印花头饰"),
    BROWN_HEADWEAR("brown_headwear", "棕色头饰"),
    HORNED_HEADWEAR("horned_headwear", "角状头饰"),
    HORNS_THROUGH_HEADWEAR("horns_through_headwear", "为角留了洞的头饰"),
    NO_HEADWEAR("no_headwear", "去掉了(原设有的)头饰"),
    OBJECT_ON_HEAD("object_on_head", "头上有非头饰类的物体"),
    PRINT_HEADWEAR("print_headwear", "印花头饰"),
    BONE_HAIR_ORNAMENT("bone_hair_ornament", "骨头状饰品"),
    BUNNY_HAIR_ORNAMENT("bunny_hair_ornament", "兔子饰品"),
    HORN_ORNAMENT("horn_ornament", "角上有饰物"),
    ANIMAL_ON_HEAD("animal_on_head", "头上有动物"),
    BEHIND_THE_HEAD_HEADPHONES("behind-the-head_headphones", "从后脑戴上的耳机"),
    BIRD_ON_HEAD("bird_on_head", "头上的鸟"),
    CAT_EAR_HEADPHONES("cat_ear_headphones", "猫耳式耳机"),
    CAT_ON_HEAD("cat_on_head", "头上趴着猫"),
    EYEWEAR_ON_HEAD("eyewear_on_head", "眼镜别在头上"),
    FOREHEAD("forehead", "额头"),
    FOREHEAD_JEWEL("forehead_jewel", "额前有宝石"),
    FOREHEAD_KISS("forehead_kiss", "亲吻额头"),
    FOREHEAD_MARK("forehead_mark", "额前有图案"),
    FOREHEAD_TO_FOREHEAD("forehead-to-forehead", "额头贴额头"),
    GOGGLES_ON_HEAD("goggles_on_head", "头上别着护目镜"),
    HEAD("head", "头"),
    HEAD_BUMP("head_bump", "头上起包"),
    HEAD_DOWN("head_down", "低着头"),
    HEAD_MOUNTED_DISPLAY("head_mounted_display", "戴着头戴显示设备"),
    HEAD_OUT_OF_FRAME("head_out_of_frame", "一部分头部没画进框里"),
    HEAD_REST("head_rest", "枕着头|托着头"),
    HEAD_TILT("head_tilt", "歪着头"),
    HEAD_WINGS("head_wings", "头上有翅膀"),
    HEADGEAR("headgear", "头部饰品(含一定科幻元素)"),
    HEADPHONES("headphones", "耳机"),
    HEADS_UP_DISPLAY("heads-up_display", "状态条(游戏和科幻风格)"),
    HEADSET("headset", "头戴式耳机"),
    INTER_HEADSET("inter_headset", "EVA神经连接器"),
    ON_HEAD("on_head", "在头上"),
    PERSON_ON_HEAD("person_on_head", "小人儿在头上"),
    SINGLE_HEAD_WING("single_head_wing", "单侧头上有翅膀");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HeadgearType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
