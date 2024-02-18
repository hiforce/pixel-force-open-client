package hiforce.pixel.comfy.model.mapping;

import hiforce.pixel.comfy.model.node.IIntType;
import hiforce.pixel.comfy.model.node.IType;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hiforce.lattice.message.Message;
import org.jetbrains.annotations.PropertyKey;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
@Slf4j
public class InputField implements Serializable {

    private static final long serialVersionUID = 2791414391187357124L;

    @Getter
    @Setter
    private String inputName;

    /**
     * open api字段名(open api)
     */
    @Getter
    @Setter
    private String apiFieldName;

    /**
     * 字段是否必填(open api)
     */
    @Getter
    @Setter
    private boolean required;

    /**
     * 字段是否可见(open api)
     */
    @Getter
    @Setter
    private boolean visible;

    /**
     * 字段描述(open api)
     */
    private String desc;

    @Getter
    @Setter
    private DataType dataType;

    @Getter
    @Setter
    private ComfyFieldType fieldType;

    @Getter
    @Setter
    private String stringValue;

    @Getter
    @Setter
    private long longValue;

    @Getter
    @Setter
    private int intValue;

    @Getter
    @Setter
    private boolean boolValue;

    @Getter
    @Setter
    private float floatValue;

    public String getDesc() {
        return Message.code(desc).getDisplayText();
    }

    @Override
    public String toString() {
        return "InputField{" +
                "inputName='" + inputName + '\'' +
                ", apiFieldName='" + apiFieldName + '\'' +
                ", dataType=" + dataType + '\'' +
                ", required=" + required + '\'' +
                ", visible=" + visible + '\'' +
                ", desc=" + desc + '\'' +
                '}';
    }

    public static InputField of(String inputName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc) {
        return of(inputName, inputName, dataType, required, visible, desc);
    }

    public static InputField of(String inputName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc,
                                ComfyFieldType fieldType) {
        return of(inputName, inputName, dataType, required, visible, desc, fieldType);
    }

    public static InputField of(String inputName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc,
                                ComfyFieldType fieldType, Object value) {
        return of(inputName, inputName, dataType, required, visible, desc, fieldType, value);
    }

    public static InputField of(String inputName, String apiFieldName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc) {
        InputField field = new InputField();
        field.inputName = inputName;
        field.apiFieldName = apiFieldName;
        field.dataType = dataType;
        field.required = required;
        field.visible = visible;
        field.desc = desc;
        return field;
    }

    public static InputField of(String inputName, String apiFieldName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc,
                                ComfyFieldType fieldType) {
        InputField field = new InputField();
        field.inputName = inputName;
        field.apiFieldName = apiFieldName;
        field.dataType = dataType;
        field.fieldType = fieldType;
        field.required = required;
        field.visible = visible;
        field.desc = desc;
        return field;
    }

    public static InputField of(String inputName, String apiFieldName, DataType dataType, boolean required, boolean visible,
                                @PropertyKey(resourceBundle = "i18n.infos") String desc,
                                ComfyFieldType fieldType, Object value) {

        InputField field = of(inputName, apiFieldName, dataType, required, visible, desc);
        field.fieldType = fieldType;
        try {
            if (dataType == DataType.STRING) {
                field.stringValue = null == value ? null : value.toString();
            } else if (dataType == DataType.INT) {
                field.intValue = null == value ? 0 : Integer.parseInt(value.toString());
            } else if (dataType == DataType.FLOAT) {
                field.floatValue = null == value ? 0.0f : Float.parseFloat(value.toString());
            } else if (dataType == DataType.BOOLEAN) {
                if (null == value) {
                    value = false;
                }
                if (fieldType == ComfyFieldType.BOOLEAN) {
                    field.boolValue = Boolean.parseBoolean(value.toString());
                } else {
                    field.intValue = Boolean.parseBoolean(value.toString()) ? 2 : 1;
                }
            } else if (dataType == DataType.LONG) {
                field.longValue = null == value ? 0L : Long.parseLong(value.toString());
            } else if (dataType == DataType.TYPE_ENUM) {
                field.stringValue = null == value ? "" : ((IType) value).getValue();
            } else if (dataType == DataType.INT_TYPE_ENUM) {
                field.intValue = null == value ? 0 : ((IIntType) value).getValue();
            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return field;
    }

    public Object getFieldValue() {
        if (dataType == DataType.STRING) {
            return stringValue;
        } else if (dataType == DataType.INT) {
            return intValue;
        } else if (dataType == DataType.LONG) {
            return longValue;
        } else if (dataType == DataType.FLOAT) {
            return floatValue;
        } else if (dataType == DataType.BOOLEAN) {
            if (fieldType == ComfyFieldType.BOOLEAN) {
                return boolValue;
            }
            return intValue;
        } else if (dataType == DataType.TYPE_ENUM) {
            return stringValue;
        } else if (dataType == DataType.INT_TYPE_ENUM) {
            return intValue;
        }
        return null;
    }
}
