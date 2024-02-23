package hiforce.pixel.open.client.comfy;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public class ImageItem implements Serializable {

    private static final long serialVersionUID = 6119912143425669278L;

    @Getter
    @Setter
    private String filename;

    @Getter
    @Setter
    private ImageOutputType type;

    @Getter
    @Setter
    private String subfolder;

    @Getter
    @Setter
    private boolean extra;

    @Getter
    @Setter
    private boolean debug;
}
