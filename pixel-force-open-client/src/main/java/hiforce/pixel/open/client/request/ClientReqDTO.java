package hiforce.pixel.open.client.request;

import com.google.common.collect.Lists;
import hiforce.pixel.open.client.request.submit.ResourcePolicy;
import hiforce.pixel.open.client.request.submit.ResourceProvider;
import hiforce.pixel.open.client.request.submit.ResourceType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/11/18
 */
public abstract class ClientReqDTO implements Serializable {

    private static final long serialVersionUID = 2311614130977702960L;

    /**
     * 资源使用策略：
     * - SPECIFIC - 使用指定资源ID里的可用资源
     * - REGISTERED - 账号里已购买的可用资源
     */
    @Getter
    @Setter
    private ResourcePolicy policy = ResourcePolicy.REGISTERED;

    @Getter
    @Setter
    private ResourceProvider provider = ResourceProvider.CUSTOMER;

    /**
     * 用来处理本次请求数据的资源实例ID
     */
    @Getter
    private final List<String> resourceIds = Lists.newArrayList();

    /**
     * 资源类型，目前仅支持COMFY_UI
     */
    @Getter
    @Setter
    private ResourceType resourceType = ResourceType.COMFY_UI;

    /**
     * @return API 类型
     */
    public abstract ScenarioType getType();
}
