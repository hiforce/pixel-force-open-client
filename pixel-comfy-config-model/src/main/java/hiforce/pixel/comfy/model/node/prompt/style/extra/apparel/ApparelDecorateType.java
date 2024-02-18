package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ApparelDecorateType implements IPromptType {
    FRILLED("frilled", "褶边"),
    CENTER_FRILLS("center_frills", "中心褶花边"),
    CREASE("crease", "起皱的(有褶的)"),
    LAYERED("layered", "分层的"),
    LACE("lace", "蕾丝"),
    FUR_TRIM("fur_trim", "皮草饰边"),
    FUR_TRIMMED("fur-trimmed", "毛边的"),
    FINE_FABRIC_EMPHASIS("fine_fabric_emphasis", "材质增强"),
    LATEX_THIGHHIGHS("latex_thighhighs", "乳胶材质的长筒袜"),
    SEE_THROUGH_THIGHHIGHS("see-through_thighhighs", "透明的长筒袜"),
    ASS_CUTOUT("ass_cutout", "露出屁股的服饰"),
    ASYMMETRICAL_CLOTHES("asymmetrical_clothes", "不对称的服饰"),
    BACK_BOW("back_bow", "(服饰)打在背后的结"),
    COSTUME_SWITCH("costume_switch", "服饰互换"),
    CROSS_LACED_CLOTHES("cross-laced_clothes", "交叉花边服饰"),
    DOUBLE_VERTICAL_STRIPE("double_vertical_stripe", "服饰上有两条平行条纹"),
    HALTER_TOP("halter_top", "吊带式的上身的服饰"),
    MULTICOLORED_LEGWEAR("multicolored_legwear", "多色款腿部服饰"),
    NAVY_BLUE_LEGWEAR("navy_blue_legwear", "海军蓝腿部服饰"),
    NONTRADITIONAL_MIKO("nontraditional_miko", "改款过的日本服饰"),
    SIDE_CUTOUT("side_cutout", "侧边开口的服饰"),
    SIDE_SLIT("side_slit", "侧面有缝的服饰"),
    SIDELESS_OUTFIT("sideless_outfit", "侧面没有布料的服饰"),
    SINGLE_KNEEHIGH("single_kneehigh", "单边穿着过膝服饰"),
    SINGLE_VERTICAL_STRIPE("single_vertical_stripe", "露出单边服饰上的垂直条纹"),
    TURTLENECK("turtleneck", "高领服饰"),
    TWO_SIDED_FABRIC("two-sided_fabric", "双层样式的服饰画法"),
    O_RING("o-ring", "带O型环的衣物"),
    O_RING_TOP("o-ring_top", "带O型环的上衣"),
    FRINGE_TRIM("fringe_trim", "须边(围巾末端"),
    LOOSE_BELT("loose_belt", "松散的带子(衣物)"),
    POM_POM_CLOTHES("pom_pom_(clothes)", "小绒球(衣物挂件)"),
    DRAWSTRING("drawstring", "衣服的抽绳"),
    FULL_LENGTH_ZIPPER("full-length_zipper", "有整件衣物长的拉链"),
    GATHERS("gathers", "褶裥(衣物)"),
    GUSSET("gusset", "缝在衣服上衬料"),
    BREAST_POCKET("breast_pocket", "胸口的袋子");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ApparelDecorateType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
