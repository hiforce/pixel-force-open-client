package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum AgeStyle implements IPromptType {

    TODDLER("toddler", "幼童"),
    KINDERGARTENER("kindergartener", "幼儿园"),
    CHILD("child", "儿童"),
    UNDERAGE("underage", "未成年"),
    TEENAGER("teenager", "青少年(13-19)"),
    TEEN("teen", "青少年(13-19)"),
    EARLY_TEEN("early teen", "青少年早期（11-15）"),
    ADULT("adult", "大人"),
    ELDER("elder", "老人"),
    OLD("old", "老年"),
    LOLI("loli", "萝莉"),
    SHOTA("shota", "正太");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    AgeStyle(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
