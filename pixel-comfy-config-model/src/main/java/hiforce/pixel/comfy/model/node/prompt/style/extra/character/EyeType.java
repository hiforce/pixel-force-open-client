package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum EyeType implements IPromptType {
    BLUE_EYES("blue eyes", "蓝色眼睛"),
    RED_EYES("red eyes", "红色眼睛"),
    BROWN_EYES("brown eyes", "棕色眼睛"),
    GREEN_EYES("green eyes", "绿色眼睛"),
    PURPLE_EYES("purple eyes", "紫色眼睛"),
    YELLOW_EYES("yellow eyes", "黄色眼睛"),
    PINK_EYES("pink eyes", "粉色眼睛"),
    BLACK_EYES("black eyes", "黑色眼睛"),
    AQUA_EYES("aqua eyes", "水蓝色眼睛"),
    ORANGE_EYES("orange eyes", "橙色眼睛"),
    GREY_EYES("grey eyes", "灰色眼睛"),
    MULTICOLORED_EYES("multicolored eyes", "多彩眼睛"),
    WHITE_EYES("white eyes", "白色眼睛"),
    GRADIENT_EYES("gradient eyes", "渐变眼睛"),
    CLOSED_EYES("closed eyes", "闭上眼睛"),
    HALF_CLOSED_EYES("half-closed eyes, half_closed_eyes", "半闭眼"),
    CRYING_WITH_EYES_OPEN("crying with eyes open", "睁着眼睛哭"),
    NARROWED_EYES("narrowed eyes, narrowed_eyes", "眯起眼睛"),
    HIDDEN_EYES("hidden eyes", "隐藏眼睛"),
    HEART_SHAPED_EYES("heart-shaped eyes", "心形眼睛"),
    BUTTON_EYES("button eyes", "纽扣眼睛"),
    CEPHALOPOD_EYES("cephalopod eyes", "头足类眼睛"),
    EYES_VISIBLE_THROUGH_HAIR("eyes visible through hair", "透过头发看见眼睛"),
    GLOWING_EYES("glowing eyes", "发光的眼睛"),
    EMPTY_EYES("empty eyes", "空洞的眼睛"),
    ROLLING_EYES("rolling eyes", "翻白眼"),
    CROSS_EYED("cross eyed, cross-eyed", "斗鸡眼"),
    BLANK_EYES("blank eyes", "空白的眼睛"),
    NO_EYES("no eyes", "没有眼睛"),
    SPARKLING_EYES("sparkling eyes", "闪闪发光的眼睛"),
    EXTRA_EYES("extra eyes", "额外的眼睛"),
    CRAZY_EYES("crazy eyes", "疯狂的眼睛"),
    SOLID_CIRCLE_EYES("solid circle eyes", "实心圆眼"),
    SOLID_OVAL_EYES("solid oval eyes", "实心椭圆形眼睛"),
    UNEVEN_EYES("uneven eyes", "不均匀的眼睛"),
    BLOOD_FROM_EYES("blood from eyes", "眼里流血"),
    EYESHADOW("eyeshadow", "眼影"),
    RED_EYESHADOW("red eyeshadow", "红色眼影"),
    BLUE_EYESHADOW("blue eyeshadow", "蓝色眼影"),
    PURPLE_EYESHADOW("purple eyeshadow", "紫色眼影"),
    PINK_EYESHADOW("pink eyeshadow", "粉色眼影"),
    GREEN_EYESHADOW("green eyeshadow", "绿色眼影"),
    BAGS_UNDER_EYES("bags under eyes", "眼袋"),
    RINGED_EYES("ringed eyes", "眼圈"),
    COVERED_EYES("covered eyes", "蒙住眼睛"),
    COVERING_EYES("covering eyes", "遮住眼睛"),
    SHADING_EYES("shading eyes", "挡着眼睛"),
    DEVIL_EYES("devil eyes", "魔鬼眼"),
    SLIT_PUPILS("slit pupils", "猫眼"),
    BLOODSHOT_EYES("bloodshot eyes", "充血的眼睛"),
    TSURIME("tsurime", "眼尾上扬"),
    TAREME("tareme", "眼尾下垂"),
    CONSTRICTED_PUPILS("constricted pupils", "瞳孔收缩"),
    DEVIL_PUPILS("devil pupils", "魔瞳"),
    SNAKE_PUPILS("snake pupils", "蛇瞳"),
    PUPILS_SPARKLING("pupils sparkling", "瞳孔闪烁"),
    FLOWER_SHAPED_PUPILS("flower-shaped pupils", "花状瞳孔"),
    HEART_SHAPED_PUPILS("heart-shaped pupils", "心形瞳孔"),
    HETEROCHROMIA("heterochromia", "异色瞳"),
    COLOR_CONTACT_LENSES("color contact lenses", "美瞳"),
    LONGEYELASHES("longeyelashes", "长睫毛"),
    COLORED_EYELASHES("colored eyelashes", "彩色睫毛"),
    MOLE_UNDER_EYE("mole under eye", "眼下痣"),
    LIGHT_EYES("light_eyes", "明亮的眼睛"),
    GLOWING_EYE("glowing_eye", "发光的眼睛"),
    SHINY_EYES("shiny_eyes", "闪亮的眼睛"),
    ANIME_STYLE_EYES("anime_style_eyes", "动画眼"),
    WATER_EYES("water_eyes", "水汪汪"),
    BEAUTIFUL_DETAILED_EYES("beautiful_detailed_eyes", "美丽的眼睛"),
    SOLID_OVAL_EYES_("solid_oval_eyes_", "Q版实心椭圆眼睛"),
    SOLID_CIRCLE_PUPILS("solid_circle_pupils", "Q版实心圆瞳孔"),
    BLUSH_STICKERS("blush_stickers", "Q版腮红贴纸"),
    HEART_IN_EYE("heart_in_eye", "心形眼"),
    EVIL_EYES("evil_eyes", "邪恶的眼睛"),
    HOLLOW_EYES("hollow_eyes", "star-shaped_pupils"),
    SANPAKU("sanpaku", "三白症(瞳孔偏移)"),
    MISMATCHED_SCLERA("mismatched_sclera", "错配巩膜"),
    EYE_RELFECTION("eye_relfection", "眼睛反射(没有效果"),
    MECHANICAL_EYE("mechanical_eye", "机械眼"),
    CLOCK_EYES("clock_eyes", "钟眼"),
    COMPOUND_EYES("compound_eyes", "复眼"),
    FISHEYE("fisheye", "鱼眼"),
    SOLID_EYES("solid_eyes", "坚定的眼睛"),
    SPARKLING_ANIME_EYES("sparkling_anime_eyes", "闪光动画眼"),
    EYE_CONTACT("eye_contact", "眼神交流"),
    EYE_OF_HORUS("eye_of_horus", "荷鲁斯之眼"),
    EYEBALL("eyeball", "眼球"),
    EYELINER("eyeliner", "眼线"),
    EYES("eyes", "眼睛"),
    GLINT("glint", "眼中闪现强烈的情感"),
    HALF_CLOSED_EYE("half-closed_eye", "半闭的眼睛(单眼)"),
    REFLECTIVE_EYES("reflective_eyes", "one-eyed"),
    SILVER_EYES("silver_eyes", "银色的眼睛"),
    SPIRAL_EYES("spiral_eyes", "漩涡眼"),
    THIRD_EYE("third_eye", "第三只眼"),
    FLAMING_EYE("flaming_eye", "焰目"),
    EYES_CLOSED("eyes_closed", "闭眼"),
    SQUINTING("squinting", "眯起眼睛看"),
    TEARS("tears", "眼泪"),
    SHARP_EYES("sharp_eyes", "锐利的眼"),
    SLANTED_EYES("slanted_eyes", "锐利的眼"),
    UPTURNED_EYES("upturned_eyes", "上翘的眼睛"),
    HAIR_OVER_EYES("hair_over_eyes", "头发遮着双眼"),
    HAIR_OVER_ONE_EYE("hair_over_one_eye", "头发遮住了一只眼睛"),
    ONE_EYE_COVERED("one_eye_covered", "一只眼被遮住"),
    EYEPATCH("eyepatch", "眼罩"),
    MEDICAL_EYEPATCH("medical_eyepatch", "医用眼罩"),
    SCAR_ACROSS_EYE("scar_across_eye", "眼睛上的疤痕"),
    NO_BLINDFOLD("no_blindfold", "去掉了(原设有的)蒙眼要素"),
    NO_EYEPATCH("no_eyepatch", "去掉了(原设有的)眼罩"),
    AHEGAO("ahegao", "阿嘿颜");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    EyeType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
