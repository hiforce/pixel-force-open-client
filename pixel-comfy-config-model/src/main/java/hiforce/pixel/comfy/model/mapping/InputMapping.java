package hiforce.pixel.comfy.model.mapping;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
@Builder
public class InputMapping implements Serializable {

    private static final long serialVersionUID = -1888430226757385171L;

    @Getter
    private Map<InputField, ComfyField> inputs;

    @Getter
    private List<TaskStepMapping> steps;
}
