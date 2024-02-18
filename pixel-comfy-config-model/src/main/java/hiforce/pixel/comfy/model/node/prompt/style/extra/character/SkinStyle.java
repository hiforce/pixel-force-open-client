package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum SkinStyle implements IPromptType {
    WHITE_SKIN("white_skin", "白皮肤"),
    PALE_SKIN("pale_skin", "苍白的皮肤"),
    FAIR_SKIN("fair_skin", "白皙的皮肤"),
    BROWN_SKIN("brown_skin", "棕色皮肤"),
    DEEP_SKIN("deep_skin", "深色皮肤"),
    DARK_SKIN("dark_skin", "黑皮肤"),
    BLACK_SKIN("black_skin", "黑皮肤"),
    SHINY_SKIN("shiny_skin", "有光泽的皮肤"),
    WHITE_MARBLE_GLOWING_SKIN("white_marble_glowing_skin", "白色大理石发光皮肤"),
    TATTOO("tattoo", "纹身"),
    TAN("tan", "日晒"),
    TANLINES("tanlines", "日晒痕迹"),
    OIL("oil", "油性");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    SkinStyle(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
