package hiforce.pixel.open.sample.common;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import hiforce.pixel.open.client.comfy.ImageOutputType;
import hiforce.pixel.open.client.comfy.SimpleComfyInvoker;
import hiforce.pixel.open.client.comfy.TaskDetailResult;
import hiforce.pixel.open.client.comfy.TaskQueueResult;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

/**
 * @author Rocky Yu
 * @since 2024/2/22
 */
public abstract class BaseLocalSample extends BaseSample {

    public void waitAndQueryTaskExecuteResult(String promptId, SimpleComfyInvoker invoker) throws Exception {

        Timer timer = new Timer();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                TaskQueueResult queueResult = invoker.doQueryTaskQueueInfo(Lists.newArrayList(promptId));
                if (queueResult.isRunning()) {
                    System.out.println("Task task running:" + JSON.toJSONString(queueResult));
                } else {
                    List<TaskDetailResult> result = invoker.doQueryTaskDetails(Lists.newArrayList(promptId));
                    List<String> imageUrls = result.stream().flatMap(p -> p.getOutputs().stream())
                            .flatMap(p -> p.getImages().stream())
                            .filter(p -> p.getType() == ImageOutputType.output)
                            .map(p -> String.format("%s/view?filename=%s&subfolder=%s&type=output", invoker.getHost(),
                                    p.getFilename(), StringUtils.isEmpty(p.getSubfolder()) ? "" : p.getSubfolder()))
                            .collect(Collectors.toList());
                    System.out.println("Task finished:" + JSON.toJSONString(imageUrls));
                    countDownLatch.countDown();
                    timer.cancel();
                }
            }
        }, 1000L, 1000L);
        countDownLatch.await();
    }

    public final void run() {
        try {
            execute();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
