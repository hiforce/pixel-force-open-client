package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum EarringType implements IPromptType {
    CROSS_EARRINGS("cross_earrings", "十字耳环"),
    CRYSTAL_EARRINGS("crystal_earrings", "水晶耳环"),
    EARRINGS("earrings", "耳环"),
    FLOWER_EARRINGS("flower_earrings", "花耳环"),
    HEART_EARRINGS("heart_earrings", "心形耳环"),
    HOOP_EARRINGS("hoop_earrings", "环状耳环"),
    MULTIPLE_EARRINGS("multiple_earrings", "多个耳环"),
    PILL_EARRINGS("pill_earrings", "药丸样式的耳环"),
    SINGLE_EARRING("single_earring", "只一边戴着耳环"),
    SKULL_EARRINGS("skull_earrings", "骷髅耳环"),
    STAR_EARRINGS("star_earrings", "星形耳环");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    EarringType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
