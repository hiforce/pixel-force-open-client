package hiforce.pixel.open.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author tongwei
 * @Date 2024/2/1 12:15 PM
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resource implements Serializable {
    private static final long serialVersionUID = -3523287262695631687L;

    private String id;

    private String type;

    private String name;

    private String desc;
}
