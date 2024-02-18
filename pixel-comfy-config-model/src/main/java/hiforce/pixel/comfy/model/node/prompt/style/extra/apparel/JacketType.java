package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum JacketType implements IPromptType {
    BLOUSE("blouse", "女式衬衫"),
    WHITE_SHIRT("white_shirt", "白衬衫"),
    COLLARED_SHIRT("collared_shirt", "有领衬衫"),
    DRESS_SHIRT("dress_shirt", "西服衬衫"),
    SAILOR_SHIRT("sailor_shirt", "水手服衬衫"),
    CROPPED_SHIRT("cropped_shirt", "短衬衫"),
    T_SHIRT("t-shirt", "T恤"),
    CASUAL_T_SHIRTS("casual T-shirts", "日常T恤"),
    SHORT_SLEEVE_T_SHIRTS("short sleeve T-shirts", "短袖T恤"),
    OFF_SHOULDER_SHIRT("off-shoulder_shirt", "露肩衬衫(搭肩衫)"),
    SHRUG_CLOTHING("shrug_(clothing)", "包肩上衣"),
    CARDIGAN("cardigan", "开襟毛衣衫"),
    CRISS_CROSS_HALTER("criss-cross_halter", "交叉吊带衫"),
    FRILLED_SHIRT("frilled_shirt", "褶边衬衫"),
    SWEATSHIRT("sweatshirt", "长袖运动卫衣"),
    HAWAIIAN_SHIRT("hawaiian_shirt", "夏威夷衫"),
    HOODIE("hoodie", "连帽衫"),
    IMPOSSIBLE_SHIRT("Impossible shirt", "贴合程度不合逻辑的衬衫"),
    KAPPOUGI("kappougi", "(烹饪时穿的)罩衫"),
    PLAID_SHIRT("plaid_shirt", "格子衬衫"),
    POLO_SHIRT("polo_shirt", "马球衫"),
    PRINT_SHIRT("print_shirt", "印花衬衫"),
    SHIRT("shirt", "衬衫"),
    SLEEVELESS_HOODIE("sleeveless_hoodie", "无袖连帽衫"),
    SLEEVELESS_SHIRT("sleeveless_shirt", "无袖衬衫"),
    STRIPED_SHIRT("striped_shirt", "条纹衬衫"),
    TANK_TOP("tank_top", "背心(居家)"),
    VEST("vest", "背心(正式)"),
    WAISTCOAT("waistcoat", "背心(正式)"),
    CAMISOLE("camisole", "吊帶背心(小可愛)"),
    TIED_SHIRT("tied_shirt", "系带衬衫(把衣角和下擺打结)"),
    UNDERSHIRT("undershirt", "汗衫"),
    CROP_TOP("crop_top", "截短上衣"),
    HIGHLEG("highleg", "高开衩的衣物"),
    CLOTHING_CUTOUT("clothing_cutout", "衣服漏洞"),
    BACK_CUTOUT("back_cutout", "露背上衣"),
    CLEAVAGE_CUTOUT("cleavage_cutout", "乳沟处开洞"),
    NAVEL_CUTOUT("navel_cutout", "肚脐开洞"),
    MIDRIFF("midriff", "露腰上衣"),
    HEART_CUTOUT("heart_cutout", "心形开口"),
    TORN_CLOTHES("torn_clothes", "撕裂的衣服"),
    TORN_SHIRT("torn_shirt", "撕裂的衬衫"),
    UNDRESSING("undressing", "脱衣服中"),
    CLOTHES_DOWN("clothes_down", "褪下衣物"),
    SHIRT_LIFT("shirt_lift", "掀起衬衫"),
    SHIRT_PULL("shirt_pull", "衬衫拉下来"),
    SHIRT_TUCKED_IN("shirt_tucked_in", "衬衫塞进去"),
    CLOTHES_TUG("clothes_tug", "拖拽衣服"),
    SHIRT_TUG("shirt_tug", "拖拽衬衫"),
    UNTUCKED_SHIRT("untucked_shirt", "解开的衬衫"),
    LIFTED_BY_SELF("lifted_by_self", "掀自己衣服"),
    UNTIED("untied", "掀自己衣服"),
    OPEN_CLOTHES("open_clothes", "敞开的衣服"),
    UNBUTTONED_SHIRT("unbuttoned shirt", "解开纽扣的衬衫"),
    BUTTON_GAP("button_gap", "纽扣之间的缝隙(没解开"),
    PARTIALLY_UNBUTTONED("partially_unbuttoned", "解开部分纽扣"),
    PARTIALLY_UNZIPPED("partially_unzipped", "拉开上部分拉链"),
    CLOTHES_REMOVED("clothes_removed", "脱下的衣服"),
    SHIRT_REMOVED("shirt_removed", "脱下衬衫"),
    WARDROBE_ERROR("wardrobe_error", "衣服滑落"),
    UNDERSIZED_CLOTHES("undersized_clothes", "穿衣方式错了"),
    TIGHT("tight", "衣物紧紧的"),
    WEDGIE("wedgie", "嵌入(拉裆部衣物所致)"),
    WARDROBE_MALFUNCTION("wardrobe_malfunction", "衣服出了意外(如崩开)"),
    TAUT_SHIRT("taut_shirt", "绷紧的衬衫"),
    TAUT_CLOTHES("taut_clothes", "绷紧的衣服"),
    UNDERBUST("underbust", "勒出下胸围"),
    OVERSIZED_CLOTHES("oversized_clothes", "过大号的衣服"),
    OVERSIZED_SHIRT("oversized_shirt", "过大号衬衫"),
    BORROWED_GARMENTS("borrowed_garments", "男友的衣服"),
    STRAP_SLIP("strap_slip", "衣物吊带滑落(导致走光)"),
    WET_SHIRT("wet_shirt", "湿衬衫"),
    CLOTHES_THEFT("clothes_theft", "小偷衣服");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    JacketType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
