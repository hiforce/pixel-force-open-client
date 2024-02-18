package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum NoseType implements IPromptType {
    POINTED_NOSE("pointed nose", "尖鼻子"),
    SMALL_NOSE("small nose", "小鼻子"),
    BIG_NOSE("big nose", "大鼻子"),
    NO_NOSE("no_nose", "没鼻子的"),
    DOT_NOSE("dot_nose", "点状鼻"),
    NOSE_BUBBLE("nose_bubble", "鼻泡"),
    SMELLING("smelling", "闻"),
    NOSE("nose", "鼻子"),
    NOSEBLEED("nosebleed", "流鼻血"),
    SNOT("snot", "鼻涕"),
    SNOUT("snout", "动物口鼻部");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    NoseType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
