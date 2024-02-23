package hiforce.pixel.comfy.model.node;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2024/2/23
 */
public class ComfyInputs implements Serializable {

    private static final long serialVersionUID = 1252997545900398911L;

    @Getter @Setter
    private JSONObject value;
}
