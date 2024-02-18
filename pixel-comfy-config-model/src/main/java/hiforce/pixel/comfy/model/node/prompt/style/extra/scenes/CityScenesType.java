package hiforce.pixel.comfy.model.node.prompt.style.extra.scenes;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CityScenesType implements IPromptType {
    CITY("city", "城市", "city"),
    CITYSCAPE("cityscape", "城市风景", "cityscape"),
    STREET("street", "街道", "street"),
    DOWNTOWN("downtown", "市中心", "downtown"),
    CROWD("crowd", "人群", "crowd"),
    ALLEY("alley", "小巷", "alley"),
    IN_MAIN_STREET("in_main_street", "大道", "in_main_street"),
    INTERSECTION("Intersection", "路口", "Intersection"),
    AVENUE("avenue", "大街", "avenue"),
    LAWN("lawn", "草坪", "lawn"),
    ROAD("road", "路", "road"),
    PATH("path", "路径", "path"),
    PAVEMENT("pavement", "路面", "pavement"),
    ROAD_SIGN("road_sign", "路标", "road_sign"),
    TRAFFIC_CONE("traffic_cone", "路障", "traffic_cone"),
    LAMPPOST("lamppost", "路灯", "lamppost"),
    POWER_LINES("power_lines", "电线杆和电线", "power_lines"),
    FENCE("fence", "栅栏", "fence"),
    RAILING("railing", "栏杆", "railing"),
    BENCH("bench", "长凳", "bench"),
    VENDING_MACHINE("vending_machine", "自动贩卖机", "vending_machine");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CityScenesType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
