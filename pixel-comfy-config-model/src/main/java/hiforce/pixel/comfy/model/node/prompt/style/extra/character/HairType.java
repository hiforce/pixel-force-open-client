package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum HairType implements IPromptType {

    WHITE_HAIR("white hair", "白色头发"),
    BLONDE_HAIR("blonde hair", "金色头发"),
    SILVER_HAIR("silver hair", "银色头发"),
    GREY_HAIR("grey hair", "灰色头发"),
    PURPLE_HAIR("purple hair", "紫色头发"),
    RED_HAIR("red hair", "红色头发"),
    YELLOW_HAIR("yellow hair", "黄色头发"),
    GREEN_HAIR("green hair", "绿色头发"),
    BLUE_HAIR("blue hair", "蓝色头发"),
    BLACK_HAIR("black hair", "黑色头发"),
    BROWN_HAIR("brown hair", "棕色头发"),
    STRAIGHT_HAIR("straight_hair", "直发"),
    SHORT_HAIR("short hair", "短发"),
    CURLY_HAIR("curly hair", "卷发"),
    LONG_HAIR("long hair", "长发"),
    PONY_TAIL("pony-tail", "马尾"),
    BUNCHES("bunches", "双马尾"),
    STREAKED_HAIR("streaked hair", "挑染"),
    GREY_GRADIENT_HAIR("grey gradient hair", "灰色渐变"),
    LIGHT_BROWN_HAIR("light brown hair", "亮棕"),
    TWO_TONE_HAIR("two-tone hair", "双色"),
    MULTICOLORED_HAIR("multicolored hair", "五颜六色"),
    HIGH_PONYTAIL("high ponytail", "高马尾"),
    TWINTAILS("twintails", "双马尾二"),
    BRAIDED_PONYTAIL("braided ponytail", "马尾编发"),
    PONYTAIL("ponytail", "马尾辫"),
    SHORT_PONYTAIL("short ponytail", "短马尾"),
    TWIN_BRAIDS("twin braids", "双辫子"),
    MEDIUM_HAIR("medium hair", "中发"),
    VERY_LONG_HAIR("very long hair", "超长发"),
    BRAIDED_BANGS("braided bangs", "辫子刘海"),
    SWEPT_BANGS("swept bangs", "侧扫刘海"),
    HAIR_BETWEEN_EYES("hair between eyes", "眼间头发"),
    BOB_CUT("bob cut", "妹妹切"),
    HIME_CUT("hime cut", "公主切"),
    CROSSED_BANGS("crossed bangs", "交叉刘海"),
    BANGS("bangs", "刘海"),
    BLUNT_BANGS("blunt bangs", "齐刘海"),
    AIR_BANGS("air bangs", "空气刘海"),
    HAIR_WINGS("hair wings", "翼状头发"),
    LONG_BANGS("long bangs", "长刘海"),
    SIDE_BLUNT_BANGS("side_blunt_bangs", "侧面空气刘海"),
    CENTRE_PARTING_BANGS("centre parting bangs", "中分刘海"),
    ASYMMETRIC_BANGS("asymmetric bangs", "不对称刘海"),
    DISHEVELED_HAIR("disheveled hair", "蓬发"),
    WAVY_HAIR("wavy hair", "波浪形头发"),
    HAIR_IN_TAKES("hair in takes", "收拢"),
    HAIR_PINK_FLOWERS("hair pink flowers", "粉色花"),
    AHOGE("ahoge", "呆毛"),
    ANTENNA_HAIR("antenna hair", "多根呆毛"),
    SIDE_PONYTAIL("Side ponytail", "侧马尾"),
    FOREHEAD("forehead", "露额头"),
    DRILL_HAIR("drill hair", "钻头卷公主卷"),
    HAIR_BUN("hair bun", "包子头"),
    DOUBLE_BUN("double bun", "俩包子头"),
    MESSY_HAIR("messy hair", "凌乱发型"),
    HAIR_FLAPS("hair_flaps", "发翼");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HairType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
