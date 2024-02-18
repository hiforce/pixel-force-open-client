package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SportswearType implements IPromptType {
    SPORTSWEAR("sportswear", "运动服"),
    GYM_UNIFORM("gym_uniform", "运动服"),
    ATHLETIC_LEOTARD("athletic_leotard", "体操服"),
    TENNIS_UNIFORM("tennis_uniform", "网球衫"),
    BASEBALL_UNIFORM("baseball_uniform", "棒球服"),
    LETTERMAN_JACKET("letterman_jacket", "棒球夹克"),
    VOLLEYBALL_UNIFORM("volleyball_uniform", "排球服"),
    BIKER_CLOTHES("biker_clothes", "自行车运动服"),
    BIKESUIT("bikesuit", "骑行套装"),
    WRESTLING_OUTFIT("wrestling_outfit", "摔角服"),
    DOUGI("dougi", "武道服");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SportswearType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
