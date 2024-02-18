package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum EarType implements IPromptType {
    ELF_EARS("elf ears", "精灵耳朵"),
    FAKE_ANIMAL_EARS("fake animal ears, fake_animal_ears", "动物耳朵"),
    CAT_EARS("cat ears, cat_ears", "猫耳朵"),
    DOG_EARS("dog ears, dog_ears", "狗耳朵"),
    FOX_EARS("fox ears, fox_ears", "狐狸耳朵"),
    BUNNY_EARS("bunny ears, bunny_ears", "兔子耳朵"),
    BEAR_EARS("bear ears, bear_ears", "熊耳朵"),
    WOLF_EARS("wolf ears", "狼耳朵"),
    HORSE_EARS("horse ears", "马耳朵"),
    COW_EARS("cow ears", "牛耳朵"),
    MOUSE_EARS("mouse ears, mouse_ears", "老鼠耳朵"),
    PIG_EARS("pig ears", "猪耳朵"),
    SHEEP_EARS("sheep ears", "羊耳朵"),
    DEER_EARS("deer ears", "鹿耳朵"),
    GOAT_EARS("goat ears", "山羊耳朵"),
    ANTELOPE_EARS("antelope ears", "羚羊耳朵"),
    RHINO_EARS("rhino ears", "犀牛耳朵"),
    ELEPHANT_EARS("elephant ears", "大象耳朵"),
    BAT_EARS("bat ears", "蝙蝠耳朵"),
    DRAGON_EARS("dragon ears", "龙耳朵"),
    DEMON_EARS("demon ears", "恶魔耳朵"),
    ANGEL_EARS("angel ears", "天使耳朵"),
    ALIEN_EARS("alien ears", "外星人耳朵"),
    EAR_BLUSH("ear_blush", "耳朵通红"),
    EAR_ORNAMENT("ear_ornament", "耳饰"),
    EAR_PIERCING("ear_piercing", "耳洞"),
    ANIMAL_EARS("animal_ears", "兽耳"),
    EARS_DOWN("ears_down", "垂耳"),
    FLOPPY_EARS("floppy_ears", "松软的耳朵"),
    ANIMAL_EAR_FLUFF("animal_ear_fluff", "动物耳朵绒毛"),
    LION_EARS("lion_ears", "狮子耳朵"),
    JAGUAR_EARS("jaguar_ears", "美洲豹耳朵"),
    TIGER_EARS("tiger_ears", "虎耳"),
    COYOTE_EARS("coyote_ears", "郊狼耳朵"),
    POINTY_EARS("pointy_ears", "尖耳朵"),
    LONG_POINTY_EARS("long_pointy_ears", "长尖耳朵"),
    RACCOON_EARS("raccoon_ears", "浣熊耳朵"),
    SQUIRREL_EARS("squirrel_ears", "松鼠耳朵"),
    PANDA_EARS("panda_ears", "熊猫耳朵"),
    ROBOT_EARS("robot_ears", "机器人耳朵"),
    EXTRA_EARS("extra_ears", "额外的耳朵"),
    EARS_THROUGH_HEADWEAR("ears_through_headwear", "耳朵穿过帽子或头饰"),
    ALPACA_EARS("alpaca_ears", "羊驼耳"),
    HORNS("horns", "兽角"),
    FAKE_HORNS("fake_horns", "假角"),
    DRAGON_HORNS("dragon_horns", "龙角"),
    ONI_HORNS("oni_horns", "鬼角"),
    ANTLERS("antlers", "鹿角"),
    CURLED_HORNS("curled_horns", "弯角"),
    GOAT_HORNS("goat_horns", "山羊角"),
    HAIR_ON_HORN("hair_on_horn", "角上的头发");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    EarType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
