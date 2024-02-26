package hiforce.pixel.open.sample.general;

import com.alibaba.fastjson.JSON;
import hiforce.pixel.comfy.model.node.WorkflowApi;
import hiforce.pixel.open.client.PixelForceClient;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.request.general.GeneralPromptClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.sample.common.BaseRemoteSample;

/**
 * @author Rocky Yu
 * @since 2024/2/22
 */
public class GeneralPromptSample02 extends BaseRemoteSample {

    @Override
    public String getAccessKey() {
        return "YOUR_ACCESS_KEY";
    }

    @Override
    public String getAccessSecret() {
        return "YOUR_ACCESS_SECRET";
    }

    public static void main(String[] args) {
        GeneralPromptSample02 sample = new GeneralPromptSample02();
        sample.run();
    }

    @Override
    public void execute() throws Exception {
        ResourceResult result = getFirstAvailableResource();
        String resourceId = result.getResources().get(0).getId();

        String workflowJSON = getTextFromResource("/general/01-default-workflow.json");
        String workflowApiJSON = getTextFromResource("/general/01-default-workflow-api.json");
        GeneralPromptClientRequest request = new GeneralPromptClientRequest();

        WorkflowApi workflowApi = JSON.parseObject(workflowApiJSON, WorkflowApi.class);
        workflowApi.setNodeFieldValue(6, "text", "1girl, walking in the park, upper body, masterpiece,absurdres,intricate,high detail");

        request.setWorkflow(workflowJSON);
        request.setWorkflowAPI(workflowApi.toJSONString());

        InvokeResult invokeResult = PixelForceClient.getInstance().generalPrompt(request);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Failed to invoke General Prompt Workflow");
        }
        System.out.println("General Prompt invoke result:" + JSON.toJSONString(invokeResult));
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);
    }
}
