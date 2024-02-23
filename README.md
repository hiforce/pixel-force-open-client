PixelForce是原力在线（[https://pixel.hiforce.net](https://pixel.hiforce.net)）提供的在线AI绘图软件。基于PixelForce可以帮助您，对指定的商品实现真人模特穿搭、背景重绘、模特换脸、去除背景等。

PixelForce除了提供在线图形化操作界面外，还提供了Open API方式，以方便被集成到您的应用中。目前，PixelForce 提供的OpenAPI包含以下功能：
* 背景重绘：保留人物、物体主体不变，将背景进行替换重新绘制
* 留衣重绘：保留人物衣服不变，将人物以及背景进行替换重新绘制
* 文生图：根据文字描述的关键词，生成图像
* 高质量去除背景(TBD)：
* 高质量白底图(TBD)：

**基于PixelForce OpenAPI进行绘图的步骤：**
1. 首先需要登录原力道场（[https://www.hiforce.net](https://www.hiforce.net)） 注册账号，并开通GPU容器，镜像需要选择 ComfyUI 类型
2. 在原力道场的账号管理中，生成用于API访问的Access Key以及 Access Secret凭证
3. 创建Java工程，并在pom.xml中，引入PixelForce客户端包
```xml
<dependency>
  <groupId>com.hiforce.pixel.open</groupId>
  <artifactId>pixel-force-open-client</artifactId>
  <version>1.0.3</version>
</dependency>
```

4. 参考我们提供的样例，进行API调用
   参考代码地址：[https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample](https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample)

下面的视频是一个简单的背景重绘的API调用过程（点击后播放）：

<a href="https://youtu.be/5bj3YOE-9vE?si=s0Tf00iBqSAy7PsH" target="blank" title="用API进行背景重绘">
  <img width="512" src="https://github.com/hiforce/pixel-force-open-client/assets/11450506/8df89473-93b0-47f4-95c4-56f7ac75eaf7"/>
</a>


**基于自建ComfyUI容器的集成**

如果是自己构建的ComfyUI容器，您可以访问：[https://github.com/comfyanonymous/ComfyUI](https://github.com/comfyanonymous/ComfyUI)，按照ComfyUI官网指导进行ComfyUI容器构建。或者，您也可以登录 [https://www.hiforce.net](https://www.hiforce.net)，在原力道场上购买ComfyUI容器。对于自行构建的ComfyUI容器，您还需要参考[增强ComfyUI容器补丁](https://github.com/hiforce/pixel-force-open-client/wiki/%E5%A2%9E%E5%BC%BAComfyUI%E5%AE%B9%E5%99%A8%E8%A1%A5%E4%B8%81)

您可以参考：[GeneralPromptSample03.java](https://github.com/hiforce/pixel-force-open-client/blob/main/pixel-force-open-sample/src/main/java/hiforce/pixel/open/sample/general/GeneralPromptSample03.java)

```java
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
                "1girl, beauty, long hair, close shot," +
                        "happy, walking in the park, upper body, masterpiece,absurdres,intricate,high detail");

        SimpleComfyInvoker invoker = new SimpleComfyInvoker("http://localhost:8100");
        QueueResult queueResult = invoker.startQueuePrompt(workflowApi, workflowJSON);

        System.out.println("General Prompt invoke result:" + JSON.toJSONString(queueResult));

        waitAndQueryTaskExecuteResult(queueResult.getPromptId(), invoker);
    }
}
```
在本样例中，我们提供了WorkflowApi对象，您可以通过该对象，对流程参数进行修改。通过SimpleComfyInvoker对指定的流程文件，以及流程参数在指定的ComfyUI实例上执行流程。在waitAndQueryTaskExecuteResult方法中，我们提供了定时查询任务进展以及处理结果的样例。运行程序效果如下：

![image](https://github.com/hiforce/pixel-force-open-client/assets/11450506/a9507006-f820-4e3a-b86d-36e7e8266348)
