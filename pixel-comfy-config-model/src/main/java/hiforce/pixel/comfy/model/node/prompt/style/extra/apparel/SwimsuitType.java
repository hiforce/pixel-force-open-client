package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SwimsuitType implements IPromptType {
    SWIMSUIT("swimsuit", "泳装"),
    SWIMWEAR("swimwear", "泳衣"),
    WET_SWIMSUIT("wet_swimsuit", "湿泳衣"),
    SCHOOL_SWIMSUIT("school_swimsuit", "学校泳装（死库水）"),
    NEW_SCHOOL_SWIMSUIT("new_school_swimsuit", "新式死库水"),
    OLD_SCHOOL_SWIMSUIT("old_school_swimsuit", "旧式死库水"),
    COMPETITION_SCHOOL_SWIMSUIT("competition_school_swimsuit", "竞泳死库水"),
    COMPETITION_SWIMSUIT("competition_swimsuit", "赛用泳衣"),
    CASUAL_ONE_PIECE_SWIMSUIT("casual_one-piece_swimsuit", "连体泳衣"),
    FRONT_ZIPPER_SWIMSUIT("front_zipper_swimsuit", "拉链在正面的泳衣"),
    HIGHLEG_SWIMSUIT("highleg_swimsuit", "高开衩的泳衣"),
    ONE_PIECE_SWIMSUIT("one-piece_swimsuit", "一体式泳衣"),
    SWIMSUIT_OF_PERPETUAL_SUMMER("swimsuit_of_perpetual_summer", "常夏的泳衣(fgo学妹灵衣)"),
    BIKINI("bikini", "比基尼"),
    HIGHLEG_BIKINI("highleg_bikini", "高腰比基尼"),
    LOWLEG_BIKINI("lowleg_bikini", "低腰比基尼"),
    SLINGSHOT_SWIMSUIT("slingshot_swimsuit", "V字泳衣"),
    SAILOR_BIKINI("sailor_bikini", "水手服款比基尼"),
    SHELL_BIKINI("shell_bikini", "贝壳比基尼"),
    SPORTS_BIKINI("sports_bikini", "运动比基尼"),
    STRING_BIKINI("string_bikini", "系绳比基尼"),
    STRAPLESS_BIKINI("strapless_bikini", "无肩带比基尼"),
    SIDE_TIE_BIKINI("side-tie_bikini", "细带款比基尼"),
    FRONT_TIE_BIKINI_TOP("front-tie_bikini_top", "前系带比基尼上衣"),
    MULTI_STRAPPED_BIKINI("multi-strapped_bikini", "多绑带比基尼"),
    THONG_BIKINI("thong_bikini", "丁字裤比基尼"),
    FRONT_TIE_BIKINI("front-tie_bikini", "从正面打结的比基尼"),
    FRILLED_BIKINI("frilled_bikini", "花边比基尼"),
    O_RING_BIKINI("o-ring_bikini", "带O型环的比基尼"),
    EYEPATCH_BIKINI("eyepatch_bikini", "眼罩比基尼"),
    LAYERED_BIKINI("layered_bikini", "分层比基尼"),
    BOW_BIKINI("bow_bikini", "带蝴蝶结的比基尼"),
    FRILLED_SWIMSUIT("frilled_swimsuit", "花边泳衣"),
    POLKA_DOT_SWIMSUIT("polka_dot_swimsuit", "圆斑泳衣"),
    STRIPED_SWIMSUIT("striped_swimsuit", "条纹泳衣"),
    STRIPED_BIKINI("striped_bikini", "条纹比基尼"),
    PLAID_BIKINI("plaid_bikini", "格子比基尼"),
    POLKA_DOT_BIKINI("polka_dot_bikini", "圆斑比基尼"),
    PRINT_BIKINI("print_bikini", "印花比基尼"),
    AMERICAN_FLAG_BIKINI("american_flag_bikini", "美国国旗比基尼"),
    GERMAN_FLAG_BIKINI("german_flag_bikini", "德国国旗比基尼"),
    IMPOSSIBLE_SWIMSUIT("impossible_swimsuit", "人体彩绘般的泳衣"),
    BIKINI_TOP("bikini_top", "只穿着比基尼上衣"),
    BIKINI_TOP_ONLY("bikini_top_only", "仅比基尼上衣"),
    BIKINI_TOP_REMOVED("bikini_top_removed", "脱下了比基尼上衣"),
    BIKINI_BOTTOM_ONLY("bikini_bottom_only", "仅比基尼下装"),
    BIKINI_BOTTOM("bikini_bottom", "比基尼泳裤"),
    UNTIED_BIKINI("untied_bikini", "解开的比基尼"),
    BIKINI_ASIDE("bikini_aside", "从三点剥开的比基尼"),
    SWIMSUIT_ASIDE("swimsuit_aside", "把泳衣的裆部挪到一边"),
    SWIMSUIT_UNDER_CLOTHES("swimsuit_under_clothes", "衣服里面穿着泳衣"),
    TORN_SWIMSUIT("torn_swimsuit", "破损的泳衣"),
    BIKINI_SKIRT("bikini_skirt", "比基尼裙"),
    SWIM_BRIEFS("swim_briefs", "泳裤"),
    SWIM_CAP("swim_cap", "泳帽"),
    SWIM_TRUNKS("swim_trunks", "泳裤"),
    MALE_SWIMWEAR("male_swimwear", "男用泳裤");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SwimsuitType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
