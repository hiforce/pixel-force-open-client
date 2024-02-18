package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum AnimalType implements IPromptType {
    REPTILE("reptile", "爬行动物", "reptile"),
    CROW("crow", "乌鸦", "crow"),
    BIRD("bird", "鸟", "bird"),
    PENGUIN("penguin", "企鹅", "penguin"),
    CHICK("chick", "小鸡", "chick"),
    MANJUU_AZUR_LANE("manjuu_(azur_lane)", "蛮啾", "manjuu_(azur_lane)"),
    SHELL("shell", "贝壳", "shell"),
    WRIGGLE_NIGHTBUG("wriggle_nightbug", "蠕动夜虫", "wriggle_nightbug"),
    DRAGONFLY("dragonfly", "蜻蜓", "dragonfly"),
    MAMMAL("mammal", "哺乳动物", "mammal"),
    WOLF("wolf", "狼", "wolf"),
    WHALE("whale", "鲸", "whale"),
    CAT("cat", "猫", "cat"),
    CAT_TEASER("cat_teaser", "逗猫", "cat_teaser"),
    DOG("dog", "狗", "dog"),
    DOG_TAGS("dog_tags", "狗牌", "dog_tags"),
    FOX("fox", "狐狸", "fox"),
    BUNNY("bunny", "兔子", "bunny"),
    SNOW_BUNNY("snow_bunny", "雪兔", "snow_bunny"),
    STUFFED_BUNNY("stuffed_bunny", "兔子玩偶", "stuffed_bunny"),
    HORSE("horse", "马", "horse"),
    COW("cow", "牛", "cow"),
    DRAGON("dragon", "龙", "dragon"),
    LOONG("loong", "中国龙", "loong"),
    EASTERN_DRAGON("eastern_dragon", "东方龙", "eastern_dragon"),
    SNAKE("snake", "蛇", "snake"),
    SLIME("slime", "史莱姆", "slime"),
    BEAR("bear", "熊", "bear"),
    PANDA("panda", "熊猫", "panda"),
    TEDDY_BEAR("teddy_bear", "泰迪熊", "teddy_bear"),
    TIGER("tiger", "老虎", "tiger"),
    BAT("bat", "蝙蝠", "bat"),
    HAMSTER("hamster", "仓鼠", "hamster"),
    MOUSE("mouse", "老鼠", "mouse");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    AnimalType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
