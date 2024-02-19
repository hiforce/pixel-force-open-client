package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvokeResult implements Serializable {
    private static final long serialVersionUID = 4203108845569649835L;
    private String taskId;
    private String status;
    private String desc;
}
