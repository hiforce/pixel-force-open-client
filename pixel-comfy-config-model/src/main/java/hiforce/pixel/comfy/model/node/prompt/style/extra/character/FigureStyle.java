package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum FigureStyle implements IPromptType {
    SKINNY("skinny", "骨感"),
    PLUMP("plump", "丰满"),
    CURVY("curvy", "魔鬼身材"),
    GYARU("gyaru", "辣妹(日本太妹)"),
    PREGNANT("pregnant", "怀孕"),
    FAT("fat", "肥胖"),
    THIN("thin", "瘦"),
    SLENDER("slender", "苗条"),
    GLAMOR("glamor", "魅力"),
    TALL("tall", "高大"),
    PETITE("petite", "娇小"),
    CHIBI("chibi", "萌萌"),
    MUSCULAR("muscular", "肌肉");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    FigureStyle(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
