package hiforce.pixel.open.client.comfy;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/11/15
 */
public class TaskRunningStatus implements Serializable {

    private static final long serialVersionUID = 4674505237610183588L;

    @Getter
    @Setter
    @JSONField(serialize = false, deserialize = false)
    private boolean running;

    @Getter
    @Setter
    @JSONField(name = "prompt_id")
    private String promptId;

    @Getter
    @Setter
    @JSONField(name = "current_node_id")
    private int currentNodeId;
}
