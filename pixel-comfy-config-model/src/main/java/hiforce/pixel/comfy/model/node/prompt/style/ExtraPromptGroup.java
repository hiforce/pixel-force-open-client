package hiforce.pixel.comfy.model.node.prompt.style;

import com.google.common.collect.Lists;
import hiforce.pixel.comfy.model.node.prompt.IPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.apparel.ApparelPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.character.CharactersPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.environment.EnvironmentPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.expression.ExpressionPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.picture.PicturePromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.scenes.ScenesPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.shot.ShotPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.style.extra.thing.ThingPromptGroup;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum ExtraPromptGroup implements IPromptGroup {

    CHARACTERS("Characters", "人物", CharactersPromptGroup.values()),
    APPAREL("Apparel", "服饰", ApparelPromptGroup.values()),
    EXPRESSION("Expression", "表情/动作", ExpressionPromptGroup.values()),
    PICTURE("Picture", "画面", PicturePromptGroup.values()),
    ENVIRONMENT("Environment", "环境", EnvironmentPromptGroup.values()),
    SCENES("Scenes", "场景", ScenesPromptGroup.values()),
    THING("Thing", "物品", ThingPromptGroup.values()),
    SHOT("Shot", "镜头", ShotPromptGroup.values());

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();

    ExtraPromptGroup(String text, String textCn, IPromptGroup[] groups) {
        this.text = text;
        this.textCn = textCn;
        subGroups.addAll(Arrays.asList(groups));
    }
}
