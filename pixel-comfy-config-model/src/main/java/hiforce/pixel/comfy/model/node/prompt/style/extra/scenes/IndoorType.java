package hiforce.pixel.comfy.model.node.prompt.style.extra.scenes;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum IndoorType implements IPromptType {
    INDOOR("indoor", "室内", "indoor"),
    BATHROOM("bathroom", "浴室", "bathroom"),
    TOILET_STALL("toilet stall", "厕所隔间", "toilet stall"),
    OTAKU_ROOM("otaku room", "宅男房间", "otaku room"),
    CAFETERIA("cafeteria", "自助餐厅", "cafeteria"),
    CLASSROOM("classroom", "教室", "classroom"),
    CLUBROOM("clubroom", "俱乐部", "clubroom"),
    BEDROOM("bedroom", "卧室", "bedroom"),
    KITCHEN("kitchen", "厨房", "kitchen"),
    DORMITORY("dormitory", "宿舍", "dormitory"),
    DUNGEON("dungeon", "地库", "dungeon"),
    INFIRMARY("infirmary", "医务室", "infirmary"),
    STAGE("stage", "舞台", "stage"),
    ELECTRICAL_ROOM("electrical room", "配电房", "electrical room"),
    SERVER_ROOM("server room", "服务器机房", "server room"),
    BASEMENT("basement", "地下室", "basement"),
    ART_ROOM("art room", "美术室", "art room"),
    BATHING("bathing", "浴室", "bathing"),
    STAIRS("stairs", "楼梯", "stairs"),
    GREENHOUSE("greenhouse", "温室", "greenhouse");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    IndoorType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
