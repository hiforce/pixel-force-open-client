package hiforce.pixel.comfy.model.node.prompt.style.extra.scenes;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum OutdoorType implements IPromptType {
    CASTLE("castle", "城堡", "castle"),
    CITY("city", "城市", "city"),
    WATERPARK("waterpark", "水上乐园", "waterpark"),
    CAROUSEL("carousel", "旋转木马", "carousel"),
    FERRIS_WHEEL("ferris wheel", "摩天轮", "ferris wheel"),
    AQUARIUM("aquarium", "水族馆", "aquarium"),
    ZOO("zoo", "动物园", "zoo"),
    BOWLING_ALLEY("bowling alley", "保龄球馆", "bowling alley"),
    ART_GALLERY("art gallery", "美术馆", "art gallery"),
    MUSEUM("museum", "博物馆", "museum"),
    PLANETARIUM("planetarium", "天文馆", "planetarium"),
    SWIMMING_POOL("swimming pool", "游泳池", "swimming pool"),
    STADIUM("stadium", "体育场", "stadium"),
    TEMPLE("temple", "寺庙", "temple"),
    BUS_STOP("bus stop", "巴士车站", "bus stop"),
    TRAIN_STATION("train station", "火车站", "train station"),
    FOUNTAIN("fountain", "喷泉", "fountain"),
    PLAYGROUND("playground", "游乐场", "playground"),
    MARKET_STALL("market stall", "市场摊位", "market stall"),
    PHONE_BOOTH("phone booth", "电话亭", "phone booth"),
    RAILROAD_TRACKS("railroad tracks", "铁轨", "railroad tracks"),
    AIRPORT("airport", "机场", "airport"),
    TUNNEL("tunnel", "隧道", "tunnel"),
    SKYSCRAPER("skyscraper", "摩天楼", "skyscraper"),
    CITYSCAPE("cityscape", "城市风景", "cityscape"),
    RUINS("ruins", "废墟", "ruins"),
    GRECO_ROMAN_ARCHITECTUR("greco-roman architectur", "西罗马建筑", "greco-roman architectur"),
    EAST_ASIAN_ARCHITECTURE("east asian architecture", "东亚建物", "east asian architecture"),
    TORII("torii", "鸟居", "torii"),
    CHURCH("church", "教堂", "church"),
    SHOP("shop", "商店", "shop"),
    STREET("street", "街道", "street"),
    CYBERPUNK_CITY("cyberpunk city", "赛博朋克城市", "cyberpunk city"),
    CHINESE_STYLE_ARCHITECTURE("chinese style architecture", "古风建筑", "chinese style architecture"),
    GOHEI("gohei", "神社", "gohei"),
    BUSTLING_CITY("Bustling city", "繁华都市", "Bustling city"),
    LABORATORY("laboratory", "实验室", "laboratory"),
    COFFEE_HOUSE("coffee house", "咖啡馆", "coffee house"),
    GYM("gym", "健身房", "gym"),
    LIBRARY("library", "图书馆", "library"),
    PRISON("prison", "监狱", "prison"),
    ENGINE_ROOM("engine room", "轮机舱", "engine room"),
    HANDRAIL("handrail", "栏杆", "handrail"),
    NEON_LIGHTS("neon lights", "霓虹灯", "neon lights"),
    STREET_LAMP("street lamp", "路灯", "street lamp"),
    ROAD("road", "道路", "road"),
    SHANTY_TOWN_SLUM("shanty town/slum", "贫民窟", "shanty town/slum"),
    WAREHOUSE("warehouse", "仓库", "warehouse"),
    GOTHIC_ARCHITECTURE("gothic architecture", "哥特式建筑", "gothic architecture"),
    RESTAURANT("restaurant", "饭店", "restaurant"),
    TREEHOUSE("treehouse", "树屋", "treehouse"),
    MODERN_EUROPE("modern,Europe", "法兰西", "modern,Europe"),
    INDUSTRIAL_WIND_CHINESE_ARCHITECTURE("Industrial wind, Chinese architecture", "工业化古建筑", "Industrial wind, Chinese architecture"),
    BUILDING_RUINS("building_ruins", "建筑废墟", "building_ruins"),
    BAR("bar", "酒吧", "bar"),
    IZAKAYA("izakaya", "居酒屋", "izakaya"),
    CAFE("cafe", "咖啡馆", "cafe"),
    BAKERY("bakery", "面包店", "bakery"),
    CONVENIENCE_STORE("convenience store", "便利店", "convenience store"),
    SUPERMARKET("supermarket", "超市", "supermarket"),
    PHARMACY("pharmacy", "药店", "pharmacy"),
    THEATER("theater", "剧院", "theater"),
    MOVIE_THEATER("movie theater", "电影院", "movie theater"),
    WORKSHOP("workshop", "工作坊", "workshop"),
    COURTROOM("courtroom", "法庭", "courtroom"),
    PARK("park", "公园", "park"),
    TRAPEZE("Trapeze", "吊架；秋千", "Trapeze"),
    CLASSROOM("classroom", "教室", "classroom"),
    BOTANICAL_GARDEN("botanical garden", "植物园", "botanical garden"),
    AMUSEMENT_PARK("amusement_park", "游乐园", "amusement_park"),
    DISNEY_LAND("Disney_land", "迪士尼乐园", "Disney_land"),
    ARENA("arena", "竞技场", "arena"),
    WRESTLING_RING("wrestling_ring", "摔角场", "wrestling_ring"),
    AUDITORIUM("Auditorium", "礼堂", "Auditorium"),
    CONCERT("concert", "音乐会", "concert"),
    JAPANESE_HOTEL("Japanese_hotel", "日本旅馆", "Japanese_hotel"),
    JAIL_BARS("jail_bars", "监狱酒吧", "jail_bars"),
    IN_THE_MOVIE_THEATRE("in_the_movie_theatre", "在电影院里", "in_the_movie_theatre"),
    STAGE("stage", "舞台", "stage"),
    HARBOR("harbor", "港口", "harbor"),
    CASINO("casino", "赌场", "casino"),
    BILLIARD("billiard", "台球桌", "billiard"),
    DUNGEON("dungeon", "地牢", "dungeon"),
    GRAVE("grave", "坟墓", "grave"),
    GRAVEYARD("graveyard", "墓地", "graveyard"),
    TOMBSTONE("tombstone", "墓碑", "tombstone"),
    MONOLITH("monolith", "巨大的石头物体", "monolith"),
    RAPPELLING("rappelling", "拉平（悬挂）", "rappelling"),
    BUILDING("building", "建筑", "building"),
    ARCHITECTURE("architecture", "建筑", "architecture"),
    MAGNIFICENT_ARCHITECTURE("magnificent_architecture", "建筑", "magnificent_architecture"),
    CATHEDRAL("cathedral", "大教堂", "cathedral"),
    CHINESE_STYLE_LOFT("chinese_style_loft", "中式阁楼", "chinese_style_loft"),
    TRADITIONAL_CHINESE_ROOM("traditional_chinese_room", "传统中式客房", "traditional_chinese_room"),
    TURRET("turret", "塔楼", "turret"),
    TOWER("tower", "塔", "tower"),
    MOSQUE("mosque", "清真寺", "mosque"),
    RESERVOIR("reservoir", "水库", "reservoir"),
    RAILROAD("railroad", "铁路", "railroad"),
    RAILWAY("railway", "铁路", "railway"),
    BRIDGE("bridge", "桥", "bridge"),
    UNDER_BRIDGE("under_bridge", "桥下", "under_bridge"),
    REMAINS("remains", "废墟", "remains"),
    RUBBLE_RUINS("rubble_ruins", "废墟", "rubble_ruins");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    OutdoorType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
