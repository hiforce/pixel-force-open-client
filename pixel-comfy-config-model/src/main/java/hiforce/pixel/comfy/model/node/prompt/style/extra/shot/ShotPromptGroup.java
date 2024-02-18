package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

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
public enum ShotPromptGroup implements IPromptGroup {
    GENERAL_SHOT("General", "通用", GeneralShotType.class),
    CLOSE_UP_SHOT("Close-up", "特写镜头", CloseUpShotType.class),
    COMPOSITION("Composition", "构图", CompositionType.class),
//    CAMERA_ANGLE("Camera Angle", "镜头角度", CameraAngleType.class),
    EFFECT("Effect", "效果", EffectType.class),
    PROTAGONIST_ACTION("Protagonist Action", "主角动作", ProtagonistActionType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;


    @Override
    public IPromptType[] getPromptTypes() {
        return (IPromptType[]) typeClass.getEnumConstants();
    }

    ShotPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
