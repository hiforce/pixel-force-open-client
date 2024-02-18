package hiforce.pixel.comfy.model.mapping;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class ComfyField implements Serializable {

    private static final long serialVersionUID = -223452557257150012L;

    @Getter
    @Setter
    private String nodeId;

    @Getter
    @Setter
    private String fieldName;

    public static ComfyField of(String nodeId, String fieldName) {
        ComfyField field = new ComfyField();
        field.nodeId = nodeId;
        field.fieldName = fieldName;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComfyField that = (ComfyField) o;
        return Objects.equals(nodeId, that.nodeId) && Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, fieldName);
    }
}
