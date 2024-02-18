package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import com.google.common.collect.Lists;
import hiforce.pixel.comfy.model.node.prompt.IPromptGroup;
import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum CharactersPromptGroup implements IPromptGroup {
    TARGET("Target", "对象", TargetStyle.class) ,
    IDENTITY("Identity", "身份", IdentityStyle.class),
    AGE("Age", "年龄", AgeStyle.class),
    SKIN("Skin", "皮肤", SkinStyle.class),
    FIGURE("Figure", "身材", FigureStyle.class),
    FACE("Face", "脸型", FaceType.class),
    HAIR("Hair", "头发", HairType.class),
    FACE_DETAIL("Face Detail", "面部细节", FaceDetailType.class),
    EAR("Ear", "耳朵", EarType.class),
    EYE_BROW("Eye Brow", "眉毛", EyebrowType.class),
    EYE("Eye", "眼睛", EyeType.class),
    PUPIL("Pupil", "瞳孔", PupilType.class),
    NOSE("Nose", "鼻子", NoseType.class),
    MOUTH("Mouth", "嘴巴", MouthType.class),
    TEETH("Teeth", "牙齿", TeethType.class),
    TONGUE("Tongue", "舌头", TongueType.class),
    NAIL("Nail", "指甲", NailType.class),
    SHOULDERS("Shoulders", "肩部", ShouldersType.class),
    CHEST("Chest", "胸部", ChestType.class),
    WAIST("Waist", "腰部", WaistType.class),
    BELLY("Belly", "腹部", BellyTpe.class),
    WING("Wing", "翅膀", WingType.class),
    TWO_DIMENSIONAL("Two Dimensional", "二次元角色", TwoDimensionalType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;


    CharactersPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
