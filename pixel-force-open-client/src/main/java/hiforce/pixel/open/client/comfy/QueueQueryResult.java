
package hiforce.pixel.open.client.comfy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public class QueueQueryResult implements Serializable {

    private static final long serialVersionUID = 1421449006586969737L;

    @Getter
    @Setter
    @JSONField(name = "running_status")
    private TaskRunningStatus runningStatus;

    @Getter
    @Setter
    @JSONField(name = "queue_running")
    private List<String> running = Lists.newArrayList();

    @Getter
    @Setter
    @JSONField(name = "queue_pending")
    private List<String> pending = Lists.newArrayList();

    public String toString() {
        String runningStr = String.join(",", running);
        String pendingStr = String.join(",", pending);
        String runningStatus = null == getRunningStatus() ? "{}" : JSON.toJSONString(this.runningStatus);
        return String.format("{ running: [%s], pending: [%s], running_status: [%s]}",
                runningStr, pendingStr, runningStatus);

    }

}
