package hiforce.pixel.comfy.model.node.prompt.style.extra.picture;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum ArtStyleType implements IPromptType {
    ARTBOOK("artbook", "原画"),
    GAME_CG("game cg", "游戏CG"),
    COMIC("comic", "漫画"),
    KOMA_4("4koma", "四格"),
    ANIMATED_GIF("animated gif", "GIF格式图片"),
    DAKIMAKURA("dakimakura", "抱枕"),
    COSPLAY("cosplay", "角色扮演"),
    CROSSOVER("crossover", "穿越"),
    DARK("dark", "暗的"),
    LIGHT("light", "亮的"),
    GURO("guro", "猎奇"),
    REALISTIC("realistic", "写实"),
    PHOTO("photo", "照片"),
    REAL("real", "真实"),
    LANDSCAPE_SCENERY("landscape/scenery", "风景"),
    CITYSCAPE("cityscape", "城市风景"),
    SCIENCE_FICTION("science fiction", "科技幻想"),
    ORIGINAL("original", "原创"),
    PARODY("parody", "拙劣的模仿"),
    PERSONIFICATION("personification", "拟人"),
    OPTICAL_ILLUSION("optical illusion", "视觉错误"),
    FINE_ART_PARODY("fine art parody", "名画模仿"),
    SKETCH("sketch", "素描"),
    TRADITIONAL_MEDIA("traditional media", "传统媒体（手绘稿）"),
    WATERCOLOR_MEDIUM("watercolor (medium)", "透明水彩绘"),
    SILHOUETTE("silhouette", "剪影"),
    COVER("cover", "封面"),
    ALBUM("album", "专辑"),
    SAMPLE("sample", "图上有字样"),
    BACK("back", "背影像"),
    BUST("bust", "半身像"),
    PROFILE("profile", "侧面绘"),
    EXPRESSIONS("expressions", "表情绘（各种表情）"),
    EVERYONE("everyone", "一部作品中的主要人物集齐"),
    COLUMN_LINEUP("column lineup", "一列列小图组成大图"),
    TRANSPARENT_BACKGROUND("transparent background", "透明的背景"),
    SIMPLE_BACKGROUND("simple background", "简单的背景"),
    GRADIENT_BACKGROUND("gradient background", "渐变的背景"),
    ZOOM_LAYER("zoom layer", "背景是前景的放大版"),
    EIGHT_BIT_GAME("8 Bit Game", "8bit游戏"),
    Y1980S_ANIME("1980s anime", "80动画"),
    DISNEY_MOVIE("disney movie", "迪士尼电影"),
    GOTH("goth", "哥特摇滚"),
    Y80S_MOVIE("80s movie", "80电影"),
    BUBBLE_BOBBLE("bubble bobble", "泡泡龙"),
    STYLE_OF_PIXAR("style of Pixar", "皮克斯动画"),
    POLAROID_ART("Polaroid art", "宝丽来艺术"),
    KALEIDOSCOPE_PHOTOGRAPHY("Kaleidoscope Photography", "万花筒摄影"),
    OPAL_RENDER("opal render", "欧泊渲染"),
    CHEMIGRAM("chemigram", "色谱图"),
    STUDIO_GHIBLI("Studio Ghibli", "吉卜力风格"),
    DREAMLIKE("dreamlike", "梦幻"),
    FAUX_TRADITIONAL_MEDIA("(faux traditional media)", "签绘风格"),
    GENSHIN_IMPACT("genshin impact", "原神冲击"),
    AZUR_LANE("azur lane", "碧蓝航线"),
    KANTAI_COLLECTION("kantai collection", "舰队收藏"),
    REBECCA_CYBERPUNK("rebecca (cyberpunk)", "边缘行者"),
    CHAINSAW_MAN("chainsaw man", "电锯人"),
    MAGIC_VORTEX("Magic Vortex", "魔法旋涡"),
    DIESELPUNK("((dieselpunk))", "柴油朋克"),
    MAGAZINE_SCAN("magazine scan", "杂志扫描"),
    ALBUM_COVER("album cover", "专辑封面"),
    LINEART("(lineart)", "线条变粗"),
    SYNTHWAVE("synthwave", "蒸汽波"),
    LOCOCO("(illustration),(paper figure),(lococo),((impasto)),(shiny skin),", "洛可可");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    ArtStyleType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
