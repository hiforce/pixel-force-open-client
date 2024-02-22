package hiforce.pixel.open.client.request.general;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/2/22
 */
public class GeneralPromptClientRequest extends ClientReqDTO {


    @Getter
    @Setter
    private String workflow;

    @Getter
    @Setter
    private String workflowAPI;

    @Override
    public ScenarioType getType() {
        return ScenarioType.GENERAL_PROMPT;
    }
}
