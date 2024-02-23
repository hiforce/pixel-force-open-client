package hiforce.pixel.open.client.comfy;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/10/18
 */
public class UploadImageResult implements Serializable {

    private static final long serialVersionUID = 655715678936801756L;


    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String subfolder;

    @Getter
    @Setter
    private String type;


    public UploadImageResult() {

    }

    public UploadImageResult(String name) {
        this.name = name;
    }


    public String toString() {
        if (StringUtils.isEmpty(subfolder)) {
            return name;
        }
        return subfolder + "/" + name;
    }
}
