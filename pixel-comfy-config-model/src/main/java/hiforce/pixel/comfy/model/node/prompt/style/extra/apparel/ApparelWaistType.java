package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ApparelWaistType implements IPromptType {
    APRON("apron", "围裙"),
    WAIST_APRON("waist_apron", "腰围裙"),
    MAID_APRON("maid_apron", "女仆围裙"),
    BOW_TIED_AT_THE_WAIST("bow tied at the waist", "系在前腰的蝴蝶结"),
    WAIST_CAPE("waist_cape", "穿在腰部的小披风"),
    CLOTHES_AROUND_WAIST("clothes_around_waist", "腰间衣服"),
    JACKET_AROUND_WAIST("jacket_around_waist", "腰围夹克"),
    SWEATER_AROUND_WAIST("sweater_around_waist", "围腰毛衣"),
    LOINCLOTH("loincloth", "缠腰布"),
    BUSTIER("bustier", "胸衣"),
    CORSET("corset", "束腰(马甲)"),
    GIRDLE("girdle", "紧身褡");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ApparelWaistType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
