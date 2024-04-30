package hiforce.pixel.open.client.request;

import hiforce.pixel.comfy.model.node.IType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/28
 */
@Getter
public enum ScenarioType implements IType {

    GENERAL_PROMPT("GeneralPrompt"),
    TXT_2_IMG("TagGenerate"),
    TURBO_TXT_2_IMG("TurboTagGenerate"),
    IMG_2_IMG("Image2Image"),
    CHANGE_BG("ChangeBg"),
    TURBO_CHANGE_BG("TurboChangeBg"),
    RESERVE_CLOTH("ReserveCloth"),
    QUERY_RESOURCE("QueryResource"),
    UPLOAD_IMG("UploadImage"),
    GET_TASK_RESULT("GetTaskResult"),
    TEXT_SWAP_FACE("TextSwapFace"),
    REMOVE_BG("RemoveBg"),
    UPSCALE_4X_ULTRA_SHARP("Upscale4xUltraSharp"),
    ;

    private final String value;

    ScenarioType(String value) {
        this.value = value;
    }

    public static ScenarioType getType(String value) {
        for (ScenarioType scenarioType : ScenarioType.values()) {
            if (value.equals(scenarioType.getValue())) {
                return scenarioType;
            }
        }
        return null;
    }
}
