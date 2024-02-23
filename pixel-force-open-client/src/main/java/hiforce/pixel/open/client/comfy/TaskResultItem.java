package hiforce.pixel.open.client.comfy;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public class TaskResultItem implements Serializable {

    private static final long serialVersionUID = -699066651529424069L;

    @Getter
    @Setter
    private String nodeId;

    @Getter
    private final List<ImageItem> images = Lists.newArrayList();
}
