package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum NatureType implements IPromptType {
    NATURE("nature", "大自然", "nature"),
    SEA("sea", "大海", "sea"),
    OCEAN("ocean", "海洋", "ocean"),
    BEACH("beach", "海边", "beach"),
    HILLS("hills", "山丘", "hills"),
    IN_A_MEADOW("in a meadow", "草地", "in a meadow"),
    ON_THE_BEACH("on the beach", "海滩", "on the beach"),
    UNDERWATER("underwater", "水中", "underwater"),
    OVER_THE_SEA("over the sea", "海边", "over the sea"),
    GROVE("grove", "树林", "grove"),
    ON_A_DESERT("on a desert", "沙漠", "on a desert"),
    PLATEAU("plateau", "高原", "plateau"),
    CLIFF("cliff", "悬崖", "cliff"),
    CANYON("canyon", "峡谷", "canyon"),
    OASIS("oasis", "绿洲", "oasis"),
    BAMBOO_FOREST("bamboo forest", "竹林", "bamboo forest"),
    GLACIER("glacier", "冰川", "glacier"),
    FLOATING_ISLAND("floating island", "浮岛", "floating island"),
    VOLCANO("volcano", "火山", "volcano"),
    SAVANNA("savanna", "大草原", "savanna"),
    WATERFALL("waterfall", "瀑布", "waterfall"),
    STREAM("stream", "溪流", "stream"),
    WASTELAND("wasteland", "荒地", "wasteland"),
    FIELD("field", "田园", "field"),
    RICE_PADDY("rice paddy", "稻田", "rice paddy"),
    WHEAT_FIELD("wheat field", "麦田", "wheat field"),
    FLOWER_FIELD("flower field", "花田", "flower field"),
    FLOWER_SEA("flower sea", "花海", "flower sea"),
    SPACE("space", "太空", "space"),
    STARRY_SKY("starry sky", "星空", "starry sky"),
    LAKE("lake", "湖泊", "lake"),
    RIVER("river", "河流", "river"),
    ONSEN("onsen", "温泉", "onsen"),
    FLOWERS_MEADOWS("flowers meadows", "繁花草甸", "flowers meadows"),
    ALPS("Alps", "阿尔卑斯山脉", "Alps"),
    DREAMY_FOREST("Dreamy forest", "梦幻之森(虚幻感.光粒子幽静)", "Dreamy forest"),
    MOUNTAIN("mountain", "山脉", "mountain"),
    ON_A_HILL("on a hill", "山上", "on a hill"),
    THE_TOP_OF_THE_HILL("the top of the hill", "山顶", "the top of the hill"),
    OUTDOORS("outdoors", "室外", "outdoors");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    NatureType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
