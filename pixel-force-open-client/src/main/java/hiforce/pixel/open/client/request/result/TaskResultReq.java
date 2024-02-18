package hiforce.pixel.open.client.request.result;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.*;

/**
 * @Author tongwei
 * @Date 2023/12/21 3:22 PM
 * @Version 1.0
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResultReq extends ClientReqDTO {
    private static final long serialVersionUID = -2529403539897297438L;

    @Getter
    @Setter
    private String taskId;

    @Override
    public ScenarioType getType() {
        return ScenarioType.GET_TASK_RESULT;
    }
}
