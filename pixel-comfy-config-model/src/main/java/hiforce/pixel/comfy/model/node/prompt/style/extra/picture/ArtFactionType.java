package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ArtFactionType implements IPromptType {
    ART_NOUVEAU("((art nouveau))", "新艺术主义"),
    CLASSICISM("((classicism))", "古典主义"),
    FUTURISM("((futurism))", "未来主义"),
    DADAISM("((Dadaism))", "达达主义"),
    ABSTRACT_ART("((abstract art))", "抽象艺术"),
    ASCII_ART("((ASCII art))", "ASCII艺术");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ArtFactionType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
