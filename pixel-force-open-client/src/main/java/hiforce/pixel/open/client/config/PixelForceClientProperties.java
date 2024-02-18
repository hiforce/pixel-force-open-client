package hiforce.pixel.open.client.config;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2023/11/18
 */
public class PixelForceClientProperties {

    private static PixelForceClientProperties instance;

    @Getter
    @Setter
    private String accessKey;

    @Getter
    @Setter
    private String accessSecret;

    @Getter
    @Setter
    private String endpoint;

    private PixelForceClientProperties() {

    }

    public static PixelForceClientProperties getInstance() {
        if (null == instance) {
            instance = new PixelForceClientProperties();
        }
        return instance;
    }
}
