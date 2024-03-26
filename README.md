
[PixelForce](https://pixel.hiforce.ai) is an online AI drawing software provided by HiFORCE (https://pixel.hiforce.net). Based on PixelForce, it can assist you in achieving various tasks such as dressing virtual models with specified products, background redesigning, model face swapping, background removal, and more.

In addition to providing an online graphical interface, PixelForce also offers an Open API for easy integration into your applications. Currently, PixelForce's Open API includes the following functionalities:

* Background Redesign: Retain the main subject (people, objects) while replacing and redesigning the background.
* Clothes Redesign: Keep the clothes of the subject unchanged while replacing and redesigning the subject and background.
* Text-to-Image: Generate images based on keywords from textual descriptions.
* Text Swap Face:Based on the prompts, change the faces of the specified individuals in the image. [View Example](https://github.com/hiforce/pixel-force-open-client/wiki/Text-Swap-Face-Sample)
* High-quality Background Removal (TBD): [To DO]
* High-quality White Background Image (TBD): [To DO]


**Based on PixelForce OpenAPI Drawing Steps:**

1. First, log in to the HiForce Dojo (https://www.hiforce.net), register an account, and activate a GPU container. Choose the ComfyUI type for the container.
2. In the account management section of HiForce Dojo, generate Access Key and Access Secret credentials for API access.
3. Create a Java project and import the PixelForce client package into the project's pom.xml file.

```xml
<dependency>
  <groupId>com.hiforce.pixel.open</groupId>
  <artifactId>pixel-force-open-client</artifactId>
  <version>1.0.4</version>
</dependency>
```

4. Refer to the sample we provided and make API calls accordingly.

Reference sample code url:[https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample](https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample)

The following video demonstrates a simple process of making API calls for background redesign (click to play):

<a href="https://www.youtube.com/watch?v=KShk9mOya_U" target="blank" title="用API进行背景重绘">
  <img width="512" src="https://github.com/hiforce/pixel-force-open-client/assets/11450506/8df89473-93b0-47f4-95c4-56f7ac75eaf7"/>
</a>

**Integration with self-built ComfyUI container**

If you have built your own ComfyUI container, you can access: [https://github.com/comfyanonymous/ComfyUI](https://github.com/comfyanonymous/ComfyUI) and follow the instructions on the ComfyUI official website to build the ComfyUI container. Alternatively, you can also log in to [https://www.hiforce.net](https://www.hiforce.net) to purchase a ComfyUI container from the HiForce. For self-built ComfyUI containers, you will also need to refer to the Enhanced ComfyUI Container Patch for additional instructions: [Patch for ComfyUI](https://github.com/hiforce/pixel-force-open-client/wiki/Patch-for-ComfyUI)

Please refer to: [GeneralPromptSample03.java](https://github.com/hiforce/pixel-force-open-client/blob/main/pixel-force-open-sample/src/main/java/hiforce/pixel/open/sample/general/GeneralPromptSample03.java)

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
        PromptResult promptResult = invoker.startQueuePrompt(workflowApi, workflowJSON);

        System.out.println("General Prompt invoke result:" + JSON.toJSONString(promptResult));

        waitAndQueryTaskExecuteResult(promptResult.getPromptId(), invoker);
    }
}
```

In this example, we provide a WorkflowApi object through which you can modify workflow parameters. Use the SimpleComfyInvoker to execute the workflow file and parameters on the specified ComfyUI instance. In the waitAndQueryTaskExecuteResult method, we offer an example of periodically querying task progress and processing results. The program runs as follows:

![image](https://github.com/hiforce/pixel-force-open-client/assets/11450506/a9507006-f820-4e3a-b86d-36e7e8266348)

---
PixelForce是原力在线（[https://pixel.hiforce.net](https://pixel.hiforce.net)）提供的在线AI绘图软件。基于PixelForce可以帮助您，对指定的商品实现真人模特穿搭、背景重绘、模特换脸、去除背景等。

PixelForce除了提供在线图形化操作界面外，还提供了Open API方式，以方便被集成到您的应用中。目前，PixelForce 提供的OpenAPI包含以下功能：
* 背景重绘：保留人物、物体主体不变，将背景进行替换重新绘制
* 留衣重绘：保留人物衣服不变，将人物以及背景进行替换重新绘制
* 文生图：根据文字描述的关键词，生成图像
* 文本换脸：根据提示词描述对指定的图片中的人物进行换脸。[查看样例](https://github.com/hiforce/pixel-force-open-client/wiki/%E6%96%87%E6%9C%AC%E6%8D%A2%E8%84%B8%E5%9C%BA%E6%99%AF%E6%A0%B7%E4%BE%8B)
* 高质量去除背景：将指定图片的背景去除，变成透明底，或者变成指定颜色，或者变成指定其他图片。[查看样例](https://github.com/hiforce/pixel-force-open-client/wiki/%E9%AB%98%E8%B4%A8%E9%87%8F%E5%8E%BB%E9%99%A4%E8%83%8C%E6%99%AF)
* 高质量白底图(TBD)：

**基于PixelForce OpenAPI进行绘图的步骤：**
1. 首先需要登录原力道场（[https://www.hiforce.net](https://www.hiforce.net)） 注册账号，并开通GPU容器，镜像需要选择 ComfyUI 类型
2. 在原力道场的账号管理中，生成用于API访问的Access Key以及 Access Secret凭证
3. 创建Java工程，并在pom.xml中，引入PixelForce客户端包

```xml
<dependency>
  <groupId>com.hiforce.pixel.open</groupId>
  <artifactId>pixel-force-open-client</artifactId>
  <version>1.0.4</version>
</dependency>
```

4. 参考我们提供的样例，进行API调用
   参考代码地址：[https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample](https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample)

下面的视频是一个简单的背景重绘的API调用过程（点击后播放）：

<a href="https://www.youtube.com/watch?v=KShk9mOya_U" target="blank" title="用API进行背景重绘">
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
        PromptResult promptResult = invoker.startQueuePrompt(workflowApi, workflowJSON);

        System.out.println("General Prompt invoke result:" + JSON.toJSONString(promptResult));

        waitAndQueryTaskExecuteResult(promptResult.getPromptId(), invoker);
    }
}
```
在本样例中，我们提供了WorkflowApi对象，您可以通过该对象，对流程参数进行修改。通过SimpleComfyInvoker对指定的流程文件，以及流程参数在指定的ComfyUI实例上执行流程。在waitAndQueryTaskExecuteResult方法中，我们提供了定时查询任务进展以及处理结果的样例。运行程序效果如下：

![image](https://github.com/hiforce/pixel-force-open-client/assets/11450506/a9507006-f820-4e3a-b86d-36e7e8266348)
