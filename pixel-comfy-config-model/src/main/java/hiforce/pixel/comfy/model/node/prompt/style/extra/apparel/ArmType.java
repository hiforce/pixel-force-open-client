package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ArmType implements IPromptType {
    LONG_SLEEVES("long_sleeves", "长袖"),
    SHORT_SLEEVES("short_sleeves", "短袖"),
    WIDE_SLEEVES("wide_sleeves", "宽袖"),
    FURISODE("furisode", "振袖"),
    DETACHED_SLEEVES("detached_sleeves", "分离式袖子"),
    SINGLE_SLEEVE("single_sleeve", "单袖"),
    SLEEVELESS("sleeveless", "无袖"),
    ASYMMETRICAL_SLEEVES("asymmetrical_sleeves", "不对称袖子"),
    PUFFY_SLEEVES("puffy_sleeves", "蓬松的袖子"),
    PUFFY_LONG_SLEEVES("puffy_long_sleeves", "蓬蓬长袖"),
    PUFFY_SHORT_SLEEVES("puffy_short_sleeves", "蓬蓬短袖"),
    FRILLED_SLEEVES("frilled_sleeves", "褶袖边"),
    JULIET_SLEEVES("juliet_sleeves", "朱丽叶袖"),
    BANDAGED_ARM("bandaged_arm", "绷带手臂"),
    RAGLAN_SLEEVES("raglan_sleeves", "插肩袖"),
    VAMBRACES("vambraces", "下臂护甲"),
    LAYERED_SLEEVES("layered_sleeves", "分层袖子"),
    FUR_TRIMMED_SLEEVES("fur-trimmed_sleeves", "毛边袖子"),
    SEE_THROUGH_SLEEVES("see-through_sleeves", "透明袖子"),
    TORN_SLEEVES("torn_sleeves", "撕裂的袖子"),
    SLEEVES_PAST_FINGERS("sleeves_past_fingers", "袖子过指"),
    SLEEVES_PAST_WRISTS("sleeves_past_wrists", "袖子过腕"),
    SLEEVES_PAST_ELBOWS("sleeves_past_elbows", "袖子过肘"),
    SLEEVES_PUSHED_UP("sleeves_pushed_up", "袖子上推"),
    ARM_OUT_OF_SLEEVE("arm_out_of_sleeve", "袖子里的手臂"),
    UNEVEN_SLEEVES("uneven_sleeves", "不均匀的袖子"),
    MISMATCHED_SLEEVES("mismatched_sleeves", "不匹配的袖子"),
    SLEEVE_ROLLED_UP("sleeve_rolled_up", "袖子卷起"),
    SLEEVES_ROLLED_UP("sleeves_rolled_up", "单只袖子卷起"),
    FEATHER_TRIMMED_SLEEVES("feather-trimmed_sleeves", "羽毛装饰的袖子"),
    HANDS_IN_OPPOSITE_SLEEVES("hands_in_opposite_sleeves", "双手交叉伸进袖子里"),
    LACE_TRIMMED_SLEEVES("lace-trimmed_sleeves", "蕾丝边袖子"),
    PINCHING_SLEEVES("pinching_sleeves", "掐袖子"),
    PUFFY_DETACHED_SLEEVES("puffy_detached_sleeves", "蓬蓬的袖子"),
    RIBBED_SLEEVES("ribbed_sleeves", "棱纹袖子"),
    SINGLE_DETACHED_SLEEVE("single_detached_sleeve", "单边没脱掉的袖子"),
    SLEEVES_FOLDED_UP("sleeves_folded_up", "叠起来的袖子"),
    STRIPED_SLEEVES("striped_sleeves", "条纹袖子"),
    WRIST_CUFFS("wrist_cuffs", "和袖子分开的手腕的袖口"),
    ARMBAND("armband", "袖章(臂带)"),
    ARMLET("armlet", "臂镯"),
    BANDAGE("bandage", "绷带"),
    LEASH("leash", "皮带"),
    ARM_TATTOO("arm_tattoo", "手臂纹身"),
    NUMBER_TATTOO("number_tattoo", "数字文身"),
    BEAD_BRACELET("bead_bracelet", "珠子手链"),
    BRACELET("bracelet", "手镯"),
    FLOWER_BRACELET("flower_bracelet", "花手镯"),
    SPIKED_BRACELET("spiked_bracelet", "带钉手镯"),
    WRISTBAND("wristband", "腕带"),
    BRACER("bracer", "护腕"),
    CUFFS("cuffs", "袖口"),
    BOUND_WRISTS("bound_wrists", "绑定手腕"),
    WRIST_SCRUNCHIE("wrist_scrunchie", "手腕发圈"),
    HANDCUFFS("handcuffs", "手铐"),
    SHACKLES("shackles", "手铐"),
    CHAINS("chains", "锁链"),
    CHAIN_LEASH("chain_leash", "锁链带牵绳");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ArmType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
