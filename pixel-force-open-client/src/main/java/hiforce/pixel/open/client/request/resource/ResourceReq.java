package hiforce.pixel.open.client.request.resource;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @Author tongwei
 * @Date 2024/2/1 12:45 PM
 * @Version 1.0
 */
@Builder
@AllArgsConstructor
public class ResourceReq extends ClientReqDTO {
    private static final long serialVersionUID = 586856331570574580L;

    @Override
    public ScenarioType getType() {
        return ScenarioType.QUERY_RESOURCE;
    }
}
