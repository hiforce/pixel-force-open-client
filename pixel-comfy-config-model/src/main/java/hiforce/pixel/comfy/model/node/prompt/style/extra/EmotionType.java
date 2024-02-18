package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum EmotionType implements IExtraStyleType {

    None("None"),
    Anger("Anger"),
    Anticipation("Anticipation"),
    Despair("Despair"),
    Disgust("Disgust"),
    Fear("Fear"),
    Hope("Hope"),
    Joy("Joy"),
    Love("Love"),
    //去掉怀旧
//    Nostalgia("Nostalgia", ""),
    Sadness("Sadness"),
    Surprise("Surprise"),
    Suspense("Suspense");

    @Getter
    private final String value;

    @Getter
    private final String words;

    EmotionType(String value) {
        this.value = value;
        this.words = value;
    }
}
