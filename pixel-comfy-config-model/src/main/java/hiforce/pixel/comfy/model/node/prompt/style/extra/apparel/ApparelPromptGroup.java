package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

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
public enum ApparelPromptGroup implements IPromptGroup {
    FORMAL_WEAR("Formal Wear", "正装", FormalWearType.class),
    SPECIAL_CLOTH("Special", "特色服装", SpecialClothType.class),
    CASUAL_WEAR("Casual Wear", "休闲装", CasualWearType.class),
    SPORTSWEAR("Sportswear", "运动服", SportswearType.class),
    Jewelry("Jewelry", "首饰", JewelryType.class),
    SWIMSUIT("Swimsuit", "泳装", SwimsuitType.class),
    UNIFORM("Uniform", "制服", UniformType.class),
    JACKET("Jacket", "上衣", JacketType.class),
    COAT("Coat", "外套", CoatType.class),
    APPAREL_WAIST("Waist", "腰部", ApparelWaistType.class),
    ARMOR("Armor", "盔甲", ArmorType.class),
    SHOE("Shoe", "鞋子", ShoeType.class),
    BOOTS("Boots", "靴子", BootsType.class),
    SOLE("Sole", "鞋底", SoleType.class),
    SKIRT("Skirt", "裙子", SkirtType.class),
    SKIRT_ACTION("SkirtAction", "裙子相关动作", SkirtActionType.class),
    PANTS("Pants", "裤子", PantsType.class),
    PANTS_ACTION("Pants Action", "裤子相关动作", PantsActionType.class),
    SOCK("Sock", "袜子", SockType.class),
    SOCK_ACTION("Sock Action", "袜子相关动作", SockActionType.class),
    NECKLINE("Neckline", "领口", NecklineType.class),
    SCARF("Scarf", "围巾", ScarfType.class),
    GLASSES("Glasses", "眼镜", GlassesType.class),
    MASK("Mask", "面具", MaskType.class),
    ARM("Arm", "手臂", ArmType.class),
    GLOVES("Gloves", "手套", GlovesType.class),
    EARRING("Earring", "耳饰", EarringType.class),
    HEADGEAR("Headgear", "头饰", HeadgearType.class),
    Hat("Hat", "帽子", HatType.class),
    HAIR_ACCESSORIES("Hair Accessories", "发饰", HairAccessoriesType.class),
    SMALL_DECORATION("Small Decoration", "小装饰", SmallDecorationType.class),
    APPAREL_MATERIAL("Material", "材质", ApparelMaterialTpye.class),
    APPAREL_DECORATE("Decorate", "装饰", ApparelDecorateType.class),
    APPAREL_PATTERN("Pattern", "花纹", ApparelPatternType.class),
    APPAREL_OTHER("Other", "其他", ApparelOtherType.class);

    @Getter
    private final String text;

    @Getter
    private final String textCn;

    @Getter
    private final List<IPromptGroup> subGroups = Lists.newArrayList();


    @Getter
    private final Class<? extends IPromptType> typeClass;


    ApparelPromptGroup(String text, String textCn, Class<? extends IPromptType> typeClass, IPromptGroup... groups) {
        this.text = text;
        this.textCn = textCn;
        this.typeClass = typeClass;
        subGroups.addAll(Arrays.asList(groups));
    }
}
