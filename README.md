PixelForce是原力在线（[https://pixel.hiforce.net](https://pixel.hiforce.net)）提供的在线AI绘图软件。基于PixelForce可以帮助您，对指定的商品实现真人模特穿搭、背景重绘、模特换脸、去除背景等。

PixelForce除了提供在线图形化操作界面外，还提供了Open API方式，以方便被集成到您的应用中。目前，PixelForce 提供的OpenAPI包含以下功能：
* 背景重绘：保留人物、物体主体不变，将背景进行替换重新绘制
* 留衣重绘：保留人物衣服不变，将人物以及背景进行替换重新绘制
* 文生图：根据文字描述的关键词，生成图像
* 高质量去除背景(TBD)：
* 高质量白底图(TBD)：

**使用Open API进行绘图的步骤：**
1. 首先需要登录原力道场（[https://www.hiforce.net](https://www.hiforce.net)） 注册账号，并开通GPU容器，镜像需要选择 ComfyUI 类型
2. 在原力道场的账号管理中，生成用于API访问的Access Key以及 Access Secret凭证
3. 创建Java工程，并在pom.xml中，引入PixelForce客户端包
```xml
<dependency>
  <groupId>com.hiforce.pixel.open</groupId>
  <artifactId>pixel-force-open-client</artifactId>
  <version>1.0.1</version>
</dependency>
```
4. 参考我们提供的样例，进行API调用
   参考代码地址：https://github.com/hiforce/pixel-force-open-client/tree/main/pixel-force-open-sample

下面的视频是一个简单的背景重绘的API调用过程（点击后播放）：

<a href="https://youtu.be/5bj3YOE-9vE?si=s0Tf00iBqSAy7PsH" target="blank" title="用API进行背景重绘">
  <img src="https://github.com/hiforce/pixel-force-open-client/assets/11450506/8df89473-93b0-47f4-95c4-56f7ac75eaf7"/>
</a>
