package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author tongwei
 * @Date 2023/12/21 3:22 PM
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadResult implements Serializable {
    private static final long serialVersionUID = -7148927820862692475L;

    private String path;

    private String status;

    private String desc;
}
