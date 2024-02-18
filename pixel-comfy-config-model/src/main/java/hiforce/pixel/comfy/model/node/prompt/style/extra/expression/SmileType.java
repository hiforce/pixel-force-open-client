package hiforce.pixel.comfy.model.node.prompt.style.extra.expression;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum SmileType implements IPromptType {
    SMILE("smile", "微笑"),
    LAUGHING("laughing", "大笑"),
    KIND_SMILE("kind_smile", "开心"),
    HAPPY_SMILE(":d", "开心的笑_:D😀"),
    WINK_SMILE(";d", "眨眼笑_:D"),
    GRIN("grin", "露齿咧嘴笑"),
    TEASING_SMILE("teasing_smile", "被逗笑，咧嘴傻笑"),
    SEDUCTIVE_SMILE("seductive_smile", "魅惑的微笑"),
    SMIRK("smirk", "傻笑,自鸣得意的笑"),
    GIGGLING("giggling", "咯咯傻笑"),
    SMUG("smug", "洋洋得意"),
    NAUGHTY_FACE("naughty_face", "调皮的脸"),
    EVIL_SMILE("evil smile", "邪恶笑"),
    CRAZY_SMILE("crazy_smile", "疯狂的笑"),
    HAPPY("happy", "快乐|幸福"),
    HAPPY_BIRTHDAY("happy_birthday", "生日快乐"),
    HAPPY_HALLOWEEN("happy_halloween", "万圣节快乐"),
    HAPPY_NEW_YEAR("happy_new_year", "新年快乐"),
    HAPPY_TEARS("happy_tears", "开心的眼泪"),
    HAPPY_VALENTINE("happy_valentine", "情人节快乐");


    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SmileType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
