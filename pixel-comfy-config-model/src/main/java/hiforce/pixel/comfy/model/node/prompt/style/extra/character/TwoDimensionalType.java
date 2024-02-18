package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum TwoDimensionalType implements IPromptType {

    POKEMON("pokemon", "宝可梦"),
    TEDDY_BEAR("teddy bear", "泰迪熊"),
    MARIO("mario", "马里奥"),
    PIKACHU("pikachu", "皮卡丘"),
    NEON_GENESIS_EVANGELION("neon genesis evangelion", "新世纪福音战士"),
    HATSUNE_MIKU("hatsune miku", "初音未来"),
    HARRY_POTTER("harry potter", "哈利波特"),
    DORAEMON("doraemon", "哆啦A梦"),
    SAINT_SEIYA("saint seiya", "圣斗士星矢"),
    GOJOU_SATORU("gojou satoru", "五条悟"),
    AVENGERS("avengers", "复仇者联盟"),
    MAZINGER("mazinger", "神奇女侠"),
    CAPTAIN_AMERICA("captain america", "美国队长"),
    CRAYON_SHIN_CHAN("crayon shin-chan", "蜡笔小新"),
    SLAM_DUNK("slam dunk", "灌篮高手"),
    SUN_WUKONG("sun wukong", "孙悟空"),
    WITCH("witch", "女巫"),
    MIKO("miko", "巫女"),
    NINJA("ninja", "忍者"),
    VAMPIRE("vampire", "吸血鬼"),
    KNIGHT("knight", "骑士"),
    MAGICAL_GIRL("magical_girl", "魔法少女"),
    ORC("orc", "半兽人"),
    DRUID("druid", "德鲁伊"),
    ELF("elf", "妖精"),
    FAIRY("fairy", "小精灵"),
    FURRY("furry", "兽人"),
    MERMAID("mermaid", "美人鱼"),
    KAMEN_RIDER("kamen rider", "假面骑士"),
    MAGISTER("magister", "魔导师"),
    SPIDER_MAN("spider-man", "蜘蛛侠"),
    SANTA_ALTER("santa alter", "圣诞老人"),
    MONSTER_GIRL("monster_girl", "人外娘"),
    CAT_GIRL("cat_girl", "猫娘"),
    DOG_GIRL("dog_girl", "犬娘"),
    FOX_GIRL("fox_girl", "狐娘"),
    KITSUNE("kitsune", "狐妖"),
    KYUUBI("kyuubi", "九尾|九尾狐"),
    RACCOON_GIRL("raccoon_girl", "浣熊娘"),
    WOLF_GIRL("wolf_girl", "狼女孩"),
    BUNNY_GIRL("bunny_girl", "兔娘"),
    HORSE_GIRL("horse_girl", "马娘"),
    COW_GIRL("cow_girl", "牛娘"),
    DRAGON_GIRL("dragon_girl", "龙娘"),
    CENTAUR("centaur", "半人马"),
    SLIME_MUSUME("slime_musume", "史莱姆娘"),
    SPIDER_GIRL("spider_girl", "蜘蛛娘"),
    DOMINATRIX("dominatrix", "女王(SM中)"),
    SAILOR_SENSHI("sailor_senshi", "美少女战士"),
    MECHA("mecha", "机甲"),
    MECHA_MUSUME("mecha_musume", "机甲娘"),
    HUMANOID_ROBOT_("humanoid_robot_", "类人机器人"),
    CYBORG("cyborg", "半机械人"),
    ANGEL("angel", "天使"),
    DEVIL("devil", "魔鬼"),
    DARK_ELF("dark_elf", "暗精灵"),
    IMP("imp", "小恶魔"),
    SUCCUBUS("succubus", "魅魔"),
    GIANTESS("giantess", "女巨人"),
    MINIGIRL("minigirl", "迷你女孩"),
    MONSTER("monster", "怪物"),
    MULTIPLE_GIRLS("multiple girls", "魔幻少女"),
    NO_HUMANS("no humans", "非人");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    TwoDimensionalType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
