package hiforce.pixel.open.client.comfy;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/11/10
 */
public class TaskQueueResult implements Serializable {

    private static final long serialVersionUID = 7250142621921414546L;

    @Getter
    @Setter
    private boolean success;

    @Getter
    @Setter
    private boolean pending;

    @Getter
    @Setter
    private int waitNum;

    @Getter
    @Setter
    private boolean running;

    @Getter
    @Setter
    private boolean notInQueue;
}
