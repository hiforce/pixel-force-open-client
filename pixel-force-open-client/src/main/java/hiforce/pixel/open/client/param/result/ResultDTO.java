package hiforce.pixel.open.client.param.result;

import hiforce.pixel.comfy.model.mapping.InputAutoSetValue;
import hiforce.pixel.comfy.model.mapping.InputField;
import hiforce.pixel.comfy.model.mapping.InputMapping;
import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;

/**
 * @author Rocky Yu
 * @since 2023/10/24
 */
public class ResultDTO extends BaseParamDTO {

    private static final long serialVersionUID = 8768540224840498495L;

    @Getter
    @Setter
    @InputAutoSetValue
    private long seed = randomSeed();

    /**
     * 生成文件的前缀
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private String prefix;

    /**
     * 处理批次
     */
    @Getter
    @Setter
    private int batchCount = 1;

    /**
     * 下一个批次的seed是否变化
     */
    @Getter
    @Setter
    private BatchSeedType seedType;

    /**
     * 依次生成照片的数量
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private int batchSize = 4;

    /**
     * 重绘强度
     */
    @Getter
    @InputAutoSetValue
    private float redrawStrength = 0.85f;

    /**
     * 高清放大阶段的重绘强度
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private float hdRedrawStrength = 0.1f;

    /**
     * 是否全图绘制
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private boolean fullDrawing = true;

    /**
     * 清晰度
     */
    @Getter
    @Setter
    @InputAutoSetValue
    private ClarityType clarity = ClarityType.NORMAL;


    /**
     * 渐进式生成设置
     */
    @Getter
    @Setter
    private ProgressiveDTO progressive = new ProgressiveDTO();

    @Getter
    @Setter
    @InputAutoSetValue
    private boolean faceRestore = true;


    public static long randomSeed() {
        Random random = new Random();
        long num = random.nextLong();
        return num > 0 ? num : -num;
    }

    @Override
    public long getEstTime() {
        long est = 10000;//生成文件的鉴黄以及上传到OSS时间
        if (clarity == ClarityType.HD) {
            est += 30000L * batchSize;
        }
        if (progressive.isEnable()) {
            est += ((long) batchCount * batchSize) * 10000;
        } else {
            est += 25000;
        }
        est += 20000;
        return est;
    }

    @Override
    public List<InputField> toInputFields(InputMapping mapping) {
        List<InputField> result = super.toInputFields(mapping);
        result.addAll(progressive.toInputFields(mapping));
        return result;
    }

    public void setRedrawStrength(float redrawStrength) {
        this.redrawStrength = redrawStrength;
        this.getProgressive().setFinalRedrawStrength(redrawStrength);
    }

    @Override
    public String getSignatureStr() {
        return "";
    }
}
