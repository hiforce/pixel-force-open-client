package hiforce.pixel.open.client.comfy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import hiforce.pixel.open.client.utils.CompressUtils;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public class TaskDetailResult implements Serializable {

    private static final long serialVersionUID = 2016174569298226752L;

    @Getter
    @Setter
    private String taskId;

    @Getter
    @Setter
    private List<TaskResultItem> outputs = Lists.newArrayList();

    @Getter
    @Setter
    private JSONObject outputsObject;

    @Getter
    @Setter
    private String compressedPrompt;

    private TaskResultItem buildTaskResultItem(String nodeId, JSONObject imageItems) {
        TaskResultItem item = new TaskResultItem();
        item.setNodeId(nodeId);

        List<ImageItem> imageItemList = Optional.ofNullable(imageItems)
                .map(p -> p.getJSONArray("images"))
                .map(JSONAware::toJSONString)
                .map(p -> JSON.parseArray(p, ImageItem.class)).orElse(Lists.newArrayList());
        item.getImages().addAll(imageItemList);
        return item;
    }

    public TaskDetailResult(String taskId, JSONObject object) {
        this.taskId = taskId;
        outputsObject = object.getJSONObject("outputs");
        JSONObject prompt = object.getJSONObject("prompt");
        if (null != prompt) {
            compressedPrompt = CompressUtils.compress(prompt.toJSONString());
        }

        this.outputs.addAll(outputsObject.entrySet().stream().map(p -> buildTaskResultItem(p.getKey(), (JSONObject) p.getValue()))
                .collect(Collectors.toList()));
    }
}
