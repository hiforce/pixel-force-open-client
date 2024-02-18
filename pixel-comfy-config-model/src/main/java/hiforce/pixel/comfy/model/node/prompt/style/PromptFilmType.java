package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * 胶卷类型
 *
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptFilmType implements IStyleType {

    AGFA_VISTA("Agfa Vista", "PROMPT-FILM-TYPE-AGFA_VISTA"),
    CINESTILL_800T("Cinestill 800T", "PROMPT-FILM-TYPE-CINESTILL_800T"),
    EKTAR_100("Ektar 100", "PROMPT-FILM-TYPE-EKTAR_100"),
    FILM_GRAIN("film grain", "PROMPT-FILM-TYPE-FILM_GRAIN"),
    ILFORD_HP_5_PLUS("Ilford HP5 Plus", "PROMPT-FILM-TYPE-ILFORD_HP_5_PLUS"),
    KODAK_VISION_3("Kodak Vision3", "PROMPT-FILM-TYPE-KODAK_VISION_3"),
    KODAK_VISION_3_IMAX("Kodak Vision3 IMAX", "PROMPT-FILM-TYPE-KODAK_VISION_3_IMAX"),
    LOMOCHROME_COLOR_FILM("Lomochrome color film", "PROMPT-FILM-TYPE-LOMOCHROME_COLOR_FILM"),
    PORTA_160("Porta 160", "PROMPT-FILM-TYPE-PORTA_160"),
    TRI_X_400("Tri-X 400", "PROMPT-FILM-TYPE-TRI_X_400"),
    VELVIA_100("Velvia 100", "PROMPT-FILM-TYPE-VELVIA_100"),
    FUJICOLOR_PRO("Fujicolor Pro", "PROMPT-FILM-TYPE-FUJICOLOR_PRO");

    @Getter
    private final String value;

    @Getter
    private final String descKey;

    @Getter
    private String imageUrl;

    PromptFilmType(String value, String descKey,String imageUrl) {
        this.value = value;
        this.descKey = descKey;
        this.imageUrl = imageUrl;
    }
    PromptFilmType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }


    @Override
    public String getName(){
        return value;
    };
}
