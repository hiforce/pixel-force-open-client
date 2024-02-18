package hiforce.pixel.open.client.param;

import com.google.common.collect.Lists;
import hiforce.pixel.comfy.model.mapping.DataType;
import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.comfy.model.mapping.InputField;
import hiforce.pixel.comfy.model.mapping.InputMapping;
import hiforce.pixel.open.client.utils.MD5;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
@Slf4j
public abstract class BaseParamDTO implements Serializable {

    private static final long serialVersionUID = 6093775105997409256L;

    public abstract long getEstTime();

    public long getColdStartEstTime() {
        return getEstTime() * 3;//冷启动，什么模型都没加载过，时间会是三倍左右，系统启动后建议做一次预热
    }

    public abstract String getSignatureStr();

    /**
     * @return 获取本次请求的特征签名
     */
    public final String getSignature() {
        if (StringUtils.isNotEmpty(getSignatureStr())) {
            return MD5.getInstance().getMD5String(getSignatureStr());
        }
        return "";
    }

    public List<InputField> toInputFields(InputMapping mapping) {
        List<InputField> values = Lists.newArrayList();
        Field[] fields = FieldUtils.getAllFields(this.getClass());

        for (Field field : fields) {
            InputAutoSetValue inputData = field.getAnnotation(InputAutoSetValue.class);
            if (null == inputData) {
                continue;
            }
            String name = field.getDeclaringClass().getSimpleName() + "." + field.getName();
            InputField mappingField = mapping.getInputs().keySet().stream()
                    .filter(p -> StringUtils.equals(p.getInputName(), name))
                    .findFirst().orElse(null);
            try {
                PropertyDescriptor propertyDescriptor =
                        BeanUtils.getPropertyDescriptor(this.getClass(), field.getName());
                if (null != propertyDescriptor) {
                    Object value = propertyDescriptor.getReadMethod().invoke(this);
                    values.add(InputField.of(name, DataType.parse(field.getType()),false,false,"",
                            Optional.ofNullable(mappingField).map(InputField::getFieldType)
                                    .orElse(null), value));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return values;
    }
}
