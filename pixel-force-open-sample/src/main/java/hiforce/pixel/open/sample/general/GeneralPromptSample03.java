package hiforce.pixel.open.sample.general;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.comfy.model.node.WorkflowApi;
import hiforce.pixel.open.client.comfy.PromptResult;
import hiforce.pixel.open.client.comfy.SimpleComfyInvoker;
import hiforce.pixel.open.sample.common.BaseLocalSample;

/**
 * @author Rocky Yu
 * @since 2024/2/22
 */
public class GeneralPromptSample03 extends BaseLocalSample {

    public static void main(String[] args) {
        GeneralPromptSample03 sample = new GeneralPromptSample03();
        sample.run();
    }

    @Override
    public void execute() throws Exception {
        String workflowJSON = getTextFromResource("/general/01-default-workflow.json");
        String workflowApiJSON = getTextFromResource("/general/01-default-workflow-api.json");

        WorkflowApi workflowApi = JSON.parseObject(workflowApiJSON, WorkflowApi.class);
        workflowApi.setNodeFieldValue(6, "text",
                "1girl, beauty, long hair, upper body, close shot," +
                        "happy, walking in the park, masterpiece,absurdres,intricate,high detail");

        SimpleComfyInvoker invoker = new SimpleComfyInvoker("http://localhost:8100");
        PromptResult promptResult = invoker.startQueuePrompt(workflowApi, workflowJSON);

        System.out.println("General Prompt invoke result:" + JSON.toJSONString(promptResult));

        waitAndQueryTaskExecuteResult(promptResult.getPromptId(), invoker);
    }
}
