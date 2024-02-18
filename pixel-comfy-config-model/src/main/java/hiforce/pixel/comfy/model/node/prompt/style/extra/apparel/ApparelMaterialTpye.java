package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ApparelMaterialTpye implements IPromptType {
    ARMORED("armored", "装甲的"),
    CANVAS("canvas", "帆布的"),
    DENIM("denim", "牛仔布"),
    FLUFFY("fluffy", "毛茸茸"),
    FUR("fur", "毛皮"),
    LATEX("latex", "乳胶"),
    LEATHER("leather", "皮制"),
    SEE_THROUGH("see-through", "透明"),
    SPANDEX("spandex", "弹性纤维"),
    TIGHT("tight", "紧身");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ApparelMaterialTpye(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
