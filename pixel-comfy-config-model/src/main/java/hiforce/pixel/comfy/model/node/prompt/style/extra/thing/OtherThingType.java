package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum OtherThingType implements IPromptType {
    WRISTWATCH("wristwatch", "手表", "wristwatch"),
    FOLDING_FAN("folding_fan", "折扇", "folding_fan"),
    PAPER_FAN("paper_fan", "纸扇", "paper_fan"),
    UCHIWA("uchiwa", "团扇", "uchiwa"),
    UMBRELLA("umbrella", "雨伞", "umbrella"),
    TRANSPARENT_UMBRELLA("transparent_umbrella", "透明雨伞", "transparent_umbrella"),
    CLOSED_UMBRELLA("closed_umbrella", "封闭伞", "closed_umbrella"),
    OIL_PAPER_UMBRELLA("oil-paper_umbrella", "油纸伞", "oil-paper_umbrella"),
    PARASOL("Parasol", "遮阳伞", "Parasol"),
    BASKET("basket", "篮子", "basket"),
    BOUQUET("bouquet", "花束", "bouquet"),
    BUCKET("bucket", "桶", "bucket"),
    PAIL("pail", "桶", "pail"),
    CAMERA("camera", "相机", "camera"),
    GOHEI("gohei", "御币(驱邪布条)", "gohei"),
    LANTERN_LAMP("lantern/lamp", "灯笼", "lantern/lamp"),
    WHIP("whip", "鞭", "whip"),
    RIDING_CROP("riding_crop", "马鞭", "riding_crop"),
    OFUDA("ofuda", "札符", "ofuda"),
    CANE("cane", "手杖", "cane"),
    WAND("wand", "魔杖", "wand"),
    MAGIC("magic", "魔术", "magic"),
    TRADING_CARD("trading_card", "交易卡", "trading_card"),
    PLAYING_CARD("playing_card", "扑克牌", "playing_card"),
    CASSETTE("Cassette", "磁带盒", "Cassette"),
    CHESS_PIECE("chess_piece", "棋子", "chess_piece"),
    COIN("coin", "硬币", "coin"),
    COPPER("copper", "n.铜币", "copper"),
    HAMMER("hammer", "锤子", "hammer"),
    MICROPHONE("microphone", "麦克风", "microphone"),
    MIMIKAKI("mimikaki", "掏耳勺", "mimikaki"),
    SACK("sack", "麻袋", "sack"),
    SCALES("scales", "秤", "scales"),
    CHIBI_INSET("chibi_inset", "赤壁插图", "chibi_inset"),
    DAMAGED("damaged", "损坏", "damaged"),
    DIAMOND_SHAPE("diamond_(shape)", "钻石（形状）", "diamond_(shape)"),
    GOURD("gourd", "葫芦", "gourd"),
    HOLDING_GIFT("holding_gift", "拿着礼物", "holding_gift"),
    INLET("inlet", "入口", "inlet"),
    KEY("key", "钥匙", "key"),
    LEASH("leash", "皮带", "leash"),
    LEVER("Lever", "杠杆,操作杆", "Lever"),
    MOLECULE("molecule", "分子", "molecule"),
    MONEY("money", "钱", "money"),
    PAINTING_OBJECT("Painting_(Object)", "画作(物品", "Painting_(Object)"),
    PHOTO_OBJECT("photo_(object)", "照片（物体）", "photo_(object)"),
    SAND("sand", "沙子", "sand"),
    STUBBLE("stubble", "茬", "stubble"),
    TROPHY("trophy", "奖杯", "trophy"),
    TUBE_TOP("tube_top", "管顶", "tube_top"),
    WATER_BOTTLE("water_bottle", "水瓶", "water_bottle"),
    LOTION("lotion", "防晒霜|身体乳", "lotion"),
    LOTION_BOTTLE("lotion_bottle", "乳液瓶子", "lotion_bottle");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    OtherThingType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
