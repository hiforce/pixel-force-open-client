package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum GlassesType implements IPromptType {
    GLASSES("glasses", "眼镜"),
    EYEWEAR("eyewear", "眼睛"),
    MONOCLE("monocle", "单片眼镜"),
    UNDER_RIM_EYEWEAR("under-rim_eyewear", "带框眼镜"),
    RIMLESS_EYEWEAR("rimless_eyewear", "无框眼镜"),
    SEMI_RIMLESS_EYEWEAR("semi-rimless_eyewear", "半无框眼镜"),
    RED_FRAMED_EYEWEAR("red-framed_eyewear", "红框眼镜"),
    ROUND_EYEWEAR("round_eyewear", "圆框眼镜"),
    BLACK_FRAMED_EYEWEAR("black-framed_eyewear", "黑框眼镜"),
    TINTED_EYEWEAR("tinted_eyewear", "有色眼镜"),
    MEDICAL_EYEPATCH("medical_eyepatch", "医用眼罩"),
    BANDAGE_OVER_ONE_EYE("bandage_over_one_eye", "用绷带包扎一只眼睛"),
    CROOKED_EYEWEAR("crooked_eyewear", "歪斜的眼镜"),
    EYEWEAR_REMOVED("eyewear_removed", "取下眼镜"),
    SUNGLASSES("sunglasses", "太阳镜"),
    GOGGLES("goggles", "风镜"),
    BLINDFOLD("Blindfold", "眼罩"),
    EYEPATCH("eyepatch", "眼罩(独眼)"),
    VISOR("visor", "面罩|遮阳帽舌|遮阳板"),
    BESPECTACLED("bespectacled", "戴眼镜的"),
    BLUE_FRAMED_EYEWEAR("blue-framed_eyewear", "蓝框眼镜"),
    BROWN_FRAMED_EYEWEAR("brown-framed_eyewear", "棕色镜框眼镜"),
    COKE_BOTTLE_GLASSES("coke-bottle_glasses", "厚如玻璃瓶底的圆眼镜"),
    NO_EYEWEAR("no_eyewear", "去掉了(原设有的)眼镜"),
    OPAQUE_GLASSES("opaque_glasses", "没透出眼睛的眼镜"),
    OVER_RIM_EYEWEAR("over-rim_eyewear", "下半无框眼镜");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    GlassesType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
