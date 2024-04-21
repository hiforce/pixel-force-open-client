package hiforce.pixel.open.client.param.style;

import hiforce.pixel.open.client.param.BaseParamDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky Yu
 * @since 2024/4/21
 */
@Getter
@Setter
public class ReferStyleDTO extends BaseParamDTO {

    /**
     * 是否启用参考背景风格
     */
    private boolean enableReferStyle;

    /**
     * 参考背景风格图片
     */
    private String referStyleImagePath;

    /**
     * 参考风格强度
     */
    private ReferStyleStrength styleStrength = ReferStyleStrength.NORMAL;

    @Override
    public long getEstTime() {
        return 0;
    }

    @Override
    public String getSignatureStr() {
        return "";
    }
}
