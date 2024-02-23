package hiforce.pixel.comfy.model.node;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ResourceUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rocky Yu
 * @since 2024/2/23
 */
@SuppressWarnings("all")
public class WorkflowApi extends JSONObject{

    private static final long serialVersionUID = 8071346200125506696L;

    public WorkflowApi setNodeFieldValue(String nodeId, String fieldName, Object value){
        ComfyNode node = getNodeById(nodeId);
        if( null != node){
            node.setValue(fieldName, value);
        }
        return this;
    }

    public WorkflowApi setNodeFieldValue(int nodeId, String fieldName, Object value){
        ComfyNode node = getNodeById(String.valueOf(nodeId));
        if( null != node){
            node.setValue(fieldName, value);
        }
        return this;
    }

    public ComfyNode getNodeById(String nodeId){
        return this.entrySet().stream()
                .filter(p -> isNodeIdMatched(p.getKey(), nodeId))
                .map(p-> p.getValue())
                .map(o -> (JSONObject) o)
                .map(ComfyNode::of)
                .findFirst().orElse(null);
    }

    public List<ComfyNode> getNodeListByClassName(String clsName){
        return this.values().stream()
                .filter(o -> isClassMatched((JSONObject) o, clsName))
                .map(o -> (JSONObject) o)
                .map(ComfyNode::of)
                .collect(Collectors.toList());
    }

    public ComfyNode getFirstNodeByClassName(String clsName){
        return this.values().stream()
                .filter(o -> isClassMatched((JSONObject) o, clsName))
                .map(o -> (JSONObject) o)
                .map(ComfyNode::of)
                .findFirst().orElse(null);
    }

    private boolean isNodeIdMatched(String key, String nodeId){
        return StringUtils.equals(nodeId, key);
    }
    private boolean isClassMatched(JSONObject node, String className){
        return StringUtils.equals(className, node.getString("class_type"));
    }

    public static void main(String [] args) throws Exception {

        String json = FileUtils.readFileToString(ResourceUtils.getFile(
                        WorkflowApi.class.getResource("/test-workflow-api.json")));
        WorkflowApi workflowApi = JSON.parseObject(json, WorkflowApi.class);
        ComfyNode node = workflowApi.getNodeById("6");
        node.setValue("text", "1girl");
        workflowApi.setNodeFieldValue(6, "text", "1boy");
        System.out.println("ddd");
    }
}
