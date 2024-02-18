package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum LegMovementsType implements IPromptType {
    LEGS_UP("legs_up", "抬一只腿"),
    SPREAD_LEGS("spread legs", "张腿"),
    LEGS_TOGETHER("legs_together", "两腿并拢"),
    CROSSED_LEGS("crossed_legs", "二郎腿"),
    M_LEGS("m_legs", "M字摆腿"),
    STANDING_SPLIT_LEG_UP("standing_split,_leg_up", "M字摆腿"),
    CURTSY("curtsy", "屈膝礼（女仆行礼）"),
    HAND_BETWEEN_LEGS("hand_between_legs", "双腿之间的手"),
    OPEN_STANCE("open_stance", "稍息"),
    CONVENIENT_LEG("convenient_leg", "挡住关键部位的腿"),
    LEG_LOCK("leg_lock", "用双腿夹住"),
    LEGS("legs", "双腿"),
    LEGS_OVER_HEAD("legs_over_head", "双腿抬过头"),
    SQUATTING_OPEN_LEGS("squatting,_open_legs", "蹲下分开双腿"),
    KNEES_TOGETHER_FEET_APART("knees_together_feet_apart", "膝盖合并，两脚分开"),
    ANIMAL_ON_LAP("animal_on_lap", "膝盖上有动物"),
    HAND_ON_OWN_KNEE("hand_on_own_knee", "手放在自己的膝盖上"),
    KNEE_UP("knee_up", "顶起膝盖"),
    KNEES("knees", "膝盖"),
    KNEES_TO_CHEST("knees_to_chest", "膝盖顶到胸部"),
    ON_LAP("on_lap", "在膝盖上"),
    SITTING("sitting", "坐"),
    WARIZA("wariza", "鸭子坐"),
    STRADDLING("straddling", "跨坐"),
    YOKOZUWARI("yokozuwari", "侧身坐"),
    SITTING_BACKWARDS("sitting_backwards", "向后坐"),
    SITTING_IN_TREE("sitting_in_tree", "坐在树上"),
    SITTING_ON_XX("sitting_on_xx", "坐在物体上"),
    BUTTERFLY_SITTING("butterfly_sitting", "蝴蝶坐"),
    LOTUS_POSITION("lotus_position", "坐在桌子上"),
    SITTING_ON_RAILING("sitting_on_railing", "坐在栏杆上"),
    SITTING_ON_ROCK("sitting_on_rock", "坐在石头"),
    SITTING_ON_STAIRS("sitting_on_stairs", "坐在楼梯上"),
    SITTING_ON_TABLE("sitting_on_table", "坐在桌子上"),
    SITTING_ON_WATER("sitting_on_water", "坐在水上"),
    CUSHION("cushion", "坐垫"),
    INDIAN_STYLE("indian_style", "盘腿坐"),
    SITTING_ON_CHAIR("sitting_on_chair", "坐在椅子上"),
    SIDESADDLE("sidesaddle", "侧坐在鞍上"),
    SITTING_ON_BED("sitting_on_bed", "坐在床上"),
    SITTING_ON_DESK("sitting_on_desk", "坐在课桌上"),
    SITTING_ON_LAP("sitting_on_lap", "坐在大腿上"),
    SITTING_ON_PERSON("sitting_on_person", "坐在人身上"),
    UPRIGHT_STRADDLE("upright_straddle", "对坐体位"),
    ONE_KNEE("one_knee", "一只膝盖"),
    KNEELING("kneeling", "下跪"),
    ALL_FOURS("all_fours", "四肢着地"),
    GRAVURE_POSE("gravure_pose", "凹版姿势"),
    KICKING("kicking", "踢"),
    HIGH_KICK("high_kick", "高踢"),
    SOAKING_FEET("soaking_feet", "泡脚"),
    RECLINING("reclining", "斜倚"),
    HUGGING_OWN_LEGS("hugging_own_legs", "抱自己的双腿"),
    BARE_LEGS("bare_legs", "裸腿"),
    BETWEEN_LEGS("between_legs", "(强调)两腿之间"),
    CROPPED_LEGS("cropped_legs", "只画了一部分腿"),
    K_DA_LEAGUE_OF_LEGENDS("k/da_(league_of_legends)", "KDA组合(英雄联盟)"),
    LEG_BELT("leg_belt", "腿部系着带子"),
    LEG_HAIR("leg_hair", "腿毛"),
    LEG_UP("leg_up", "抬起腿"),
    LEGS_APART("legs_apart", "两腿分开"),
    LOWLEG("lowleg", "M字摆腿"),
    MECHANICAL_LEGS("mechanical_legs", "机械义足"),
    MULTIPLE_LEGS("multiple_legs", "多足角色"),
    NO_LEGS("no_legs", "没画出腿"),
    NO_LEGWEAR("no_legwear", "裆胯以下裸着"),
    TAIL_BETWEEN_LEGS("tail_between_legs", "尾巴蜷到两腿之间"),
    BAREFOOT("barefoot", "裸足"),
    FOOT_OUT_OF_FRAME("foot_out_of_frame", "单脚不在图内"),
    FOOTPRINTS("footprints", "脚印"),
    DIRTY_FEET("dirty_feet", "脚的画法错误"),
    FEET("feet", "脚"),
    FEET_OUT_OF_FRAME("feet_out_of_frame", "双脚不在图内"),
    FEET_UP("feet_up", "翘起脚"),
    WRONG_FEET("wrong_feet", "脚部作画错误"),
    CAMELTOE("cameltoe", "骆驼趾"),
    PIGEON_TOED("pigeon-toed", "萌向的内八腿"),
    TIPTOES("tiptoes", "踮起脚尖"),
    TOE_POINT("toe-point", "趾尖|脚尖"),
    AMPUTEE("amputee", "欠损|独脚|肢体残缺|欠损少女"),
    ANKLE_STRAP("ankle_strap", "脚踝丝环"),
    ANKLE_WRAP("ankle_wrap", "脚踝套"),
    CROSSED_ANKLES("crossed_ankles", "交叉脚踝"),
    PINCE_NEZ("pince-nez", "夹鼻眼镜|无脚眼镜"),
    FOLDED("folded", "抬腿露阴"),
    THICK_THIGHS("thick_thighs", "肉腿"),
    THIGH_HOLSTER("thigh_holster", "腿上系着带子或工具包或枪套");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    LegMovementsType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
