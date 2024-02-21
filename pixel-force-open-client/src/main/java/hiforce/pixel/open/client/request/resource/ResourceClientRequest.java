package hiforce.pixel.open.client.request.resource;

import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.ScenarioType;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
public class ResourceClientRequest extends ClientReqDTO {
    private static final long serialVersionUID = 586856331570574580L;

    @Override
    public ScenarioType getType() {
        return ScenarioType.QUERY_RESOURCE;
    }
}
