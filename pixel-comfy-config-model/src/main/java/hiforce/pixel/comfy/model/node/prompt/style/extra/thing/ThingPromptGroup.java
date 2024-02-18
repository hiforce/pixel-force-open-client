package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

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
public enum ThingPromptGroup implements IPromptGroup {
    STUDY_ITEM("Study Item", "学习用品", StudyItemType.class),
    DIGITAL_EQUIPMENT("Digital Equipment", "数码设备", DigitalEquipmentType.class),
    TABLEWARE("Tableware", "餐具", TablewareType.class),
    MUSICAL_INSTRUMENT("Musical Instrument", "乐器", MusicalInstrumentType.class),
    WEAPON("Weapon", "武器", WeaponType.class),
    FOOD("Food", "食物", FoodType.class),
    ANIMAL("Animal", "动物", AnimalType.class),
    PLANT("Plant", "植物", PlantType.class),
    OTHER("Other", "其他", OtherThingType.class);

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

    ThingPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
