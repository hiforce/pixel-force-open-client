package hiforce.pixel.comfy.model.mapping;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/11/16
 */
public class TaskStepMapping implements Serializable {

    private static final long serialVersionUID = -5551989249439128317L;

    @Getter
    @Setter
    private int number;

    @Getter
    @Setter
    private String name;

    @Getter
    private final List<Integer> nodeIds = Lists.newArrayList();

    @Getter
    @Setter
    private int lastStepNodeId;

    public TaskStepMapping lastNodeId(int lastStepNodeId) {
        this.lastStepNodeId = lastStepNodeId;
        return this;
    }

    public TaskStepMapping nodeIds(Integer... nodeIds) {
        this.nodeIds.addAll(Arrays.asList(nodeIds));
        return this;
    }

    public static TaskStepMapping of(int number, String name) {
        TaskStepMapping stepMapping = new TaskStepMapping();
        stepMapping.setNumber(number);
        stepMapping.setName(name);
        return stepMapping;
    }

}
