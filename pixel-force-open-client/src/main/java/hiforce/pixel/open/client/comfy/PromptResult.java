package hiforce.pixel.open.client.comfy;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public class PromptResult implements Serializable {

    private static final long serialVersionUID = -7001411538877298986L;

    @Getter
    @Setter
    @JSONField(name = "prompt_id")
    private String promptId;

    @Getter
    @Setter
    @JSONField(name = "number")
    private int queueNo;
}
