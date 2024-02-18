package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ExpressionOtherType implements IPromptType{
    EXPRESSIONLESS("expressionless", "面无表情"),
    SLEEPY("sleepy", "困乏的"),
    DRUNK("drunk", "喝醉的"),
    BORED("bored", "无聊的"),
    CONFUSED("confused", "使困惑"),
    THINKING("thinking", "思考"),
    LONELY("lonely", "孤独"),
    LIGHT_BLUSH("light_blush", "轻微脸红"),
    BLUSH("blush", "脸红"),
    SHY("shy", "害羞的"),
    EMBARRASS("embarrass", "害羞的(尴尬的)"),
    FACEPALM("facepalm", "捂脸"),
    FLUSTERED("flustered", "慌张的"),
    SWEAT("sweat", "流汗"),
    SCARED("scared", "害怕的"),
    AHEGAO("ahegao", "阿黑颜"),
    ENDURED_FACE("endured_face", "忍耐的表情"),
    RESTRAINED("restrained", "忍耐"),
    DARK_PERSONA("dark_persona", "黑化的"),
    CRAZY("crazy", "疯狂的"),
    EXHAUSTED("exhausted", "筋疲力尽的"),
    TSUNDERE("Tsundere", "傲娇"),
    YANDERE("yandere", "病娇"),
    MULTIPLE_PERSONA("multiple_persona", "多重人格"),
    JEKYLL_AND_HYDE("Jekyll_and_Hyde", "多重人格"),
    TWITCHING("twitching", "抽搐"),
    SPASM("spasm", "痉挛"),
    TREMBLING("trembling", "颤抖"),
    RAPE_FACE("rape_face", "强奸脸"),
    ROLLING_EYES("rolling_eyes", "翻白眼(高潮眼）"),
    ENVY("envy", "嫉妒"),
    FEMALE_ORGASM("female_orgasm", "绝顶"),
    HEAVY_BREATHING("heavy_breathing", "重呼吸，可能没用"),
    NAUGHTY("naughty", "淘气"),
    EXPRESSIONS("expressions", "表情差分（大概）"),
    MOANING("moaning", "呻吟"),
    SCOWL("scowl", "嫌弃的眼神");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ExpressionOtherType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }}
