package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import com.google.common.collect.Lists;
import hiforce.pixel.comfy.model.node.prompt.IPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ExpressionPromptGroup implements IPromptGroup {
    SMILE("Smile", "笑", SmileType.class),
    CRY("Cry", "哭", CryType.class),
    UNHAPPY("Unhappy", "不开心", UnhappyType.class),
    CONTEMPT("Contempt", "蔑视", ContemptType.class),
    ANGRY("Angry", "生气", AngryType.class),
    EXPRESSION_OTHER("Other Expression", "其他表情", ExpressionOtherType.class),
    MOVEMENTS("Movements", "基础动作", MovementsType.class),
    HAND_MOVEMENTS("Hand Movements", "手部动作", HandMovementsType.class),
    LEG_MOVEMENTS("Leg Movements", "脚部动作", LegMovementsType.class),
    OTHER_MOVEMENT("Other Movements", "其他动作", OtherMovementType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;

    ExpressionPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
