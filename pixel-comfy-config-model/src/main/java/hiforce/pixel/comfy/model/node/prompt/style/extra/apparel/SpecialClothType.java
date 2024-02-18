package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SpecialClothType implements IPromptType {
    CHINA_DRESS("china_dress", "中国服饰"),
    CHINESE_STYLE("chinese_style", "中国风"),
    TRADITIONAL_CLOTHES("traditional_clothes", "传统服装|民族服装"),
    JAPANESE_CLOTHES("japanese_clothes", "日式服装"),
    HANTEN_CLOTHES("hanten_(clothes)", "袢缠(日式"),
    HANBOK("hanbok", "韩服"),
    KOREAN_CLOTHES("korean_clothes", "朝鲜服饰"),
    WESTERN("western", "西部风格"),
    GERMAN_CLOTHES("german_clothes", "德国服装"),
    GOTHIC("gothic", "哥特风格"),
    LOLITA("lolita", "洛丽塔风格"),
    GOTHIC_LOLITA("gothic_lolita", "哥特洛丽塔风格"),
    BYZANTINE_FASHION("byzantine_fashion", "拜占庭风格"),
    TROPICAL("Tropical", "热带特征的"),
    INDIAN_STYLE("indian_style", "印度风格"),
    AO_DAI("Ao_Dai", "越南校服（奥黛）"),
    AINU_CLOTHES("ainu_clothes", "阿伊努人的服饰"),
    ARABIAN_CLOTHES("arabian_clothes", "阿拉伯服饰"),
    EGYPTIAN_CLOTHES("egyptian_clothes", "埃及风格服饰"),
    COSTUME("costume", "套装"),
    ANIMAL_COSTUME("animal_costume", "动物系套装(皮套)"),
    BUNNY_COSTUME("bunny_costume", "兔子服装"),
    ADAPTED_COSTUME("adapted_costume", "原设服装改编"),
    CAT_COSTUME("cat_costume", "猫系服装"),
    DOG_COSTUME("dog_costume", "皮套狗"),
    BEAR_COSTUME("bear_costume", "熊套装"),
    EMBELLISHED_COSTUME("embellished_costume", "经润饰的服装"),
    SANTA_COSTUME("santa_costume", "圣诞风格服装"),
    HALLOWEEN_COSTUME("halloween_costume", "万圣节服装"),
    KOURINDOU_TENGU_COSTUME("kourindou_tengu_costume", "香霖堂天狗装束"),
    ALTERNATE_COSTUME("alternate_costume", "与原设不同衣服"),
    COSTUME_SWITCH("costume_switch", "换衣play"),
    MEME_ATTIRE("meme_attire", "模因服装");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SpecialClothType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
