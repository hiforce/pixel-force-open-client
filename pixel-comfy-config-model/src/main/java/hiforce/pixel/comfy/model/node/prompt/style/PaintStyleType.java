package hiforce.pixel.comfy.model.node.prompt.style;

import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2024/5/4
 */
@Getter
public enum PaintStyleType implements IStyleType {
    BASE("base"),
    SAI_3D_MODEL("sai-3d-model"),
    SAI_ANALOG_FILM("sai-analog-film"),
    SAI_ANIME("sai-anime"),
    SAI_CINEMATIC("sai-cinema"),
    SAI_COMIC_BOOK("sai-comic book"),
    SAI_CRAFT_CLAY("sai-craft clay"),
    SAI_DIGITAL_ART("sai-digital art"),
    SAI_ENHANCE("sai-enhance"),
    SAI_FANTASY_ART("sai-fantasy art"),
    SAI_ISOMETRIC("sai-isometric"),
    SAI_LINE_ART("sai-line art"),
    SAI_LOWPOLY("sai-lowpoly"),
    SAI_NEONPUNK("sai-neonpunk"),
    SAI_ORIGAMIN("sai-origamin"),
    SAI_PHOTOGRAPHIC("sai-photographic"),
    SAI_PIXEL_ART("sai-pixel art"),
    SAI_TEXTURE("sai-texture"),
    ADS_ADVERTISING("ads-advertising"),
    ADS_AUTOMOTIVE("ads-automotive"),
    ADS_CORPORATE("ads-corporate"),
    ADS_FASHION_EDITORIAL("ads-fashion-editorial"),
    ADS_FOOD_PHOTOGRAPHY("ads-food-photography"),
    ADS_GOURMET_FOOD_PHOTOGRAPHY("ads-gourmet food photography"),
    ADS_LUXURY("ads-luxury"),
    ADS_REAL_ESTATE("ads-real estate"),
    ADS_RETAIL("ads-retail"),
    ARTSTYLE_ABSTRACT("artstyle-abstract"),
    ARTSTYLE_ABSTRACT_EXPRESSIONISM("artstyle-abstract expressionism"),
    ARTSTYLE_ART_DECO("artstyle-art deco"),
    ARTSTYLE_ART_NOUVEAU("artstyle-art nouveau"),
    ARTSTYLE_CONSTRUCTIVIST("artstyle-constructivist"),
    ARTSTYLE_CUBIST("artstyle-cubist"),
    ARTSTYLE_EXPRESSIONIST("artstyle-expressionist"),
    ARTSTYLE_GRAFFITI("artstyle-graffiti"),
    ARTSTYLE_HYPERREALISM("artstyle-hyperrealism"),
    ARTSTYLE_IMPRESSIONIST("artstyle-impressionist"),
    ARTSTYLE_POINTILLISM("artstyle-pointillism"),
    ARTSTYLE_POP_ART("artstyle-pop-art"),
    ARTSTYLE_PSYCHEDELIC("artstyle-psychedelic"),
    ARTSTYLE_RENAISSANCE("artstyle-renaissance"),
    ARTSTYLE_STEAMPUNK("artstyle-steampunk"),
    ARTSTYLE_SURREALIST("artstyle-surrealist"),
    ARTSTYLE_TYPOGRAPHY("artstyle-typography"),
    ARTSTYLE_WATERCOLOR("artstyle-watercolor"),
    FUTURISTIC_BIOMECHANICAL("futuristic-biomechanical"),
    FUTURISTIC_BIOMECHANICAL_CYBERPUNK("futuristic-biomechanical cyberpunk"),
    FUTURISTIC_CYBERNETIC("futuristic-cybernetic"),
    FUTURISTIC_CYBERNETIC_ROBOT("futuristic-cybernetic robot"),
    FUTURISTIC_CYBERPUNK_CITYSPACE("futuristic-cyberpunk cityspace"),
    FUTURISTIC_FUTURISTIC("futuristic-futuristic"),
    FUTURISTIC_RETRO_CYBERPUNK("futuristic-retro-cyberpunk"),
    FUTURISTIC_RETRO_FUTURISM("futuristic-retro futurism"),
    FUTURISTIC_SCI_FI("futuristic-sci-fi"),
    FUTURISTIC_VAPORWARE("futuristic-vaporware"),
    PHOTO_ALIEN("photo-alien"),
    PHOTO_FILM_NOIR("photo-film noir"),
    PHOTO_GLAMOUR("photo-glamour"),
    PHOTO_HDR("photo-hdr"),
    PHOTO_IPHONE_PHOTOGRAPHIC("photo-iphone photographic"),
    PHOTO_LONG_EXPOSURE("photo-long exposure"),
    PHOTO_NEON_NOIR("photo-neon noir"),
    PHOTO_SILHOUETTE("photo-silhouette"),
    PAINT_STYLE_TYPE("photo-tilt-shift")

    ;

    private final String value;

    PaintStyleType(String value) {
        this.value = value;
    }

    public static void main(String [] args ){
        for( PaintStyleType type: PaintStyleType.values()){
            System.out.printf("%s%s%n", "STYLE-", type.name());
        }
    }
}
