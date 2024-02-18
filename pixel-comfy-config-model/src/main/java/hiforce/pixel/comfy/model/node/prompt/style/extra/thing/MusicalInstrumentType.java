package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum MusicalInstrumentType implements IPromptType {
    MUSIC("music", "音乐", "music"),
    GUITAR("guitar", "吉他", "guitar"),
    PIANO("piano", "钢琴", "piano"),
    CELLO("cello", "大提琴", "cello"),
    PLAYING_INSTRUMENT("playing_instrument", "演奏乐器", "playing_instrument"),
    WIND_CHIME("wind_chime", "风铃", "wind_chime");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    MusicalInstrumentType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
