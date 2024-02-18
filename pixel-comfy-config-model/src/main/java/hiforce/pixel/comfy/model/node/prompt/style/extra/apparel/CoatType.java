package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CoatType implements IPromptType {

    BLAZER("blazer", "西装外套"),
    OVERCOAT("overcoat", "大衣"),
    DOUBLE_BREASTED("double-breasted", "双排纽扣(双排扣"),
    LONG_COAT("long_coat", "长外套"),
    HAORI("haori", "一种宽上衣"),
    WINTER_COAT("winter_coat", "冬季大衣"),
    HOODED_COAT("hooded_coat", "连帽大衣"),
    FUR_COAT("fur_coat", "皮草大衣"),
    FUR_TRIMMED_COAT("fur-trimmed_coat", "镶边皮草大衣"),
    DUFFEL_COAT("duffel_coat", "粗呢大衣"),
    FISHNET_TOP("fishnet_top", "渔网上衣"),
    PARKA("parka", "派克大衣"),
    JACKET("jacket", "夹克衫"),
    JACKET_PARTIALLY_REMOVED("jacket_partially_removed", "夹克部分移除"),
    JACKET_REMOVED("jacket_removed", "夹克被移除"),
    OPEN_JACKET("open_jacket", "开襟夹克(配合spread_legs)"),
    CROPPED_JACKET("cropped_jacket", "短款夹克"),
    TRACK_JACKET("track_jacket", "运动夹克"),
    HOODED_TRACK_JACKET("hooded_track_jacket", "连帽运动夹克"),
    MILITARY_JACKET("military_jacket", "军装夹克"),
    CAMOUFLAGE_JACKET("camouflage_jacket", "迷彩夹克"),
    LEATHER_JACKET("leather_jacket", "皮夹克"),
    LETTERMAN_JACKET("letterman_jacket", "莱特曼夹克"),
    BOMBER_JACKET("bomber_jacket", "飞行员夹克"),
    DENIM_JACKET("denim_jacket", "牛仔夹克"),
    LOATING_JACKET("loating_jacket", "休闲夹克"),
    FUR_TRIMMED_JACKET("fur-trimmed_jacket", "毛皮边饰夹克"),
    TWO_TONE_JACKET("two-tone_jacket", "两色夹克"),
    TRENCH_COAT("trench_coat", "风衣"),
    FURISODE("furisode", "振袖(和服的一部份)"),
    WINDBREAKER("windbreaker", "冲锋衣"),
    RAINCOAT("raincoat", "雨衣"),
    HAGOROMO("hagoromo", "羽衣"),
    TUNIC("tunic", "束腰外衣"),
    CAPE("cape", "披肩"),
    CAPELET("capelet", "披肩"),
    WINTER_CLOTHES("winter_clothes", "冬装"),
    SWEATER("sweater", "毛衣"),
    PULLOVER_SWEATERS("pullover_sweaters", "套頭毛衣"),
    RIBBED_SWEATER("ribbed_sweater", "罗纹毛衣"),
    SWEATER_VEST("sweater_vest", "毛衣背心"),
    BACKLESS_SWEATER("backless_sweater", "露背毛衣"),
    ARAN_SWEATER("aran_sweater", "爱尔兰毛衣"),
    BEIGE_SWEATER("beige_sweater", "米色毛衣"),
    BROWN_SWEATER("brown_sweater", "棕色毛衣"),
    HOODED_SWEATER("hooded_sweater", "连帽毛衣"),
    OFF_SHOULDER_SWEATER("off-shoulder_sweater", "露肩毛衣"),
    STRIPED_SWEATER("striped_sweater", "条纹毛衣"),
    VIRGIN_KILLER_SWEATER("virgin_killer_sweater", "处男杀手毛衣"),
    DOWN_JACKET("down_jacket", "羽绒服"),
    PUFFER_JACKET("puffer_jacket", "羽绒服");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CoatType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
