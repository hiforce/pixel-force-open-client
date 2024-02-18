package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum PromptStyleType implements IStyleType {

    ABSTRACT("abstract", "PROMPT-STYLE-ABSTRACT"),
    ANALOGUE("analogue", "PROMPT-STYLE-ANALOGUE"),
    BEAUTY("beauty", "PROMPT-STYLE-BEAUTY"),
    CANDID("candid", "PROMPT-STYLE-CANDID"),
    DOCUMENTARY("documentary photography", "PROMPT-STYLE-DOCUMENTARY"),
    GLAMOUR("glamour photography", "PROMPT-STYLE-GLAMOUR"),
    HIGH_FASHION("high fashion photography", "PROMPT-STYLE-HIGH-FASHION"),
    INSTANT_PHOTO("instant photo", "PROMPT-STYLE-HIGH-INSTANT"),
    LARGE_FORMAT("large format", "PROMPT-STYLE-LARGE-FORMAT"),
    LIFESTYLE("lifestyle photography", "PROMPT-STYLE-LIFESTYLE"),
    MODERNIST("modernist", "PROMPT-STYLE-MODERNIST"),
    PAPARAZZI("paparazzi", "PROMPT-STYLE-PAPARAZZI"),
    PICTORIALIST("pictorialist style", "PROMPT-STYLE-PICTORIALIST"),
    POLAROID("polaroid", "PROMPT-STYLE-POLAROID"),
    PINHOLE("pinhole photography", "PROMPT-STYLE-PINHOLE"),
    STREET_FASHION("street fashion photography", "PROMPT-STYLE-STREET-FASHION"),
    SURREALIST("surrealist photography", "PROMPT-STYLE-SURREALIST"),
    TINTYPE("tintype", "PROMPT-STYLE-TINTYPE");

    @Getter
    private final String value;

    @Getter
    private final String descKey;


    PromptStyleType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }

    public String getWords(String mainPrompt){
        return "(photo of " + value + " " + mainPrompt + ")";
    }
}
