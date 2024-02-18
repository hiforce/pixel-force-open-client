package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ApparelPatternType implements IPromptType {
    ARGYLE("argyle", "阿盖尔菱形花纹"),
    CHECKERED("checkered", "格子花纹"),
    COLORED_STRIPES("colored_stripes", "多彩条纹"),
    DIAGONAL_STRIPES("diagonal_stripes", "斜条纹"),
    HORIZONTAL_STRIPES("horizontal_stripes", "水平条纹"),
    MULTICOLORED_STRIPES("multicolored_stripes", "多彩条纹"),
    POLKA_DOT_("polka_dot_", "点装纹"),
    RIBBED("ribbed", "棱纹"),
    STRIPED("striped", "横条纹"),
    UNMOVING_PATTERN("unmoving_pattern", "连续重复花纹"),
    VERTICAL_STRIPES("vertical_stripes", "竖条纹"),
    PLAID("plaid", "格子呢图案"),
    ANIMAL_PRINT("animal_print", "动物印花"),
    CAT_PRINT("cat_print", "猫咪印花"),
    BEAR_PRINT("bear_print", "熊印花"),
    BIRD_PRINT("bird_print", "鸟印花"),
    BUNNY_PRINT("bunny_print", "兔子印花"),
    COW_PRINT("cow_print", "奶牛印花"),
    DRAGON_PRINT("dragon_print", "龙印花"),
    FISH_PRINT("fish_print", "鱼印花"),
    FROG_PRINT("frog_print", "青蛙印花"),
    SHARK_PRINT("shark_print", "鲨鱼印花"),
    SNAKE_PRINT("snake_print", "蛇纹"),
    ZEBRA_PRINT("zebra_print", "斑马印花"),
    TIGER_PRINT("tiger_print", "虎纹"),
    LEOPARD_PRINT("leopard_print", "豹纹"),
    JAGUAR_PRINT("jaguar_print", "美洲豹印花"),
    BAT_PRINT("bat_print", "蝙蝠印花"),
    AARDWOLF_PRINT("aardwolf_print", "土狼印花"),
    AFRICAN_WILD_DOG_PRINT("african_wild_dog_print", "非洲野狗印花"),
    CHEETAH_PRINT("cheetah_print", "猎豹印花"),
    DOG_PRINT("dog_print", "狗印花"),
    FOX_PRINT("fox_print", "狐狸印花"),
    GIRAFFE_PRINT("giraffe_print", "长颈鹿印花"),
    PANDA_PRINT("panda_print", "熊猫印花"),
    SAND_CAT_PRINT("sand_cat_print", "沙猫印花"),
    WHALE_PRINT("whale_print", "鲸鱼印花"),
    WHITE_TIGER_PRINT("white_tiger_print", "白虎纹"),
    GOLDFISH_PRINT("goldfish_print", "金鱼印花"),
    WING_PRINT("wing_print", "翼印"),
    SPIDER_WEB_PRINT("spider_web_print", "蛛网纹"),
    BUTTERFLY_PRINT("butterfly_print", "蝴蝶印花"),
    FLORAL_PRINT("floral_print", "碎花"),
    LEAF_PRINT("leaf_print", "叶印花"),
    CLOVER_PRINT("clover_print", "三叶草印花"),
    MAPLE_LEAF_PRINT("maple_leaf_print", "枫叶印花"),
    ROSE_PRINT("rose_print", "玫瑰印花"),
    STRAWBERRY_PRINT("strawberry_print", "草莓印花"),
    CHERRY_PRINT("cherry_print", "樱桃印花"),
    BAMBOO_PRINT("bamboo_print", "竹印花"),
    CARROT_PRINT("carrot_print", "胡萝卜印花"),
    HIBISCUS_PRINT("hibiscus_print", "芙蓉印花"),
    JACK_O_LANTERN_PRINT("jack-o'-lantern_print", "南瓜灯印花"),
    PETAL_PRINT("petal_print", "花瓣印花"),
    SUNFLOWER_PRINT("sunflower_print", "向日葵印花"),
    WATERMELON_PRINT("watermelon_print", "西瓜印花"),
    SKY_PRINT("sky_print", "天空印花"),
    CLOUD_PRINT("cloud_print", "云印花"),
    LIGHTNING_BOLT_PRINT("lightning_bolt_print", "闪电印花"),
    RAINBOW_PRINT("rainbow_print", "彩虹印花"),
    SNOWFLAKE_PRINT("snowflake_print", "雪花印花"),
    STARRY_SKY_PRINT("starry_sky_print", "星空印花"),
    CRESCENT_PRINT("crescent_print", "新月印花"),
    STAR_PRINT("star_print", "星形印花"),
    STAR_SYMBOL("star_(symbol)", "星形符号"),
    MOON_PRINT("moon_print", "月亮印花"),
    SUN_PRINT("sun_print", "太阳印花"),
    CHARACTER_PRINT("character_print", "字符印花"),
    CLOTHES_WRITING_("clothes_writing_", "衣服上的字"),
    ANCHOR_PRINT("anchor_print", "锚印花"),
    CHERRY_BLOSSOM_PRINT("cherry_blossom_print", "樱花印花"),
    MUSICAL_NOTE_PRINT("musical_note_print", "音符印花"),
    TRIANGLE_PRINT("triangle_print", "三角印花"),
    ARROW_PRINT("arrow_print", "箭头打印"),
    WAVE_PRINT("wave_print", "波浪纹"),
    PEACE_SYMBOL("peace_symbol", "☮(东方仗助衣服上有)"),
    HEART_PRINT("heart_print", "心形图案|心形印花"),
    FLAME_PRINT("flame_print", "火焰印花"),
    HITODAMA_PRINT("hitodama_print", "鬼火印花"),
    PAW_PRINT("paw_print", "爪印花"),
    SKELETON_PRINT("skeleton_print", "骨架印花"),
    SKULL_PRINT("skull_print", "骷髅头印花"),
    SPARKLE_PRINT("sparkle_print", "闪闪发光的印花"),
    YIN_YANG_PRINT("yin_yang_print", "阴阳印花"),
    CROSS_PRINT("cross_print", "十字架元素图案"),
    CAMOFLAGE("camoflage", "迷彩"),
    FLAG_PRINT("flag_print", "旗帜印花"),
    BONE_PRINT("bone_print", "骨印花"),
    GHOST_PRINT("ghost_print", "幽灵印画"),
    MUSHROOM_PRINT("mushroom_print", "蘑菇印花"),
    ONIGIRI_PRINT("onigiri_print", "饭团打印"),
    CAT_EAR("cat_ear", "猫耳造型"),
    CAT_EAR_CUTOUT("cat_ear_cutout", "猫耳造型镂空");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ApparelPatternType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
