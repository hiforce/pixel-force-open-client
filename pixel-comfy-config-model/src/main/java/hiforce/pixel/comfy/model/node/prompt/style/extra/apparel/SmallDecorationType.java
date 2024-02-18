package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SmallDecorationType implements IPromptType {
    RING("ring", "戒指"),
    WEDDING_BAND("wedding_band", "婚戒"),
    EARRINGS("earrings", "耳环"),
    SINGLE_EARRING("single_earring", "单耳环"),
    STUD_EARRINGS("stud_earrings", "耳钉"),
    NECKLACE("necklace", "项链"),
    JEWELRY("jewelry", "首饰"),
    CRYSTAL("crystal", "水晶"),
    BROOCH("brooch", "胸针"),
    GEM("gem", "宝石"),
    CHEST_JEWEL("chest_jewel", "胸前宝石"),
    FOREHEAD_JEWEL("forehead_jewel", "额头宝石"),
    TASSEL("tassel", "流苏"),
    BELLY_CHAIN_("belly_chain_", "肚链"),
    LACE("lace", "花边"),
    RIBBON("ribbon", "丝带"),
    STITCHES("stitches", "缝饰"),
    SCARF("scarf", "围巾"),
    BANDAID("bandaid", "创可贴"),
    COLLAR("collar", "项圈"),
    BELT("belt", "皮带"),
    STEAM("steam", "蒸汽"),
    BELL("bell", "铃铛"),
    AMULET("amulet", "护身符"),
    EMBLEM("emblem", "徽章"),
    FLAG_PRINT("flag_print", "旗印"),
    ANCHOR_SYMBOL("anchor_symbol", "锚符号"),
    CROSS("cross", "十字"),
    DIFFRACTION_SPIKES("diffraction_spikes", "衍射十字星"),
    IRON_CROSS("iron_cross", "铁十字架"),
    LATIN_CROSS("latin_cross", "拉丁式十字架"),
    LACE_TRIMMED_HAIRBAND("lace-trimmed_hairband", "蕾丝边发带"),
    ANKLE_LACE_UP("ankle_lace-up", "脚踝系带"),
    ST_GLORIANAS_EMBLEM("st._gloriana's_(emblem)", "圣葛罗莉安娜女学园校徽"),
    HEART_LOCK_KANTAI_COLLECTION("heart_lock_(kantai_collection)", "舰娘锁(舰C)"),
    GARTERS("garters", "袜带"),
    THIGH_STRAP("thigh_strap", "大腿绑带"),
    THIGH_RIBBON("thigh_ribbon", "大腿缎带"),
    LEG_GARTER("leg_garter", "腿环|袜带"),
    GARTER_STRAPS("garter_straps", "吊带袜的吊带"),
    LEG_RIBBON("leg_ribbon", "腿锻带"),
    BANDAID_ON_LEG("bandaid_on_leg", "腿上的绷带"),
    BANDAGED_LEG("bandaged_leg", "包扎过的腿"),
    ARM_GARTER("arm_garter", "臂环"),
    JOINTS("joints", "关节"),
    KNEEPITS("kneepits", "膝盖"),
    KNEE_PADS("knee_pads", "护膝"),
    THIGH_HOLSTER("thigh_holster", "大腿皮套"),
    BANDAID_ON_KNEE("bandaid_on_knee", "膝盖上的创可贴");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SmallDecorationType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
