package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum PantsType implements IPromptType {
    DRESS_BOW("dress_bow", "连衣裙上的蝴蝶结"),
    DRESSING_ANOTHER("dressing_another", "着装"),
    SHORTS_UNDER_SKIRT("shorts_under_skirt", "短裙里穿着短裤"),
    SIDE_SLIT("side_slit", "侧开衩"),
    SHORTS("shorts", "短裤"),
    MICRO_SHORTS("micro_shorts", "小尺寸短裤"),
    SHORT_SHORTS("short_shorts", "热裤"),
    HOT_PANTS("hot_pants", "热裤"),
    CUTOFFS("cutoffs", "热裤"),
    STRIPED_SHORTS("striped_shorts", "条纹短裤"),
    SUSPENDER_SHORTS("suspender_shorts", "吊带短裤"),
    DENIM_SHORTS("denim_shorts", "牛仔短裤"),
    PUFFY_SHORTS("puffy_shorts", "蓬蓬的短裤"),
    DOLPHIN_SHORTS("dolphin_shorts", "海豚短褲(真理褲)"),
    DOLFIN_SHORTS("dolfin_shorts", "海豚短褲(真理褲)"),
    TIGHT_PANTS("tight_pants", "紧身裤/运动裤"),
    CROTCHLESS_PANTS("crotchless_pants", "无裆裤（紧身）"),
    TRACK_PANTS("track_pants", "运动裤"),
    YOGA_PANTS("yoga_pants", "瑜伽裤"),
    BIKE_SHORTS("bike_shorts", "自行车短裤"),
    GYM_SHORTS("gym_shorts", "体操短裤"),
    PANTS("pants", "长裤"),
    PUFFY_PANTS("puffy_pants", "蓬松裤/宽松裤"),
    PUMPKIN_PANTS("pumpkin_pants", "南瓜裤"),
    HAKAMA_PANTS("hakama_pants", "袴裤"),
    HAREM_PANTS("harem_pants", "哈伦裤"),
    BLOOMERS("bloomers", "灯笼裤"),
    BURUMA("buruma", "女式灯笼裤"),
    JEANS("jeans", "牛仔裤"),
    CARGO_PANTS("cargo_pants", "工装裤"),
    CAMOUFLAGE_PANTS("camouflage_pants", "迷彩裤"),
    CAPRI_PANTS("capri_pants", "七分裤"),
    CHAPS("chaps", "皮套裤(上宽下窄"),
    JUMPSUIT("jumpsuit", "(尤指女式)连衫裤"),
    LOWLEG_PANTS("lowleg_pants", "低腰裤子"),
    PLAID_PANTS("plaid_pants", "格子呢裤子"),
    SINGLE_PANTSLEG("single_pantsleg", "单边长裤"),
    STRIPED_PANTS("striped_pants", "条纹裤");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    PantsType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
