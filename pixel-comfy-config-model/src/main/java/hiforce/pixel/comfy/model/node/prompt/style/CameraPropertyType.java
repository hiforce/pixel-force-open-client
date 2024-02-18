package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/23
 */
public enum CameraPropertyType implements IStyleType {

    AATON_LTR("Aaton LTR", "PROMPT-CAMERA-PROP-AATON_LTR"),
    ARRI_ALEXA_65("ARRI ALEXA 65", "PROMPT-CAMERA-PROP-ARRI_ALEXA_65"),
    BOLEX_H_16("Bolex H16", "PROMPT-CAMERA-PROP-BOLEX_H_16"),
    RED_DIGITAL_CINEMA_CAMERA("RED_DIGITAL_CINEMA_CAMERA", "PROMPT-CAMERA-PROP-RED_DIGITAL_CINEMA_CAMERA"),
    Canon_EOS_5D("Canon EOS 5D", "PROMPT-CAMERA-PROP-Canon_EOS_5D"),
    FUJIFILM_X_T4("Fujifilm X-T4", "PROMPT-CAMERA-PROP-FUJIFILM_X_T4"),
    GO_PRO_HERO("GoPro Hero", "PROMPT-CAMERA-PROP-GO_PRO_HERO"),
    HASSELBLAD_X1D_II("Hasselblad X1D II", "PROMPT-CAMERA-PROP-HASSELBLAD_X1D_II"),
    LUMIX_GH5("Lumix GH5", "PROMPT-CAMERA-PROP-LUMIX_GH5"),
    PENTAX_645Z("Pentax 645Z", "PROMPT-CAMERA-PROP-PENTAX_645Z"),
    SONY_A_7III("Sony A7III", "PROMPT-CAMERA-PROP-SONY_A_7III"),
    LEICA_T("Leica T", "PROMPT-CAMERA-PROP-LEICA_T"),
    DIANA_F_PLUS("Diana F+", "PROMPT-CAMERA-PROP-DIANA_F_PLUS"),
    HASSELBLAD_500_CM("Hasselblad 500CM", "PROMPT-CAMERA-PROP-HASSELBLAD_500_CM"),
    HOLGA_120_N("HOLGA 120n", "PROMPT-CAMERA-PROP-HOLGA_120_N"),
    KODAK_BROWNIE("Kodak Brownie", "PROMPT-CAMERA-PROP-KODAK_BROWNIE"),
    KODAK_FUNSAVER("Kodak Funsaver", "PROMPT-CAMERA-PROP-KODAK_FUNSAVER"),
    LEICA_M3("Leica M3", "PROMPT-CAMERA-PROP-LEICA_M3"),
    ROLLEIFLEX("Rolleiflex", "PROMPT-CAMERA-PROP-ROLLEIFLEX"),
    POLAROID_SX_70("Polaroid SX-70", "PROMPT-CAMERA-PROP-POLAROID_SX_70");

    @Getter
    private final String value;

    @Getter
    private final String descKey;


    CameraPropertyType(String value, String descKey) {
        this.value = value;
        this.descKey = descKey;
    }

    @Override
    public String getName(){
        return value;
    };
}
