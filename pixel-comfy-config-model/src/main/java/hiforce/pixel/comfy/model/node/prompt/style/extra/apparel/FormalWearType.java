package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum FormalWearType implements IPromptType {
    SUIT("suit", "西装"),
    TUXEDO("tuxedo", "燕尾服"),
    FORMAL_DRESS("formal_dress", "礼服"),
    EVENING_GOWN("evening_gown", "礼服"),
    CANONICALS("canonicals", "晚会礼服"),
    COCKTAIL_DRESS("cocktail_dress", "鸡尾酒连衣裙"),
    GOWN("gown", "女长服"),
    JAPANESE_CLOTHES("japanese_clothes", "和服"),
    KIMONO("kimono", "和服"),
    SLEEVELESS_KIMONO("sleeveless_kimono", "无袖和服"),
    SHORT_KIMONO("short_kimono", "短和服"),
    PRINT_KIMONO("print_kimono", "印花和服"),
    FURISODE("furisode", "振袖(和服的一部份)"),
    OBI("obi", "衣带(和服用)"),
    SASH("sash", "饰带"),
    CHEONGSAM("cheongsam", "旗袍"),
    CHINA_DRESS("china_dress", "旗袍"),
    PRINT_CHEONGSAM("print_cheongsam", "印花旗袍"),
    PELVIC_CURTAIN("pelvic_curtain", "旗袍类衣物的前摆"),
    WEDDING_DRESS("wedding_dress", "婚纱"),
    UCHIKAKE("uchikake", "白无垢(日式嫁衣)"),
    SCHOOL_UNIFORM("school_uniform", "校服"),
    SAILOR("sailor", "水手服"),
    SERAFUKU("serafuku", "水手服"),
    SUMMER_UNIFORM("summer_uniform", "夏季制服"),
    KINDERGARTEN_UNIFORM("kindergarten_uniform", "幼儿园制服"),
    POLICE_UNIFORM("police_uniform", "警服"),
    NAVAL_UNIFORM("naval_uniform", "海军制服"),
    MILITARY_UNIFORM("military_uniform", "陆军制服"),
    MAID("maid", "女仆装"),
    STILE_UNIFORM("stile_uniform", "女侍从的制服"),
    MIKO("miko", "巫女服"),
    OVERALLS("overalls", "工作服"),
    BUSINESS_SUIT("business_suit", "职场制服"),
    NURSE("nurse", "护士"),
    CHEF_UNIFORM("chef_uniform", "厨师工装"),
    LABCOAT("labcoat", "白大褂"),
    CHEERLEADER("cheerleader", "啦啦队服"),
    BAND_UNIFORM("band_uniform", "乐队制服"),
    SPACE_SUIT("space_suit", "宇航服"),
    LEOTARD("leotard", "连衣裤"),
    DOMINEERING("domineering", "修女服");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    FormalWearType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
