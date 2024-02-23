package hiforce.pixel.comfy.model.node;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2024/2/23
 */
public class ComfyNode implements Serializable {

    private static final long serialVersionUID = 6846383035277298091L;

    @Getter @Setter
    @JSONField(name = "class_type")
    private String className;

    @Getter @Setter
    private JSONObject value;

    public void setValue(String key, Object v){
        value.put(key, v);
    }


    public static ComfyNode of(JSONObject object){
        if( null == object){
            return null;
        }
        ComfyNode node = new ComfyNode();
        node.setClassName(object.getString("class_type"));
        JSONObject values = object.getJSONObject("inputs");
        node.setValue(values);
        return node;
    }


}
