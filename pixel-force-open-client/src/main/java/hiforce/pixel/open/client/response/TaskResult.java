package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author tongwei
 * @Date 2023/12/21 3:22 PM
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResult implements Serializable {
    private static final long serialVersionUID = 8378229293045039847L;
    private String taskId;
    private String status;
    private String desc;
    private List<String> fileUrls;
}
