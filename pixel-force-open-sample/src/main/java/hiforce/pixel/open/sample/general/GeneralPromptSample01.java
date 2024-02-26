package hiforce.pixel.open.sample.general;

import com.alibaba.fastjson.JSON;
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
public class GeneralPromptSample01 extends BaseRemoteSample {

    @Override
    public String getAccessKey() {
        return "YOUR_ACCESS_KEY";
    }

    @Override
    public String getAccessSecret() {
        return "YOUR_ACCESS_SECRET";
    }
    public static void main(String[] args) {
        GeneralPromptSample01 sample = new GeneralPromptSample01();
        sample.run();
    }

    @Override
    public void execute() throws Exception {
        ResourceResult result = getFirstAvailableResource();
        String resourceId = result.getResources().get(0).getId();

        String workflow = getTextFromResource("/general/01-default-workflow.json");
        String workflowApi = getTextFromResource("/general/01-default-workflow-api.json");
        GeneralPromptClientRequest request = new GeneralPromptClientRequest();
        request.setWorkflow(workflow);
        request.setWorkflowAPI(workflowApi);

        InvokeResult invokeResult = PixelForceClient.getInstance().generalPrompt(request);
        if (!invokeResult.getStatus().equals(ApiStatusEnum.SUCCESS.getCode())) {
            throw new RuntimeException("Failed to invoke General Prompt Workflow");
        }
        System.out.println("General Prompt invoke result:" + JSON.toJSONString(invokeResult));
        waitAndQueryTaskExecuteResult(invokeResult, resourceId);
    }
}
