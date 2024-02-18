package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author tongwei
 * @Date 2024/2/1 12:08 PM
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceResult implements Serializable {
    private static final long serialVersionUID = 468213811198317087L;

    private List<Resource> resources;

    private String status;

    private String desc;
}
