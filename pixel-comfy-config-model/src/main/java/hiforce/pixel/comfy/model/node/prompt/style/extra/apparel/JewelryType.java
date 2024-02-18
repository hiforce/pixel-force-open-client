package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum JewelryType implements IPromptType {
    BRACELET("bracelet", "手链"),
    CHOKER("choker", "项圈"),
    METAL_COLLAR("metal collar", "金属项圈"),
    RING("ring", "戒指"),
    WRISTBAND("wristband", "腕带"),
    PENDANT("pendant", "吊坠"),
    BROOCH("brooch", "胸针"),
    HOOP_EARRINGS("hoop earrings", "圈形耳环"),
    BANGLE("bangle", "手镯"),
    STUD_EARRINGS("stud earrings", "耳钉"),
    SUNBURST("sunburst", "旭日形首饰"),
    PEARL_BRACELET("pearl bracelet", "珍珠手链"),
    DROP_EARRINGS("drop earrings", "耳坠"),
    PUPPET_RINGS("puppet rings", "木偶戒指"),
    CORSAGE("corsage", "胸花"),
    SAPPHIRE_BROOCH("sapphire brooch", "蓝宝石胸针"),
    JEWELRY("jewelry", "珠宝首饰"),
    NECKLACE("necklace", "项链");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    JewelryType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
