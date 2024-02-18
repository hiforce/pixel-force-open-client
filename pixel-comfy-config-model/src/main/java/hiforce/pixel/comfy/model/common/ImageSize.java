package hiforce.pixel.comfy.model.common;

import hiforce.pixel.comfy.model.node.IType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/7
 */
public enum ImageSize implements IType {

    SIZE_512_1("512x512 (1:1)", 512, 512),
    SIZE_512_2("512x680 (3:4)", 512, 680),
    SIZE_512_3("512x768 (2:3)", 512, 768),
    SIZE_512_4("512x912 (9:16)", 512, 912),
    SIZE_512_5("680x512 (4:3)", 680, 512),
    SIZE_512_6("768x512 (3:2)", 768, 512),
    SIZE_512_7("912x512 (19:9)", 912, 512),
    SIZE_768_1("768x768 (1:1)", 768, 768),
    SIZE_768_2("768x1152 (2:3)", 768, 1152),
    SIZE_768_3("768x1024 (3:4)", 768, 1024),
    SIZE_768_4("1152x768 (3:2)", 1152, 768),
    SIZE_768_5("1024x768 (4:3)", 1024, 768),

    SIZE_1024_1("1024x1024 (1:1)", 1024, 1024);

    @Getter
    private final String value;

    @Getter
    private final int width;

    @Getter
    private final int height;

    ImageSize(String value, int width, int height) {
        this.value = value;
        this.width = width;
        this.height = height;
    }
}
