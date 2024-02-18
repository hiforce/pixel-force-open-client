package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum IdentityStyle implements IPromptType {
    LIFEGUARD("lifeguard", "救生员"),
    BOXER("boxer", "拳击手"),
    SCIENTIST("scientist", "科学家"),
    ATHLETES("athletes", "运动员"),
    OFFICE_LADY("office lady", "职场女性"),
    MONK("monk", "和尚"),
    CROBAT("crobat", "杂技演员"),
    NUN("nun", "修女"),
    NURSE("nurse", "护士"),
    STEWARDESS("stewardess", "空姐"),
    STUDENT("student", "学生"),
    WAITRESS("waitress", "女服务员"),
    TEACHER("teacher", "老师"),
    RACER("racer", "赛车手"),
    POLICE("police", "警察"),
    SOLDIER("soldier", "士兵"),
    CHEERLEADER("cheerleader", "啦啦队"),
    ACTOR("actor", "男演员"),
    ACTRESS("actress", "女演员"),
    SPY("spy", "间谍"),
    AGENT("agent", "特工"),
    ASSASSIN("assassin", "刺客"),
    POET("poet", "诗人"),
    SAMURAI("samurai", "日本武士"),
    DANCING_GIRL("dancing girl", "舞女"),
    MOTORCYCLIST("motorcyclist", "摩托车手"),
    HACKER("hacker", "黑客"),
    MAGICIAN("magician", "魔术师"),
    DETECTIVE("detective", "侦探"),
    DOLL("doll", "人偶"),
    MAID("maid", "女仆"),
    PILOT("pilot", "飞行员"),
    DIVER("diver", "潜水员"),
    BAR_CENSOR("bar censor", "酒吧审查员"),
    MISSIONARY("missionary", "传教士"),
    FIREFIGHTER("firefighter", "消防员"),
    GOALKEEPER("goalkeeper", "守门员"),
    CHEF("chef", "厨师"),
    ASTRONAUT("astronaut", "宇航员"),
    CASHIER("cashier", "收银员"),
    MAILMAN("mailman", "邮递员"),
    BARISTA("barista", "咖啡师"),
    THE_HERMIT("the hermit", "隐士"),
    MAKIHITSUJI("makihitsuji", "牧羊人"),
    RACE_QUEEN("race_queen", "赛车女郎"),
    QUEEN("queen", "女王"),
    DOCTOR("doctor", "医生"),
    KNIGHT("knight", "骑士"),
    HOUSEMAID("housemaid", "女仆"),
    DANCER("dancer", "舞者"),
    BALLERINA("ballerina", "芭蕾舞演员"),
    GYM_LEADER("gym_leader", "体操教练"),
    TRAP("trap", "伪娘"),
    FEMALE("female", "女人"),
    HAREM("harem", "后宫"),
    IDOL("idol", "偶像"),
    MALE("male", "男人"),
    PRIEST("priest", "牧师"),
    CLERIC("cleric", "神职人员(基督教)"),
    WA_MAID("wa_maid", "和风女仆"),
    YAOI("yaoi", "搞基"),
    YURI("yuri", "百合"),
    ALBINO("albino", "白化病患者"),
    AMPUTEE("amputee", "截肢者");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    IdentityStyle(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
