package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum HandMovementsType implements IPromptType {
    ARMS_BEHIND_BACK("arms_behind_back", "手放在身后"),
    ARM_ABOVE_HEAD("arm_above_head", "手在头上"),
    ARM_BEHIND_HEAD("arm_behind_head", "手放头后"),
    ARMS_CROSSED("arms_crossed", "手交叉于胸前"),
    ARM_SUPPORT("arm_support", "用手支撑住"),
    ARMPITS("armpits", "露腋"),
    ARMS_UP("arms_up", "抬手"),
    HANDS_ON_HIPS("hands_on_hips", "双手叉腰"),
    ARM_AROUND_WAIST("arm_around_waist", "单手搂腰"),
    CARAMELLDANSEN("caramelldansen", "某著名伸手扭腰动作"),
    HANDS_IN_OPPOSITE_SLEEVES("hands_in_opposite_sleeves", "双手反袖"),
    WAVING("waving", "招手"),
    CROSSED_ARMS("crossed_arms", "交叉双臂"),
    OUTSTRETCHED_ARMS("outstretched_arms", "伸出双臂"),
    V_ARMS("v_arms", "双臂摆出V"),
    W_ARMS("w_arms", "双臂摆出W"),
    SALUTE("salute", "敬礼"),
    REACHING("reaching", "(有目的地)伸手"),
    REACHING_OUT("reaching_out", "朝画外伸手"),
    STRETCH("stretch", "伸懒腰"),
    HUGGING_OWN_LEGS("hugging_own_legs", "拥抱自己的腿"),
    ARM_BLADE("arm_blade", "手臂刀刃"),
    ARM_GRAB("arm_grab", "抓住手臂"),
    ARM_HELD_BACK("arm_held_back", "手臂往后拉"),
    ARM_RIBBON("arm_ribbon", "手臂丝带"),
    BANDAGED_ARM("bandaged_arm", "缠着绷带的手臂"),
    BANDAID_ON_ARM("bandaid_on_arm", "手臂上贴着创可贴"),
    BOUND_ARMS("bound_arms", "手臂被束缚"),
    CONVENIENT_ARM("convenient_arm", "遮住关键部位的手臂"),
    EXTRA_ARMS("extra_arms", "多只手臂"),
    LOCKED_ARMS("locked_arms", "互挽手臂"),
    OUTSTRETCHED_ARM("outstretched_arm", "伸出手臂"),
    WAVING_ARMS("waving_arms", "挥舞着手臂"),
    ARM_AT_SIDE("arm_at_side", "单手垂放"),
    ARM_BEHIND_BACK("arm_behind_back", "单手背到身后"),
    SHOU("shou", "单手托在脑后"),
    ARM_CANNON("arm_cannon", "手炮"),
    ARM_HUG("arm_hug", "挽手"),
    ARM_UP("arm_up", "举着手"),
    ARMS_AT_SIDES("arms_at_sides", "双手垂放"),
    ARMS_BEHIND_HEAD("arms_behind_head", "双手抱头"),
    HAND_TO_MOUTH("hand_to_mouth", "手放在嘴边"),
    SHUSHING("shushing", "嘘手势"),
    CAT_POSE("cat_pose", "猫爪手势"),
    CLAW_POSE("claw_pose", "爪手势"),
    PAW_POSE("paw_pose", "招财猫手势(下弯手腕)"),
    FOX_SHADOW_PUPPET("fox_shadow_puppet", "狐狸手势"),
    DOUBLE_FOX_SHADOW_PUPPET("double_fox_shadow_puppet", "b"),
    FINGER_GUN("finger_gun", "手指枪手势"),
    V("v", "胜利手势"),
    DOUBLE_V("double_v", "双_v"),
    THUMBS_UP("thumbs_up", "翘大拇指"),
    INDEX_FINGER_RAISED("index_finger_raised", "食指抬起"),
    MIDDLE_FINGER("middle_finger", "国际友好手势"),
    GRIMACE("grimace", "做鬼脸"),
    EYELID_PULL("eyelid_pull", "做鬼脸"),
    FINGERSMILE("fingersmile", "用手指做出笑脸"),
    WIPING_TEARS("wiping_tears", "擦眼泪"),
    FINGER_ON_TRIGGER("finger_on_trigger", "准备扣扳机的手势"),
    POINTING_AT_SELF("pointing_at_self", "指着自己"),
    POINTING_AT_VIEWER("pointing_at_viewer", "指向看图的人"),
    POINTING_UP("pointing_up", "向上指"),
    POKING("poking", "戳"),
    HAND_GESTURE("hand_gesture", "做手势"),
    OK_SIGN("ok_sign", "OK手势"),
    SHADING_EYES("shading_eyes", "遮阳手势"),
    FINGER_BITING("finger_biting", "咬手指"),
    FINGER_IN_MOUTH("finger_in_mouth", "吮吸手指"),
    FINGERING_THROUGH_CLOTHES("fingering_through_clothes", "手指"),
    FINGERS_TOGETHER("fingers_together", "手指并拢"),
    HAIR_TWIRLING("hair_twirling", "手指卷着头发"),
    HANDS_CLASPED("hands_clasped", "双手手指交叉|双手紧握"),
    HOLDING_HAIR("holding_hair", "握着头发|手指绕着头发"),
    POINTING("pointing", "用手指着"),
    SHARP_FINGERNAILS("sharp_fingernails", "锐利的手指甲"),
    SLEEVES_PAST_FINGERS("sleeves_past_fingers", "袖子长过手指"),
    SPREAD_FINGERS("spread_fingers", "张开手指"),
    TRIGGER_DISCIPLINE("trigger_discipline", "手指没放在扳机上"),
    W("w", "手指比W"),
    BALANCING("balancing", "(保持)平衡的姿势"),
    CURVY("curvy", "展现魅力的姿势"),
    MULTIPLE_VIEWS("multiple_views", "多角度|多姿势"),
    POSE("pose", "姿势"),
    READY_TO_DRAW("ready_to_draw", "准备拔刀的姿势"),
    TREFOIL("trefoil", "一种女性展示臀部的姿势"),
    ZOMBIE_POSE("zombie_pose", "僵尸姿势"),
    BECKONING("beckoning", "招手"),
    BUNCHING_HAIR("bunching_hair", "手持辫子"),
    CARRYING("carrying", "抱起"),
    CARRYING_OVER_SHOULDER("carrying_over_shoulder", "肩扛"),
    CARRYING_UNDER_ARM("carrying_under_arm", "夹在腋下"),
    CHEERING("cheering", "助威"),
    FINGER_TO_MOUTH("finger_to_mouth", "手抵在嘴唇边"),
    CHEEK_PINCHING("cheek_pinching", "捏脸颊"),
    CHEEK_POKING("cheek_poking", "戳脸颊"),
    CHIN_STROKING("chin_stroking", "摸下巴"),
    HAIR_PULL("hair_pull", "拉头发"),
    COVERING_MOUTH("covering_mouth", "遮盖嘴"),
    COVERING_XX("covering_xx", "遮盖xx"),
    SELF_FONDLE("self_fondle", "自我抚摸"),
    ADJUSTING_THIGHHIGH("adjusting_thighhigh", "调整过膝袜"),
    CHIN_REST("chin_rest", "托脸颊"),
    HEAD_REST("head_rest", "托头"),
    TAKE("take", "拿着"),
    _SHEET_GRAB("_sheet_grab", "抓床单"),
    GROPING("groping", "摸索"),
    SKIRT_LIFT("skirt_lift", "掀裙子"),
    CROTCH_GRAB("crotch_grab", "手抓裆部"),
    COVERING_CHEST_BY_HAND("covering_chest_by_hand", "用手遮住胸部"),
    BANGS_PINNED_BACK("bangs_pinned_back", "掀起的刘海"),
    CLOTHES_LIFT("clothes_lift", "掀起衣物"),
    DRESS_LIFT("dress_lift", "掀起裙子"),
    KIMONO_LIFT("kimono_lift", "掀起和服"),
    LIFTED_BY_ANOTHER("lifted_by_another", "被对方掀起衣物"),
    LIFTED_BY_SELF("lifted_by_self", "掀起自己的衣物"),
    SHIRT_LIFT("shirt_lift", "拉起掀起卷起衬衫"),
    SKIRT_BASKET("skirt_basket", "指掀起裙子时形成的篮子形状"),
    SKIRT_FLIP("skirt_flip", "被掀起裙子(含突发情况意义)"),
    BIKINI_LIFT("bikini_lift", "往上剥开的比基尼"),
    LEG_LIFT("leg_lift", "单腿抬高"),
    LIFTING_PERSON("lifting_person", "将人抱起"),
    STRAP_LIFT("strap_lift", "往上掰衣物的吊带"),
    WIND_LIFT("wind_lift", "起风效果|上升气流"),
    BIKINI_PULL("bikini_pull", "扯着比基尼"),
    CHEEK_PULL("cheek_pull", "扯脸颊"),
    CLOTHES_PULL("clothes_pull", "拉开衣物"),
    DRESS_PULL("dress_pull", "剥下裙子胸口的部分"),
    HAIR_PULLED_BACK("hair_pulled_back", "头发往后扎"),
    KIMONO_PULL("kimono_pull", "剥开和服"),
    LEOTARD_PULL("leotard_pull", "剥开连衣裤"),
    MASK_PULL("mask_pull", "拉着口罩"),
    PANTS_PULL("pants_pull", "拉着裤子"),
    PULLED_BY_ANOTHER("pulled_by_another", "被另一个人拉(或拉衣物)"),
    PULLED_BY_SELF("pulled_by_self", "拉下自己的衣物"),
    PULLING("pulling", "拉"),
    SHIRT_PULL("shirt_pull", "拉开衬衫"),
    SHORTS_PULL("shorts_pull", "褪下短裤"),
    SKIRT_PULL("skirt_pull", "拉开裙子"),
    SWIMSUIT_PULL("swimsuit_pull", "扯下泳衣"),
    ZIPPER_PULL_TAB("zipper_pull_tab", "拉链的拉片"),
    ADJUSTING_CLOTHES("adjusting_clothes", "拨弄衣服"),
    ADJUSTING_EYEWEAR("adjusting_eyewear", "扶眼镜"),
    ADJUSTING_GLOVES("adjusting_gloves", "拨弄手套"),
    ADJUSTING_HAIR("adjusting_hair", "理头发"),
    ADJUSTING_HAT("adjusting_hat", "整理帽子"),
    ADJUSTING_SWIMSUIT("adjusting_swimsuit", "拨弄泳衣"),
    HOLDING("holding", "拿着某物"),
    HOLDING_ANIMAL("holding_animal", "抱着动物"),
    HOLDING_ARROW("holding_arrow", "拉着弓"),
    HOLDING_AXE("holding_axe", "握着斧头"),
    HOLDING_BAG("holding_bag", "提着包"),
    HOLDING_BALL("holding_ball", "抱着球"),
    HOLDING_BASKET("holding_basket", "提着篮子"),
    HOLDING_BOOK("holding_book", "捧着书"),
    HOLDING_BOTTLE("holding_bottle", "拿着瓶子"),
    HOLDING_BOUQUET("holding_bouquet", "手捧花束"),
    HOLDING_BOW_WEAPON("holding_bow_(weapon)", "拿着弓(武器)"),
    HOLDING_BOWL("holding_bowl", "端着碗"),
    HOLDING_BOX("holding_box", "端着箱子"),
    HOLDING_BREATH("holding_breath", "憋气"),
    HOLDING_BROOM("holding_broom", "手持扫帚"),
    HOLDING_CAMERA("holding_camera", "手持摄像机"),
    HOLDING_CAN("holding_can", "拿着易拉罐"),
    HOLDING_CANDY("holding_candy", "手持糖果"),
    HOLDING_CARD("holding_card", "手持卡片"),
    HOLDING_CAT("holding_cat", "抱着猫"),
    HOLDING_CHOPSTICKS("holding_chopsticks", "拿着筷子"),
    HOLDING_CIGARETTE("holding_cigarette", "手叼香烟"),
    HOLDING_CLOTHES("holding_clothes", "拿着衣服"),
    HOLDING_CONDOM("holding_condom", "拿着避孕套"),
    HOLDING_CUP("holding_cup", "手持杯子"),
    HOLDING_DAGGER("holding_dagger", "手持匕首"),
    HOLDING_DOLL("holding_doll", "抱着玩偶"),
    HOLDING_EYEWEAR("holding_eyewear", "拿着眼镜|正在摘眼镜"),
    HOLDING_FAN("holding_fan", "拿着扇子"),
    HOLDING_FLAG("holding_flag", "手持旗帜"),
    HOLDING_FLOWER("holding_flower", "拿着花"),
    HOLDING_FOOD("holding_food", "拿着食物"),
    HOLDING_FORK("holding_fork", "拿着餐叉"),
    HOLDING_FRUIT("holding_fruit", "拿着水果"),
    HOLDING_GIFT("holding_gift", "拿着礼物"),
    HOLDING_GUN("holding_gun", "拿着枪"),
    HOLDING_HANDS("holding_hands", "牵手"),
    HOLDING_HAT("holding_hat", "拿着帽子"),
    HOLDING_HEAD("holding_head", "手里捧着头"),
    HOLDING_HELMET("holding_helmet", "拿着头盔"),
    HOLDING_INNERTUBE("holding_innertube", "拿着泳圈"),
    HOLDING_INSTRUMENT("holding_instrument", "拿着乐器"),
    HOLDING_KNIFE("holding_knife", "拿着刀"),
    HOLDING_LEAF("holding_leaf", "拿着叶子"),
    HOLDING_LOLLIPOP("holding_lollipop", "拿着棒棒糖"),
    HOLDING_MASK("holding_mask", "拿着面具"),
    HOLDING_MICROPHONE("holding_microphone", "拿着麦克风"),
    HOLDING_NEEDLE("holding_needle", "拿着缝衣针"),
    HOLDING_OWN_FOOT("holding_own_foot", "握着自己的脚"),
    HOLDING_PAINTBRUSH("holding_paintbrush", "手握画笔"),
    HOLDING_PAPER("holding_paper", "拿着纸"),
    HOLDING_PEN("holding_pen", "握笔"),
    HOLDING_PENCIL("holding_pencil", "手持铅笔"),
    HOLDING_PHONE("holding_phone", "拿着手机"),
    HOLDING_PILLOW("holding_pillow", "抱着枕头"),
    HOLDING_PIPE("holding_pipe", "拿着烟斗"),
    HOLDING_PIZZA("holding_pizza", "拿着披萨"),
    HOLDING_PLATE("holding_plate", "端着碟子"),
    HOLDING_POKE_BALL("holding_poke_ball", "拿着精灵球"),
    HOLDING_POKEMON("holding_pokemon", "抱着宝可梦"),
    HOLDING_POLEARM("holding_polearm", "手持长柄武器"),
    HOLDING_SACK("holding_sack", "拎着包袱"),
    HOLDING_SCYTHE("holding_scythe", "手持镰刀"),
    HOLDING_SHEATH("holding_sheath", "握着刀鞘"),
    HOLDING_SHIELD("holding_shield", "手持盾牌"),
    HOLDING_SHOES("holding_shoes", "拿着鞋子"),
    HOLDING_SIGN("holding_sign", "手持招牌"),
    HOLDING_SPEAR("holding_spear", "手持长矛"),
    HOLDING_SPOON("holding_spoon", "拿着汤勺"),
    HOLDING_STAFF("holding_staff", "手持法杖"),
    HOLDING_STRAP("holding_strap", "手拉着吊带"),
    HOLDING_STUFFED_ANIMAL("holding_stuffed_animal", "抱着毛绒玩具"),
    HOLDING_STYLUS("holding_stylus", "手持手写笔"),
    HOLDING_SWORD("holding_sword", "手持剑"),
    HOLDING_SYRINGE("holding_syringe", "手持注射器"),
    HOLDING_TOWEL("holding_towel", "拿着毛巾"),
    HOLDING_TRAY("holding_tray", "托着盘子"),
    HOLDING_UMBRELLA("holding_umbrella", "撑伞"),
    HOLDING_WAND("holding_wand", "握着棒子"),
    HOLDING_WHIP("holding_whip", "握着鞭子"),
    ARM_AROUND_NECK("arm_around_neck", "单手搂着脖子"),
    ARMS_AROUND_NECK("arms_around_neck", "双手搂着脖子"),
    COVERING("covering", "遮盖的动作"),
    COVERING_FACE("covering_face", "挡住脸"),
    COVERING_ASS("covering_ass", "遮着臀部"),
    COVERING_CROTCH("covering_crotch", "遮着裆部"),
    COVERING_EYES("covering_eyes", "遮住眼睛"),
    COVERING_NIPPLES("covering_nipples", "挡住乳头"),
    HANDS_ON_ANOTHERS_("hands_on_another's_", "双手放在别人的脸上"),
    HANDS_ON_ANOTHERS_CHEEKS("hands_on_another's_cheeks", "双手放在对方的脸颊上"),
    HANDS_ON_ASS("hands_on_ass", "双手放在屁股上"),
    HANDS_ON_FEET("hands_on_feet", "双手放在脚上"),
    HANDS_ON_HEADWEAR("hands_on_headwear", "双手碰到头上的饰物"),
    HANDS_ON_HILT("hands_on_hilt", "双手搭在刀柄上"),
    HANDS_ON_LAP("hands_on_lap", "双手放在两腿之间"),
    HANDS_ON_OWN_FACE("hands_on_own_face", "双手放在自己的脸上"),
    HANDS_ON_OWN_CHEEKS("hands_on_own_cheeks", "双手放在自己的脸颊上"),
    HANDS_ON_OWN_CHEST("hands_on_own_chest", "双手放在自己的胸口"),
    HANDS_ON_OWN_HEAD("hands_on_own_head", "双手放在自己的头上"),
    HANDS_ON_OWN_KNEES("hands_on_own_knees", "双手放在自己的膝盖上"),
    HANDS_ON_OWN_STOMACH("hands_on_own_stomach", "双手放在自己的肚子上"),
    HANDS_ON_OWN_THIGHS("hands_on_own_thighs", "双手放在自己的大腿上"),
    HANDS_ON_ANOTHERS_SHOULDERS("hands_on_another's_shoulders", "双手放在别人的肩膀上"),
    HAND_ON_ANOTHERS_("hand_on_another's_", "手接触到对方的脸"),
    HAND_ON_ANOTHERS_CHEEK("hand_on_another's_cheek", "手摸着对方的脸颊"),
    HAND_ON_ANOTHERS_CHEST("hand_on_another's_chest", "手放在对方的胸前"),
    HAND_ON_ANOTHERS_CHIN("hand_on_another's_chin", "手托着对方的下巴"),
    HAND_ON_ANOTHERS_HEAD("hand_on_another's_head", "手放在对方的头上"),
    HAND_ON_ANOTHERS_SHOULDER("hand_on_another's_shoulder", "手放在对方的肩上"),
    HAND_ON_ANOTHERS_STOMACH("hand_on_another's_stomach", "手放在对方的肚子上"),
    HAND_ON_ASS("hand_on_ass", "手放在屁股上"),
    HAND_ON_HEAD("hand_on_head", "手放在头上"),
    HAND_ON_HEADWEAR("hand_on_headwear", "手触碰帽子"),
    HAND_ON_HILT("hand_on_hilt", "手搁在刀柄上"),
    HAND_ON_HIP("hand_on_hip", "手叉着腰|手搁在腰上"),
    HAND_ON_OWN_("hand_on_own_", "把手放在自己脸上"),
    HAND_ON_OWN_CHEEK("hand_on_own_cheek", "把手放在自己的脸颊上"),
    HAND_ON_OWN_CHEST("hand_on_own_chest", "把手放在自己的胸口"),
    HAND_ON_OWN_CHIN("hand_on_own_chin", "手碰着自己的下巴"),
    HAND_ON_OWN_STOMACH("hand_on_own_stomach", "把手放在自己的肚子上"),
    HAND_ON_SHOULDER("hand_on_shoulder", "手放在肩上"),
    HAND_IN_ANOTHERS_HAIR("hand_in_another's_hair", "手放在对方的头发上"),
    HAND_IN_HAIR("hand_in_hair", "手埋在头发里"),
    HAND_IN_POCKET("hand_in_pocket", "手插在口袋里"),
    ASS_GRAB("ass_grab", "抓着屁股"),
    FLAT_CHEST_GRAB("flat_chest_grab", "抓着贫乳"),
    GRABBING("grabbing", "抓住|抓着"),
    GRABBING_ANOTHERS_ASS("grabbing_another's_ass", "抓着对方屁股"),
    GRABBING_ANOTHERS_HAIR("grabbing_another's_hair", "抓着对方的头发"),
    GRABBING_FROM_BEHIND("grabbing_from_behind", "从背后揉胸|从背后抓住胸部"),
    GRABBING_OWN_ASS("grabbing_own_ass", "抓着自己的屁股"),
    GUIDED_PENETRATION("guided_penetration", "抓住男性器插入自己"),
    HAIR_GRAB("hair_grab", "抓着头发"),
    LEG_GRAB("leg_grab", "抓着腿"),
    NECKTIE_GRAB("necktie_grab", "抓着领带"),
    NECKWEAR_GRAB("neckwear_grab", "抓着颈部的衣服"),
    PENIS_GRAB("penis_grab", "抓着阴茎"),
    PILLOW_GRAB("pillow_grab", "抓着枕头"),
    SHEET_GRAB("sheet_grab", "抓着床单"),
    TAIL_GRAB("tail_grab", "抓着尾巴"),
    THIGH_GRAB("thigh_grab", "抓着大腿"),
    TORSO_GRAB("torso_grab", "抓着躯干"),
    WRIST_GRAB("wrist_grab", "抓着手腕");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HandMovementsType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
