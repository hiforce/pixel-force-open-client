package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SockType implements IPromptType {
    BODYSTOCKING("bodystocking", "全身袜"),
    PANTYHOSE("pantyhose", "连裤袜|裤袜"),
    LEGGINGS("leggings", "裤袜"),
    LEGWEAR("legwear", "裤袜(泛指裤袜或长筒袜)"),
    THIGHHIGHS("thighhighs", "长筒袜(过膝高筒袜)"),
    KNEEHIGHS("kneehighs", "中筒袜"),
    SOCKS("socks", "短袜"),
    BARE_LEGS("bare_legs", "裸腿"),
    BLACK_BODYSTOCKING("black_bodystocking", "连体黑丝"),
    WHITE_BODYSTOCKING("white_bodystocking", "连体白丝"),
    STOCKING_UNDER_CLOTHES("stocking_under_clothes", "衣服下的袜子"),
    BLACK_PANTYHOSE("black_pantyhose", "黑丝裤袜"),
    WHITE_PANTYHOSE("white_pantyhose", "白丝裤袜"),
    THIGHBAND_PANTYHOSE("thighband_pantyhose", "有腿环的裤袜"),
    PANTYLINES("pantylines", "紧致的裤袜(勾勒出线条"),
    SINGLE_LEG_PANTYHOSE("single_leg_pantyhose", "单边穿着连裤袜"),
    PANTIES_UNDER_PANTYHOSE("panties_under_pantyhose", "裤袜里的内裤"),
    FISHNETS("fishnets", "网袜(材质)"),
    STIRRUP_LEGWEAR("stirrup_legwear", "渔网袜"),
    TOELESS_LEGWEAR("toeless_legwear", "露趾袜"),
    MISMATCHED_LEGWEAR("mismatched_legwear", "双色裤袜"),
    TWO_TONE_LEGWEAR("two-tone_legwear", "双色裤袜"),
    ASYMMETRICAL_LEGWEAR("asymmetrical_legwear", "不对称裤袜"),
    UNEVEN_LEGWEAR("uneven_legwear", "长短袜"),
    WHITE_THIGHHIGHS("white_thighhighs", "白色长筒袜"),
    BLACK_THIGHHIGHS("black_thighhighs", "黑色长筒袜"),
    PINK_THIGHHIGHS("pink_thighhighs", "粉色长筒袜"),
    SUSPENDERS("suspenders", "吊带袜"),
    GARTER_STRAPS("garter_straps", "腰带(吊带袜的)"),
    TORN_LEGWEAR("torn_legwear", "破损的裤袜"),
    TORN_THIGHHIGHS("torn_thighhighs", "损坏了的长筒袜"),
    SEE_THROUGH_LEGWEAR_("see-through_legwear_", "透明的袜子"),
    FRILLED_LEGWEAR("frilled_legwear", "花边袜"),
    LACE_TRIMMED_LEGWEAR("lace-trimmed_legwear", "蕾边袜丝"),
    SEAMED_LEGWEAR("seamed_legwear", "有接缝的袜"),
    BACK_SEAMED_LEGWEAR("back-seamed_legwear", "中间有一条黑线的袜子"),
    ANIMAL_EAR_LEGWEAR("animal_ear_legwear", "动物耳朵过膝袜"),
    STRIPED_LEGWEAR("striped_legwear", "横条纹袜"),
    VERTICAL_STRIPED_LEGWEAR("vertical-striped_legwear", "竖条纹袜"),
    POLKA_DOT_LEGWEAR("polka_dot_legwear", "圆斑袜"),
    PRINT_LEGWEAR("print_legwear", "印花袜"),
    LEGWEAR_UNDER_SHORTS("legwear_under_shorts", "短裤穿在袜子外"),
    OVER_KNEEHIGHS("over-kneehighs", "过膝袜"),
    BOBBY_SOCKS("bobby_socks", "鲍比袜(白短袜)"),
    TABI("tabi", "日式厚底短袜(足袋)"),
    LOOSE_SOCKS("loose_socks", "泡泡袜"),
    ANKLE_SOCKS("ankle_socks", "踝袜"),
    LEG_WARMERS("leg_warmers", "腿套|暖腿袜"),
    SINGLE_SOCK("single_sock", "单短袜"),
    STRIPED_SOCKS("striped_socks", "横条短袜");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SockType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
