package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum PlantType implements IPromptType {
    PLANT("plant", "植物", "plant"),
    FLOWER("flower", "花", "flower"),
    VASE("vase", "花瓶", "vase"),
    BOUQUET("bouquet", "花束", "bouquet"),
    FLOWER_BLOOM("flower_bloom", "花盛开", "flower_bloom"),
    PLUM_BLOSSOM("plum_blossom", "梅花", "plum_blossom"),
    CHERRY_BLOSSOMS("cherry_blossoms", "樱花", "cherry_blossoms"),
    WISTERIA("wisteria", "紫藤", "wisteria"),
    HIBISCUS("hibiscus", "芙蓉花", "hibiscus"),
    HYDRANGEA("hydrangea", "绣球花", "hydrangea"),
    ROSE("rose", "玫瑰", "rose"),
    SPIDER_LILY("spider_lily", "彼岸花", "spider_lily"),
    LILY("lily", "百合花", "lily"),
    LOTUS("lotus", "莲花", "lotus"),
    BAMBOO("bamboo", "竹", "bamboo"),
    ENTANGLED_PLANTS("entangled_plants", "缠结型植物", "entangled_plants"),
    ORCHID("orchid", "兰花", "orchid"),
    CHRYSANTHEMUM("chrysanthemum", "菊花", "chrysanthemum"),
    NARCISSU("narcissu", "水仙", "narcissu"),
    TREE("tree", "树", "tree"),
    BRANCH("branch", "树枝", "branch"),
    FOREST("forest", "森林", "forest"),
    PINE_TREE("pine_tree", "松树", "pine_tree"),
    PALM_TREE("palm_tree", "棕榈树", "palm_tree"),
    MAPLE_TREE("maple_tree", "枫树", "maple_tree"),
    BUSH_SHRUB("bush/shrub,", "灌木", "bush/shrub,"),
    CHRISTMAS_TREE("christmas_tree", "圣诞树", "christmas_tree"),
    MAPLE_LEAF("maple_leaf", "枫叶", "maple_leaf"),
    PUMPKIN("pumpkin", "南瓜", "pumpkin"),
    JACK_O_LANTERN("jack-o'-lantern", "南瓜灯", "jack-o'-lantern"),
    SPRING_ONION("spring_onion", "大葱", "spring_onion");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    PlantType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
