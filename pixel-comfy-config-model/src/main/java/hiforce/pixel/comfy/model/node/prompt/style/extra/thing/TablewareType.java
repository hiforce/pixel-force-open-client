package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum TablewareType implements IPromptType {
    POT("pot", "锅", "pot"),
    TEAPOT("teapot", "茶壶", "teapot"),
    LADLE("ladle", "长柄勺", "ladle"),
    CAN("can", "罐子", "can"),
    SODA_CAN("soda_can", "罐装饮料", "soda_can"),
    CUP("cup", "杯子", "cup"),
    PLATE("plate", "盘子", "plate"),
    TRAY("tray", "托盘", "tray"),
    BOWL("bowl", "碗", "bowl"),
    FORK("fork", "叉子", "fork"),
    CHOPSTICKS("chopsticks", "筷子", "chopsticks"),
    SPOON("spoon", "勺子", "spoon"),
    DRINKING_GLASS("drinking_glass", "水杯", "drinking_glass"),
    TUMBLER("tumbler", "普通玻璃杯", "tumbler"),
    BEER_MUG("beer_mug", "啤酒杯", "beer_mug"),
    GIFT_BOX("gift_box", "礼物盒", "gift_box"),
    HEART_SHAPED_BOX("heart-shaped_box", "心形状的礼盒", "heart-shaped_box"),
    CANDLE("candle", "蜡烛", "candle");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    TablewareType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
