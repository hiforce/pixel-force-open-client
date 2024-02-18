package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum WaterType implements IPromptType {
    OCEAN("ocean", "大海", "ocean"),
    DRIPPING("dripping", "滴水", "dripping"),
    BEACH("beach", "海滩", "beach"),
    LAKE("lake", "湖泊", "lake"),
    WATERFALL("waterfall", "瀑布", "waterfall"),
    RIPPLES("ripples", "涟漪", "ripples"),
    SWIRL("swirl", "漩涡", "swirl"),
    WAVES("waves", "波浪", "waves"),
    SEASHELL("seashell", "海贝", "seashell"),
    SEAWEED("seaweed", "海藻", "seaweed");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    WaterType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
