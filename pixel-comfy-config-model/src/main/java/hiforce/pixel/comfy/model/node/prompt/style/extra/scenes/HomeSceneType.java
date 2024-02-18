package hiforce.pixel.comfy.model.node.prompt.style.extra.scenes;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum HomeSceneType implements IPromptType {
    BEDROOM("bedroom", "家具", "bedroom"),
    TATAMI("tatami", "榻榻米", "tatami"),
    BED("bed", "床", "bed"),
    COUCH("couch", "沙发", "couch"),
    KOTATSU("kotatsu", "被炉", "kotatsu"),
    FIREPLACE("fireplace", "壁炉", "fireplace"),
    WINDOW_("window_", "窗", "window_"),
    SASH("sash", "窗扇", "sash"),
    CURTAINS("curtains", "窗帘", "curtains"),
    DOOR("door", "门", "door"),
    SLIDING_DOORS("sliding_doors", "推拉门", "sliding_doors"),
    CLOTHES_RACK("clothes_rack", "衣架", "clothes_rack"),
    AIR_CONDITIONER("air_conditioner", "空调", "air_conditioner"),
    TABLE("table", "桌子", "table"),
    SCHOOL_DESK("school_desk", "课桌", "school_desk"),
    CHAIR("chair", "椅子", "chair"),
    ARMCHAIR("armchair", "扶手椅", "armchair"),
    LOUNGE_CHAIR("lounge_chair", "躺椅", "lounge_chair"),
    BEACH_CHAIR("beach_chair", "沙滩椅", "beach_chair"),
    FOLDING_CHAIR("folding_chair", "折叠椅", "folding_chair"),
    INVISIBLE_CHAIR("invisible_chair", "隐形椅子", "invisible_chair"),
    OFFICE_CHAIR("office_chair", "办公椅", "office_chair"),
    WHEELCHAIR("wheelchair", "轮椅", "wheelchair"),
    FLOOR("floor", "地板", "floor"),
    TILE_FLOOR("tile_floor", "木质地板", "tile_floor"),
    BED_SHEET("bed_sheet", "床单", "bed_sheet"),
    MATTRESS("mattress", "床垫；褥子", "mattress"),
    FUTON("futon", "日本床垫", "futon"),
    CUSHION("cushion", "坐垫", "cushion"),
    CARPET("carpet", "地毯", "carpet"),
    PILLOW("pillow", "枕头", "pillow"),
    DUMPLING_HUG_PILLOW("dumpling_Hug_Pillow", "团子抱枕", "dumpling_Hug_Pillow"),
    PILLOW_HUG("pillow_hug", "抱枕", "pillow_hug"),
    YES_NO_PILLOW("yes-no_pillow", "Yes/No枕头", "yes-no_pillow"),
    STUFFED_ANIMAL("stuffed_animal", "毛绒玩偶", "stuffed_animal"),
    STUFFED_BUNNY("stuffed_bunny", "毛绒兔子", "stuffed_bunny"),
    KOAKUMA("koakuma", "小熊", "koakuma"),
    BATHROOM("bathroom", "浴室", "bathroom"),
    BATHTUB("bathtub", "浴缸", "bathtub,"),
    RUBBER_DUCK("rubber_duck", "橡皮鸭", "rubber_duck"),
    SHOWER_HEAD("shower_head", "淋浴喷头", "shower_head"),
    TOILET("toilet", "马桶", "toilet"),
    SQUAT_TOILET("squat_toilet", "蹲便器", "squat_toilet"),
    SOAP("soap", "肥皂", "soap"),
    TILES("tiles", "瓷砖", "tiles");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    HomeSceneType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
