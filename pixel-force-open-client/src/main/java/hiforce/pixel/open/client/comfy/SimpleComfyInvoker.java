package hiforce.pixel.open.client.comfy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import hiforce.pixel.comfy.model.node.WorkflowApi;
import hiforce.pixel.open.client.utils.http.HttpUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.hiforce.lattice.exception.LatticeRuntimeException;
import org.hiforce.lattice.message.Message;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Rocky Yu
 * @since 2023/10/18
 */
@Slf4j
@SuppressWarnings("unused")
public class SimpleComfyInvoker {

    private static final String QUEUE_PROMPT = "/prompt";

    private static final String UPLOAD_IMAGE = "/upload/image";

    private static final String QUEUE_QUERY = "/queue_summary";

    private static final String QUEUE_OUTPUT = "/output";

    private final HttpUtils httpUtils = new HttpUtils();

    @Getter
    @Setter
    private String host;

    public SimpleComfyInvoker(String hostUrl) {
        this.host = hostUrl;
    }

    private TaskDetailResult buildTaskDetailResult(String promptId, JSONObject object) {
        if (null == object) {
            return null;
        }
        return new TaskDetailResult(promptId, object);
    }

    public List<TaskDetailResult> doQueryTaskDetails(List<String> promptIds) {
        String serverUrl = host + QUEUE_OUTPUT + "/" + String.join(",", promptIds);
        String httpResp = "";
        try {
            httpResp = httpUtils.doGet(serverUrl);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            throw new LatticeRuntimeException("PF_CLIENT_ERR_002",host, ex.getMessage(),String.join(",",promptIds));
        }
        try{
            JSONObject object = JSON.parseObject(httpResp);
            return object.keySet().stream()
                    .map(p -> buildTaskDetailResult(p, object.getJSONObject(p)))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }catch (Exception e){
            String message = httpResp;
            if (message.length()> 1000){
                message = message.substring(0,1000);
            }
            throw new LatticeRuntimeException("PF_CLIENT_ERR_004",message);
        }
    }

    public QueueQueryResult doQueryComfyQueue() {
        String serverUrl = host + QUEUE_QUERY;
        try {
            String httpResp = httpUtils.doGet(serverUrl);
            return JSON.parseObject(httpResp, QueueQueryResult.class);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            throw new LatticeRuntimeException(Message.code("PF_CLIENT_ERR_003", serverUrl, ex.getMessage(),""));
        }
    }

    public TaskQueueResult doQueryTaskQueueInfo(List<String> promptIds) {
        TaskQueueResult queueResult = new TaskQueueResult();
        try {
            QueueQueryResult result = doQueryComfyQueue();
            queueResult.setSuccess(true);
            if (isAnyTaskRunning(result, promptIds)) {
                queueResult.setRunning(true);
                return queueResult;
            } else if (isAllTaskPending(result, promptIds)) {
                queueResult.setPending(true);
                queueResult.setWaitNum(result.getRunning().size());
                return queueResult;
            }
            queueResult.setNotInQueue(true);//不在队列中
            return queueResult;
        } catch (Exception ex) {
            ex.printStackTrace();
            queueResult.setSuccess(false);
            return queueResult;
        }
    }

    private boolean isAllTaskPending(QueueQueryResult result, List<String> promptIds) {
        return CollectionUtils.containsAll(result.getRunning(), promptIds);
    }

    private boolean isAnyTaskRunning(QueueQueryResult result, List<String> promptIds) {
        return CollectionUtils.containsAny(result.getRunning(), promptIds);
    }

    public UploadImageResult uploadImageInput(String resourcePath) {
        URL url = SimpleComfyInvoker.class.getResource(resourcePath);
        if (null == url) {
            return null;
        }
        File file = new File(url.getPath());
        return uploadImageInput(file, "hiforce");
    }

    public UploadImageResult uploadImageInput(File imageFile) {
        return uploadImageInput(imageFile, "hiforce");
    }

    public UploadImageResult uploadImageInput(File imageFile, String fold) {
        String requestUrl = host + UPLOAD_IMAGE;
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String dateStr = df.format(new Date());
        int num = new Random().nextInt();
        String filename;
        if (StringUtils.isEmpty(fold)){
            filename = String.format("%s_%s", num > 0 ? num : -num, imageFile.getName());
        }
        else {
            filename = String.format("%s_%s_%s", fold, num > 0 ? num : -num, imageFile.getName());
        }

        try {
            JSONObject body = new JSONObject();
            body.put("subfolder", dateStr);
            String resultJson = httpUtils.doUploadFile(requestUrl, body, "image",
                    filename, Files.newInputStream(imageFile.toPath()));
            return JSON.parseObject(resultJson, UploadImageResult.class);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            throw new LatticeRuntimeException(Message.code("PF_CLIENT_ERR_003", requestUrl, ex.getMessage(), imageFile.getName()));
        }
    }


    public PromptResult startQueuePrompt(WorkflowApi prompt, String workflow) {
        String jsonData = buildRequestData(prompt, workflow).toJSONString();
        String serverUrl = host + QUEUE_PROMPT;
        try {
            String respText = httpUtils.doJsonDataPost(serverUrl, jsonData);
            log.warn(">>Comfy Resp:" + respText);
            return JSON.parseObject(respText, PromptResult.class);
        } catch (IOException e){
            throw new LatticeRuntimeException("PF_CLIENT_ERR_002",serverUrl,e.getMessage());
        }catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            throw new LatticeRuntimeException(Message.code("PF_CLIENT_ERR_003", serverUrl, ex.getMessage(), jsonData));
        }
    }

    private JSONObject buildRequestData(WorkflowApi workflowApi, String workflowJSON) {
        JSONObject data = new JSONObject();
        JSONObject prompt = new JSONObject();
        prompt.put("prompt", workflowApi);
        data.putAll(prompt);

        JSONObject extraData = new JSONObject();
        data.put("extra_data", extraData);
        if (null != workflowJSON ) {
            JSONObject extra = new JSONObject();
            extraData.put("extra_pnginfo", extra);
            extra.put("workflow", workflowJSON);
        }
        return data;
    }
}
