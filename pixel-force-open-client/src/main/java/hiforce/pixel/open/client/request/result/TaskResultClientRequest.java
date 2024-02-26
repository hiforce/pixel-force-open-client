package hiforce.pixel.open.client.request.result;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResultClientRequest extends ClientReqDTO {

    private static final long serialVersionUID = -2529403539897297438L;

    @Getter
    @Setter
    private String taskId;

    @Override
    public ScenarioType getType() {
        return ScenarioType.GET_TASK_RESULT;
    }
}
