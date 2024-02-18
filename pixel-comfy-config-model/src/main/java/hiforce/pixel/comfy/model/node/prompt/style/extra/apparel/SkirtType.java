package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SkirtType implements IPromptType {
    DRESS("dress", "连衣裙"),
    MICRODRESS("microdress", "微型连衣裙"),
    LONG_DRESS("long_dress", "长连衣裙"),
    OFF_SHOULDER_DRESS("off-shoulder_dress", "露肩连衣裙"),
    STRAPLESS_DRESS("strapless_dress", "无肩带连衣裙"),
    BACKLESS_DRESS("backless_dress", "露背连衣裙"),
    HALTER_DRESS("halter_dress", "绕颈露背吊带裙"),
    SUNDRESS("sundress", "吊帶連衣裙（大熱天穿的無袖連衣裙）"),
    SLEEVELESS_DRESS("sleeveless_dress", "无袖连衣裙"),
    SAILOR_DRESS("sailor_dress", "水手服款裙子"),
    SUMMER_DRESS("summer_dress", "夏日长裙"),
    CHINA_DRESS("china_dress", "中国服饰"),
    PINAFORE_DRESS("pinafore_dress", "围裙连衣裙"),
    SWEATER_DRESS("sweater_dress", "围裙连衣裙"),
    WEDDING_DRESS("wedding_dress", "婚纱"),
    ARMORED_DRESS("armored_dress", "战甲裙"),
    FRILLED_DRESS("frilled_dress", "花边连衣裙"),
    LACE_TRIMMED_DRESS("lace-trimmed_dress", "蕾丝边连衣裙"),
    COLLARED_DRESS("collared_dress", "有领连衣裙"),
    FUR_TRIMMED_DRESS("fur-trimmed_dress", "毛皮镶边连衣裙"),
    LAYERED_DRESS("layered_dress", "分层连衣裙"),
    PLEATED_DRESS("pleated_dress", "百褶连衣裙"),
    TAUT_DRESS("taut_dress", "绷紧的连衣裙"),
    PENCIL_DRESS("pencil_dress", "铅笔裙"),
    IMPOSSIBLE_DRESS("impossible_dress", "过分紧身的衣服"),
    MULTICOLORED_DRESS("multicolored_dress", "多色款连衣裙"),
    STRIPED_DRESS("striped_dress", "条纹连衣裙"),
    CHECKERED_SKIRT("checkered_skirt", "格子裙"),
    PLAID_DRESS("plaid_dress", "格子连衣裙"),
    RIBBED_DRESS("ribbed_dress", "罗纹连衣裙"),
    POLKA_DOT_DRESS("polka_dot_dress", "波点连衣裙"),
    PRINT_DRESS("print_dress", "印花连衣裙"),
    VERTICAL_STRIPED_DRESS("vertical-striped_dress", "竖条纹连衣裙"),
    SEE_THROUGH_DRESS("see-through_dress", "透视连衣裙"),
    SKIRT("skirt", "短裙"),
    MICROSKIRT("microskirt", "超短裙"),
    MINISKIRT("miniskirt", "迷你裙"),
    SKIRT_SUIT("skirt_suit", "正装短裙"),
    BIKINI_SKIRT("bikini_skirt", "比基尼裙"),
    PLEATED_SKIRT("pleated_skirt", "百褶裙"),
    PENCIL_SKIRT("pencil_skirt", "短铅笔裙"),
    BUBBLE_SKIRT("bubble_skirt", "蓬蓬裙"),
    TUTU("tutu", "芭蕾舞裙"),
    BALLGOWN("ballgown", "蓬蓬裙(禮服)"),
    PETTISKIRT("pettiskirt", "蓬蓬裙(兒童)"),
    SHOWGIRL_SKIRT("showgirl_skirt", "展会女郎装束"),
    MEDIUM_LENGTH_SKIRT("Medium length skirt", "中等长裙子"),
    BELTSKIRT("beltskirt", "皮带裙"),
    DENIM_SKIRT("denim_skirt", "牛仔裙"),
    SUSPENDER_SKIRT("suspender_skirt", "吊带裙"),
    SKIRT_SET("skirt_set", "与上衣搭配的短裙"),
    LONG_SKIRT("long_skirt", "长裙"),
    SUMMER_LONG_SKIRT("summer_long_skirt", "夏日长裙"),
    OVERSKIRT("overskirt", "外裙"),
    HAKAMA_SKIRT("hakama_skirt", "袴裙"),
    HIGH_WAIST_SKIRT("high-waist_skirt", "高腰裙"),
    KIMONO_SKIRT("kimono_skirt", "和服裙"),
    SUSPENDER_LONG_SKIRT("suspender_long_skirt", "背带裙;吊带裙"),
    CHIFFON_SKIRT("chiffon_skirt", "雪紡裙"),
    FRILLED_SKIRT("frilled_skirt", "花边裙子"),
    FUR_TRIMMED_SKIRT("fur-trimmed_skirt", "毛皮镶边短裙"),
    LACE_SKIRT("lace_skirt", "蕾絲短裙"),
    LACE_TRIMMED_SKIRT("lace-trimmed_skirt", "蕾丝边短裙"),
    RIBBON_TRIMMED_SKIRT("ribbon-trimmed_skirt", "缎带饰边短裙"),
    LAYERED_SKIRT("layered_skirt", "分层的半裙"),
    PRINT_SKIRT("print_skirt", "印花短裙"),
    MULTICOLORED_SKIRT("multicolored_skirt", "多色款裙子"),
    STRIPED_SKIRT("striped_skirt", "条纹裙"),
    VERTICAL_STRIPED_SKIRT("vertical-striped_skirt", "竖条纹裙子"),
    PLAID_SKIRT("plaid_skirt", "格子呢短裙"),
    FLARED_SKIRT("flared_skirt", "伞裙"),
    FLORAL_SKIRT("floral_skirt", "碎花裙");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SkirtType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
