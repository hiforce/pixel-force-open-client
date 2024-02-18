package hiforce.pixel.comfy.model.node.prompt.style;

import hiforce.pixel.comfy.model.node.IType;
import org.apache.commons.lang3.StringUtils;
import org.hiforce.lattice.message.Message;

/**
 * @author Rocky Yu
 * @since 2023/10/25
 */
public interface IStyleType extends IType {

    default String getDescKey() {
        return null;
    }

    String getValue();

    String name();

    default String getImageUrl() {
        return "";
    }

    default String getName() {
        return Message.code(String.format("%s%s", "STYLE-", name().toUpperCase())).getDisplayText();
    }

    default Float getWeight() {
        return null;
    }

    default String getWords() {
        if (null != getWeight()) {
            return String.format("(%s:%s)", getValue(), getWeight());
        }
        return "(" + getValue() + ")";
    }

    default String getDesc() {
        if (StringUtils.isNotEmpty(getDescKey())) {
            return Message.code(getDescKey()).getDisplayText();
        }
        return "";
    }
}
