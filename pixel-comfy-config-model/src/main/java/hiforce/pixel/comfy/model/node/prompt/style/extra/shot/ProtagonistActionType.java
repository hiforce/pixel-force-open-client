package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ProtagonistActionType implements IPromptType {
    LOOKING_AT_VIEWER("looking_at_viewer", "看向观众", "looking_at_viewer"),
    EYE_CONTACT("eye-contact", "眼神接触", "eye-contact"),
    EYEBALL("eyeball", "盯着看", "eyeball"),
    STARE("stare", "凝视", "stare"),
    LOOKING_BACK("looking_back", "回眸", "looking_back"),
    GRADIENT("gradient", "人物倾斜", "gradient"),
    LOOKING_DOWN("looking_down", "人物视角向下看↘", "looking_down"),
    LOOKING_UP("looking_up", "人物视角抬头看↗", "looking_up"),
    FACING_AWAY("facing_away", "面向别处", "facing_away"),
    LOOKING_TO_THE_SIDE("looking_to_the_side", "看向侧面", "looking_to_the_side"),
    LOOKING_AWAY("looking_away", "看着别处", "looking_away"),
    LOOKING_AHEAD("looking_ahead", "展望未来", "looking_ahead"),
    LOOKING_AFAR("looking_afar", "遥望", "looking_afar"),
    LOOKING_OUTSIDE("looking_outside", "向外看", "looking_outside"),
    HEAD_TILT("head_tilt", "歪头", "head_tilt"),
    HEAD_DOWN("head_down", "低头", "head_down"),
    SIDEWAYS_GLANCE("sideways_glance", "轻轻向侧面瞥", "sideways_glance"),
    UPSHIRT("upshirt", "从衬衫下方瞥", "upshirt"),
    LOOKING_AT_ANOTHER("looking_at_another", "看着另一个", "looking_at_another"),
    LOOKING_AT_PHONE("looking_at_phone", "看手机", "looking_at_phone"),
    LOOKING_AT_ANIMAL("looking_at_animal", "看着动物", "looking_at_animal"),
    LOOKING_AT_MIRROR("looking_at_mirror", "照镜子", "looking_at_mirror"),
    LOOKING_AT_HAND("looking_at_hand", "看着手", "looking_at_hand"),
    LOOKING_AT_HANDS("looking_at_hands", "看着双手", "looking_at_hands"),
    LOOKING_AT_FOOD("looking_at_food", "看食物", "looking_at_food"),
    LOOKING_AT_SCREEN("looking_at_screen", "看着屏幕", "looking_at_screen");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ProtagonistActionType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
