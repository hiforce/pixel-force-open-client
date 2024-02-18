package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.prompt.style.IStyleType;

/**
 * @author Rocky Yu
 * @since 2023/10/25
 */
public interface IExtraStyleType extends IStyleType {

    @Override
    default String getImageUrl() {
        return name() + ".png";
    }
}
