package hiforce.pixel.open.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import hiforce.pixel.open.client.common.ApiResult;
import hiforce.pixel.open.client.common.ApiStatusEnum;
import hiforce.pixel.open.client.config.PixelForceClientProperties;
import hiforce.pixel.open.client.request.ClientReqDTO;
import hiforce.pixel.open.client.request.change_bg.ChangeBgClientRequest;
import hiforce.pixel.open.client.request.reserve_cloth.ReserveClothClientRequest;
import hiforce.pixel.open.client.request.resource.ResourceClientRequest;
import hiforce.pixel.open.client.request.result.TaskResultClientRequest;
import hiforce.pixel.open.client.request.submit.PixelSubmitData;
import hiforce.pixel.open.client.request.submit.UploadImageClientRequest;
import hiforce.pixel.open.client.request.text2Img.Text2ImgClientRequest;
import hiforce.pixel.open.client.response.InvokeResult;
import hiforce.pixel.open.client.response.ResourceResult;
import hiforce.pixel.open.client.response.TaskResult;
import hiforce.pixel.open.client.response.UploadResult;
import hiforce.pixel.open.client.utils.CompressUtils;
import hiforce.pixel.open.client.utils.http.HttpUtils;
import hiforce.pixel.open.client.utils.security.EncryptUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.List;
import java.util.Map;


/**
 * @author Rocky Yu
 * @since 2023/11/18
 */
public class PixelForceClient {

    private static PixelForceClient instance;

    private final HttpUtils httpUtils = new HttpUtils();

    private PixelForceClient() {
    }

    public static PixelForceClient getInstance() {
        if (null == instance) {
            instance = new PixelForceClient();
        }
        return instance;
    }

    public ResourceResult getResourceList(ResourceClientRequest req){
        ResourceResult ret = ResourceResult.builder().resources(Lists.newArrayList())
                .status(ApiStatusEnum.FAIL.getCode()).desc(StringUtils.EMPTY).build();
        try{
            String requestURL = PixelForceClientProperties.getInstance().getEndpoint() + "/pixel/api/getResourceList";
            PixelSubmitData submitData = buildSubmitData(req);
            String result = httpUtils.doJsonDataPost(requestURL, JSON.toJSONString(submitData));
            ApiResult<ResourceResult> apiResult = JSON.parseObject(result,new TypeReference<ApiResult<ResourceResult>>(){});
            if(apiResult.getSuccess()){
                ret = apiResult.getResult();
            }else{
                ret.setDesc(apiResult.getMessage());
            }
        }catch (Exception ex){
            ret.setDesc(ex.getMessage());
        }
        return ret;
    }

    public TaskResult getTaskResult(TaskResultClientRequest req){
        TaskResult ret = TaskResult.builder().taskId(StringUtils.EMPTY).status(ApiStatusEnum.FAIL.getCode())
                .desc(StringUtils.EMPTY).fileUrls(Lists.newArrayList()).build();
        try{
            String requestURL = PixelForceClientProperties.getInstance().getEndpoint() + "/pixel/api/getAsyncTaskResult";
            PixelSubmitData submitData = buildSubmitData(req);
            String result = httpUtils.doJsonDataPost(requestURL, JSON.toJSONString(submitData));
            ApiResult<TaskResult> apiResult = JSON.parseObject(result,new TypeReference<ApiResult<TaskResult>>(){});
            if(apiResult.getSuccess()){
                ret = apiResult.getResult();
            }else {
                ret.setDesc(apiResult.getMessage());
            }
        }catch (Exception ex){
            ret.setDesc(ex.getMessage());
        }
        return ret;
    }

    /**
     * 标签生图
     *
     * @param req Text2ImgReq
     * @return InvokeResult
     */
    public InvokeResult textGenerateImg(Text2ImgClientRequest req){
        return PixelForceClient.getInstance().text2ImgInvoke(req);
    }

    /**
     * 背景重绘
     *
     * @param req ChangeBgReq
     * @return InvokeResult
     */
    public InvokeResult changeBackground(ChangeBgClientRequest req){
        if (StringUtils.isBlank(req.getInputImagePath())) {
            return InvokeResult.builder().status(ApiStatusEnum.FAIL.getCode()).desc("InputImagePath is Empty").build();
        }
        return PixelForceClient.getInstance().img2ImgInvoke(req);
    }

    /**
     * 留衣重绘
     *
     * @param req ReserveClothReq
     * @return InvokeResult
     */
    public InvokeResult reserveCloth(ReserveClothClientRequest req){
        if (StringUtils.isBlank(req.getInputImagePath())) {
            return InvokeResult.builder().status(ApiStatusEnum.FAIL.getCode()).desc("InputImagePath is Empty").build();
        }
        return PixelForceClient.getInstance().img2ImgInvoke(req);
    }

    public UploadResult uploadImage(UploadImageClientRequest reqDTO){
        UploadResult uploadResult = UploadResult.builder().status(ApiStatusEnum.FAIL.getCode()).build();
        try{
            String requestURL = PixelForceClientProperties.getInstance().getEndpoint() + "/pixel/api/uploadImage";
            PixelSubmitData submitData = buildSubmitData(reqDTO);
            Map<String, String> submitParams = Maps.newHashMap();
            submitParams.put("data", JSON.toJSONString(submitData));
            List<FileBody> files = Lists.newArrayList();
            File file = new File(reqDTO.getImagePath());
            files.add(new FileBody(file));
            String result = httpUtils.doPostDataWithFiles(requestURL,submitParams,files);
            ApiResult<UploadResult> apiResult = JSON.parseObject(result,new TypeReference<ApiResult<UploadResult>>(){});
            if(apiResult.getSuccess()){
                uploadResult = apiResult.getResult();
            }else {
                uploadResult.setDesc(apiResult.getMessage());
            }
        }catch (Exception ex){
            uploadResult.setDesc(ex.getMessage());
        }
        return uploadResult;
    }

    private PixelSubmitData buildSubmitData(ClientReqDTO reqDTO) throws Exception {
        PixelSubmitData submitData = new PixelSubmitData();
        submitData.setAccessKey(PixelForceClientProperties.getInstance().getAccessKey());
        JSONObject data = new JSONObject();
        data.put("className", reqDTO.getClass().getName());
        data.put("data", JSON.toJSONString(reqDTO));
        String dataStr = data.toJSONString();
        dataStr = CompressUtils.compress(dataStr);
        assert null != dataStr;
        String encryptData = EncryptUtils.encode(PixelForceClientProperties.getInstance().getAccessSecret(), dataStr);
        submitData.setData(encryptData);
        return submitData;
    }
    private InvokeResult text2ImgInvoke(ClientReqDTO reqDTO){
        InvokeResult invokeResult = InvokeResult.builder().status(ApiStatusEnum.FAIL.getCode()).build();
        try{
            String requestURL = PixelForceClientProperties.getInstance().getEndpoint() + "/pixel/api/text2ImgInvoke";
            PixelSubmitData submitData = buildSubmitData(reqDTO);
            String result = httpUtils.doJsonDataPost(requestURL,JSON.toJSONString(submitData));
            ApiResult<InvokeResult> apiResult = JSON.parseObject(result,new TypeReference<ApiResult<InvokeResult>>(){});
            if(apiResult.getSuccess()){
                invokeResult =  apiResult.getResult();
            }else{
                invokeResult.setDesc(apiResult.getMessage());
            }
        }catch (Exception ex){
            invokeResult.setDesc(ex.getMessage());
        }
        return invokeResult;
    }

    private InvokeResult img2ImgInvoke(ClientReqDTO reqDTO){
        InvokeResult invokeResult = InvokeResult.builder().status(ApiStatusEnum.FAIL.getCode()).build();
        try{
            String requestURL = PixelForceClientProperties.getInstance().getEndpoint() + "/pixel/api/img2ImgInvoke";
            PixelSubmitData submitData = buildSubmitData(reqDTO);
            String result = httpUtils.doJsonDataPost(requestURL, JSON.toJSONString(submitData));
            ApiResult<InvokeResult> apiResult = JSON.parseObject(result,new TypeReference<ApiResult<InvokeResult>>(){});
            if(apiResult.getSuccess()){
                invokeResult = apiResult.getResult();
            }else{
                invokeResult.setDesc(apiResult.getMessage());
            }
        }catch (Exception ex){
            invokeResult.setDesc(ex.getMessage());
        }
        return invokeResult;
    }
}
