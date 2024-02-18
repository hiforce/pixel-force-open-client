package hiforce.pixel.comfy.model.mapping;

import hiforce.pixel.comfy.model.node.IIntType;
import hiforce.pixel.comfy.model.node.IType;
import org.apache.commons.lang3.ClassUtils;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public enum DataType {

    STRING,
    INT,
    FLOAT,
    LONG,
    BOOLEAN,
    TYPE_ENUM,
    INT_TYPE_ENUM;

    public static DataType parse(Class<?> classType) {

        if (ClassUtils.isAssignable(classType, IType.class)) {
            return DataType.TYPE_ENUM;
        } else if (ClassUtils.isAssignable(classType, IIntType.class)) {
            return DataType.INT_TYPE_ENUM;
        } else if (String.class.equals(classType)) {
            return DataType.STRING;
        } else if (int.class.equals(classType)) {
            return DataType.INT;
        } else if (long.class.equals(classType)) {
            return DataType.LONG;
        } else if (float.class.equals(classType)) {
            return DataType.FLOAT;
        } else if (Boolean.class.equals(classType) || boolean.class.equals(classType)) {
            return DataType.BOOLEAN;
        }
        throw new RuntimeException("DataType not found!");
    }
}
