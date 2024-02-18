package hiforce.pixel.open.client.request.submit;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/11/18
 */
public class PixelSubmitData implements Serializable {

    private static final long serialVersionUID = 6700097986125889455L;

    @Getter
    @Setter
    private String accessKey;

    @Getter
    @Setter
    private String data;
}
