package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum HatType implements IPromptType {
    HAT("hat", "帽子"),
    NO_HAT("no_hat", "没有帽子"),
    LARGE_HAT("large_hat", "大帽子"),
    MINI_HAT("mini_hat", "迷你帽"),
    WITCH_HAT("witch_hat", "魔女帽"),
    MINI_WITCH_HAT("mini_witch_hat", "迷你魔女帽"),
    WIZARD_HAT("wizard_hat", "巫师帽子"),
    PARTY_HAT("party_hat", "派对帽"),
    JESTER_CAP("jester_cap", "小丑帽"),
    TOKIN_HAT("tokin_hat", "大礼帽"),
    TOP_HAT("top_hat", "高顶礼帽"),
    MINI_TOP_HAT("mini_top_hat", "迷你礼帽"),
    BOWLER_HAT("bowler_hat", "圆顶礼帽"),
    PILLBOX_HAT("pillbox_hat", "药盒帽"),
    CLOCHE_HAT("cloche_hat", "钟形女帽"),
    SIDE_CAP("side_cap", "侧边帽"),
    MILITARY_HAT("military_hat", "军帽"),
    BERET("beret", "贝雷帽"),
    GARRISON_CAP("garrison_cap", "驻军帽"),
    POLICE_HAT("police_hat", "警察帽"),
    NURSE_CAP("nurse_cap", "护士帽"),
    CHEF_HAT("chef_hat", "厨师帽"),
    SCHOOL_HAT("school_hat", "校帽"),
    PIRATE_HAT("pirate_hat", "海盗帽"),
    CABBIE_HAT("cabbie_hat", "出租车司机帽"),
    BUCKET_HAT("bucket_hat", "渔夫帽"),
    HARDHAT("hardhat", "安全帽"),
    STRAW_HAT("straw_hat", "草帽"),
    SUN_HAT("sun_hat", "太阳帽"),
    RICE_HAT("rice_hat", "斗笠"),
    ANIMAL_HAT("animal_hat", "动物帽"),
    FUR_HAT("fur_hat", "皮帽"),
    HAT_WITH_EARS("hat_with_ears", "带耳朵的帽子"),
    BOBBLEHAT("bobblehat", "泡泡帽"),
    PILLOW_HAT("pillow_hat", "枕帽"),
    PUMPKIN_HAT("pumpkin_hat", "南瓜帽"),
    BASEBALL_CAP("baseball_cap", "棒球帽"),
    FLAT_CAP("flat_cap", "鸭舌帽"),
    TORN_HAT("torn_hat", "撕裂的帽子"),
    MOB_CAP("mob_cap", "暴民帽"),
    NEWSBOY_CAP("newsboy_cap", "报童帽"),
    BOWKNOT_OVER_WHITE_BERET("bowknot_over_white_beret", "白色贝雷帽上的蝴蝶结"),
    BACKWARDS_HAT("backwards_hat", "反扣的帽子"),
    BOWL_HAT("bowl_hat", "碗状帽子"),
    CAT_HAT("cat_hat", "猫耳帽子"),
    CHAT_LOG("chat_log", "聊天框风格"),
    COWBOY_HAT("cowboy_hat", "牛仔帽"),
    DIXIE_CUP_HAT("dixie_cup_hat", "狗盆帽"),
    HAT_BOW("hat_bow", "带有蝴蝶结的帽子"),
    HAT_FEATHER("hat_feather", "带有羽毛的帽子"),
    HAT_FLOWER("hat_flower", "带着花的帽子"),
    HAT_ORNAMENT("hat_ornament", "带有饰物的帽子"),
    HAT_OVER_ONE_EYE("hat_over_one_eye", "帽子遮住了一只眼"),
    HAT_REMOVED("hat_removed", "帽子被摘下|摘下帽子"),
    HAT_RIBBON("hat_ribbon", "带有缎带的帽子"),
    HAT_TIP("hat_tip", "捏着帽檐"),
    HATCHING_TEXTURE("hatching_(texture)", "线影法(纹理)"),
    HATSUNE_MIKU_COSPLAY("hatsune_miku_(cosplay)", "cos成初音未来"),
    PORKPIE_HAT("porkpie_hat", "道士帽"),
    SAILOR_HAT("sailor_hat", "水手帽"),
    SANTA_HAT("santa_hat", "圣诞帽"),
    SIDEWAYS_HAT("sideways_hat", "帽舌划到侧面");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HatType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
