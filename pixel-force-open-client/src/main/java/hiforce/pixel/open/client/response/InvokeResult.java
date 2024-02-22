package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hiforce.lattice.message.Message;

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

    public InvokeResult message(Message message) {
        desc = message.getDisplayText();
        return this;
    }
}
