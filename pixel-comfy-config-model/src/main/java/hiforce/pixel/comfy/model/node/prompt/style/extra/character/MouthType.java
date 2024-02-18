package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum MouthType implements IPromptType {

    CHESTNUT_MOUTH("chestnut mouth", "栗子嘴"),
    THICK_LIPS("thick lips", "厚嘴唇"),
    PUFFY_LIPS("puffy lips", "肿嘴唇"),
    LIPSTICK("lipstick", "口红"),
    HEART_SHAPED_MOUTH("heart-shaped mouth", "心形嘴"),
    POUT("pout", "嘟嘴"),
    OPEN_MOUTH("open mouth", "张嘴"),
    CLOSED_MOUTH("closed mouth", "闭嘴"),
    SHARK_MOUTH("shark mouth", "鲨鱼嘴"),
    PARTED_LIPS("parted lips", "张开的嘴"),
    MOLE_UNDER_MOUTH("mole under mouth", "嘴下痣"),
    GASPING("gasping", "喘气（张大嘴）"),
    SLIGHTLY_OPEN_MOUTH("Slightly_open_mouth", "嘴巴微微张开"),
    WAVY_MOUTH("wavy_mouth", "波浪嘴"),
    CLOSE_MOUTH("close_mouth", "闭嘴"),
    DOT_MOUTH("dot_mouth", "点嘴"),
    NO_MOUTH("no_mouth", "没有嘴"),
    GAG("gag", "堵嘴"),
    GNAW("gnaw", "啃"),
    BIT_GAG("bit_gag", "勒住嘴"),
    CLEAVE_GAG("cleave_gag", "被封住嘴"),
    COVERED_MOUTH("covered_mouth", "蒙住的嘴"),
    EXTRA_MOUTH("extra_mouth", "有多张嘴巴"),
    HAIR_IN_MOUTH("hair_in_mouth", "嘴里有头发"),
    HAIR_TIE_IN_MOUTH("hair_tie_in_mouth", "将系头发的东西叼在嘴里"),
    HOMU("homu", "嘟嘴|抿嘴"),
    LIPS("lips", "嘴唇"),
    MOUTH("mouth", "嘴"),
    MOUTH_HOLD("mouth_hold", "用嘴叼着"),
    ORAL("oral", "用嘴"),
    PACIFIER("pacifier", "奶嘴"),
    POUTED_LIPS("Pouted lips", "撅起的嘴唇"),
    SIDEWAYS_MOUTH("sideways_mouth", "把嘴画在侧脸"),
    SPOON_IN_MOUTH("spoon_in_mouth", "嘴里含着勺子"),
    TRIANGLE_MOUTH("triangle_mouth", "三角嘴"),
    SALIVA("saliva", "唾液"),
    DROOLING("drooling", "流口水"),
    MOUTH_DROOL("mouth_drool", "嘴角画着口水滴形状的缺口");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    MouthType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
