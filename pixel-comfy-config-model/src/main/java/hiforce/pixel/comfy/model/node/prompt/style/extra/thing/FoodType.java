package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum FoodType implements IPromptType {
    A_SUSHI_ROLL("A_sushi_roll", "寿司卷", "A_sushi_roll"),
    APPLE("apple", "苹果", "apple"),
    AUBERGINE("aubergine", "茄子", "aubergine"),
    BURGER("burger", "汉堡", "burger"),
    CAKE("cake", "蛋糕", "cake"),
    CANDY("candy", "糖果", "candy"),
    CANDY_APPLE("candy_apple", "苹果糖", "candy_apple"),
    CANDY_CANE("candy_cane", "棒棒糖", "candy_cane"),
    CARROT("carrot", "胡萝卜", "carrot"),
    CIGARETTE("cigarette", "香烟", "cigarette"),
    COFFEE("coffee", "咖啡", "coffee"),
    COOKIE("cookie", "饼干", "cookie"),
    COTTON_CANDY_("cotton_candy_", "棉花糖", "cotton_candy_"),
    CREAM("cream", "奶油", "cream"),
    DANGO("dango", "团子", "dango"),
    DOUGHNUT("doughnut", "甜甜圈", "doughnut"),
    DRINK("drink", "饮料", "drink"),
    EGG("egg", "鸡蛋", "egg"),
    FRUIT("fruit", "水果", "fruit"),
    GELATIN("Gelatin", "明胶、布丁", "Gelatin"),
    ICE_CREAM("ice_cream", "冰激凌", "ice_cream"),
    KAFUU_CHINO("kafuu_chino", "卡夫奇诺", "kafuu_chino"),
    MAKIZUSHI("makizushi", "海苔卷寿司", "makizushi"),
    MEAT("meat", "肉", "meat"),
    NOODLES("noodles", "面条", "noodles"),
    OBENTO("obento", "便当", "obento"),
    ONIGIRI("onigiri", "饭团", "onigiri"),
    PANCAKE("pancake", "鬆餅", "pancake"),
    PASTIES("pasties", "馅饼", "pasties"),
    PEACH("peach", "桃子", "peach"),
    RAMEN("ramen", "拉面", "ramen"),
    SAKE("sake", "日本清酒", "sake"),
    TAIYAKI("taiyaki", "鲷鱼烧", "taiyaki"),
    TEA("tea", "茶", "tea"),
    TEACUP("teacup", "茶杯", "teacup"),
    WAGASHI("wagashi", "和果子", "wagashi"),
    WINE("wine", "葡萄酒", "wine"),
    JAM("jam", "果酱", "jam"),
    POCKY("pocky", "百奇", "pocky"),
    BOTTLED_WATER("bottled_water", "瓶裝水", "bottled_water"),
    SWEET_POTATO("sweet_potato", "甘薯", "sweet_potato"),
    SWEETS("sweets", "糖果", "sweets"),
    FOOD("food", "食物", "food"),
    FOOD_IN_MOUTH("food_in_mouth", "嘴里有食物", "food_in_mouth"),
    FOOD_ON_("food_on_", "脸上有食物", "food_on_"),
    FOOD_ON_BODY("food_on_body", "身体上有食物", "food_on_body"),
    FOOD_PRINT("food_print", "食物印花", "food_print"),
    FOOD_STAND("food_stand", "食品摊", "food_stand"),
    IN_FOOD("in_food", "(角色)在食物里", "in_food"),
    CHIPS("chips", "薯片", "chips"),
    POTATO_CHIPS("potato_chips", "薯片", "potato_chips"),
    TELSTAR("telstar", "泰事达牌足球", "telstar"),
    SUNDAE("sundae", "圣代", "sundae"),
    TEMPURA("tempura", "天妇罗", "tempura");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    FoodType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
