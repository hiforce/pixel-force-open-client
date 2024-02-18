package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ApparelOtherType implements IPromptType {

    TRANSPARENT("transparent", "透明的"),
    BURNT_CLOTHES("burnt_clothes", "烧焦的衣服"),
    DISSOLVING_CLOTHES("dissolving_clothes", "溶解掉的衣服"),
    DIRTY_CLOTHES("dirty_clothes", "弄脏的衣服"),
    EXPRESSIVE_CLOTHES("expressive_clothes", "富有表现力的衣服"),
    IMPOSSIBLE_CLOTHES("impossible_clothes", "有不现实的包裹程度的衣服"),
    LIVING_CLOTHES("living_clothes", "活体衣服"),
    LEOTARD_UNDER_CLOTHES("leotard_under_clothes", "内层穿着连衣裤"),
    MULTICOLORED_CLOTHES("multicolored_clothes", "多色款衣服"),
    OFUDA_ON_CLOTHES("ofuda_on_clothes", "衣服上贴着符纸"),
    WRINGING_CLOTHES("wringing_clothes", "拧干衣服"),
    CLOTHESLINE("clothesline", "晒衣服"),
    SHINY_CLOTHES("shiny_clothes", "有光泽的衣服"),
    KARIGINU("kariginu", "狩衣"),
    FRONT_TIE_TOP("front-tie_top", "从正面打结的衣物"),
    JACKET_ON_SHOULDERS("jacket_on_shoulders", "用夹克披肩"),
    SHORT_JUMPSUIT("short_jumpsuit", "短裤腿连体衣"),
    HARNESS("harness", "背带；挽具"),
    RIGGING("rigging", "舰装"),
    AIGUILLETTE("aiguillette", "肩带"),
    GARTERS("garters", "袜带"),
    LEG_GARTER("leg_garter", "腿环|袜带"),
    GARTER_STRAPS("garter_straps", "吊带袜的吊带"),
    THIGH_STRAP("thigh_strap", "大腿绑带"),
    THIGH_RIBBON("thigh_ribbon", "大腿缎带"),
    LEG_RIBBON("leg_ribbon", "腿锻带"),
    BANDAID_ON_LEG("bandaid_on_leg", "腿上的绷带"),
    BANDAGED_LEG("bandaged_leg", "包扎过的腿"),
    ANKLE_LACE_UP("ankle_lace-up", "脚踝系带"),
    THIGH_HOLSTER("thigh_holster", "大腿皮套"),
    BANDAID_ON_KNEE("bandaid_on_knee", "膝盖上的创可贴"),
    ARGYLE_LEGWEAR("argyle_legwear", "含菱形花纹的裤袜"),
    BOW_LEGWEAR("bow_legwear", "带蝴蝶结的裤袜"),
    ARM_GARTER("arm_garter", "手臂袜带");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ApparelOtherType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
