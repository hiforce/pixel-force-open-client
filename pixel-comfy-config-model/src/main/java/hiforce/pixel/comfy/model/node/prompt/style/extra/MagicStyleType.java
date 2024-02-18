package hiforce.pixel.comfy.model.node.prompt.style.extra;

import hiforce.pixel.comfy.model.node.prompt.style.IExtraStyleType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/26
 */
public enum MagicStyleType implements IExtraStyleType {
    None("None",""),
    WATER_MAGIC("water magic",  "((water drops)),wet clothes,((beautiful detailed water)),((floating)),dynamic angle,"),

    ICE_MAGIC_I("ice magic I",  "beautiful detailed glow, (detailed ice), beautiful detailed water,"),

    ICE_MAGIC_II("ice magic II",  "beautiful detailed glow,detailed ice,beautiful detailed water,(floating palaces:1.2),(ice crystal texture wings),（Iridescence and rainbow hair:2.5),"),

    ICE_CRYSTAL("ice crystal",  "beautiful detailed glow,detailed ice,beautiful detailed water, (floating palaces:1.3),(((ice crystal texture wings))),"),

    FOREST_ICE("forest ice",  "((detailed beautiful snow forest with trees)), ((snowflakes)), floating,"),

    FOREST_MAGIC_II("forest magic",  "(detailed light) , feather, leaves, nature, (sunlight), river, (forest),(bloom),"),

    CRYSTAL_MAGIC("crystal magic",  "(((crystals texture Hair))),((beautiful detailed glass hair)),((glass shaped texture hand)),((crystallize texture body)),gem body,hands as clear as jewels,crystallization of clothes,((crystals texture skin)),sparkle, lens flare, light leaks,broken glass,detailed glass shaped clothes,beautiful detailed gemstone sky, gemstone sea, crystals texture flowers,((detailed crystallized clothing)),"),

    CRYSTAL_MAGIC_II("crystal magic II",  "(((gorgeous crystal armor))),(((crystal wings))),((altocumulus)),(clear_sky),(snow mountain),((flowery flowers)),(flowery bubbles),cloud map plane, crystal, crystal poppies,Brilliant light, thick_coating, glass tint,(watercolor),"),

    NUCLEAR_MAGIC("nuclear magic",  "beautiful detailed glow,((flames of war)),(((nuclear explosion behide))),"),

    WIND_MAGIC("wind magic",  "((breeze)), flying splashes, flying petals, wind,"),

    SAND_MAGIC("sand magic",  "((surrounded by heavy floating sand flow and floating sharp stones)),((((ink)))),((illustration)),((watercolor)),"),

    THUNDER_AND_LIGHTNING("thunder and lightning",  "(detailed light), ((lightning in hand)),lightning surrounds,(((lightning chain))),"),

    HOLY_LIGHT_MAGIC("holy light magic",  "(sunlight),(angel),dynamic angle, floating, wing, halo, floating white silk,(Holy Light),silver stars,"),

    ASHINA_MAGIC("ashina magic",  "beautiful detailed pampas grass field, open hakama, surrounded by floating sakura, yellow full moon, beautiful detailed dark midnight sky, messy white long hair,"),

    NATURE_MAGIC("nature magic",  "beautiful and delicate water, the finest grass, very delicate light, nature, painting, water spray, breeze, flowers and grass meadow, near the water edge, (sunset, starry sky in a circle), randomly distributed clouds, river, splashing water, falling petals,"),

    RAINBOW_MAGIC("rainbow magic",  "floating and rainbow long hair,Iridescence and rainbow, beautiful detailed starry sky,"),

    DARK_CHAIN_MAGIC("dark chain magic",  "chain ring, chain storm, dark chain,((wholeblack bloomer)), darkside, night, deep dark, darkness, ((dark clouds)),((ruins)),shadow, death garden,"),

    FIRE_CLOUD_MAGIC("fire cloud magic",  "beautiful detailed glow, floating ashes, beautiful and detailed explosion, red moon, fire, fire cloud, wings on fire, a cloudy sky, smoke of gunpowder, burning, black dress, dove of peace, (floating cloud:1.2),"),

    PALACE_MAGIC("palace magic",  "beautiful detailed glow, detailed ice, beautiful detailed water, (magic circle:1.2), (floating palaces:1.3),"),

    SUNSET_MAGIC("sunset magic",  "(water bloom), (delicate glow), (breeze), long Flowers meadow,(((sunset)), (less stars form a circle), randomly distributed clouds, (rivers), (willows with branches falling into the water),"),

    BUBBLE_MAGIC("bubble magic",  "((colorful bubble)),(floating),detailed light,"),

    ROSE_MAGIC("rose magic",  "((rose)), (vine), cage, bandage, red rope, (detail light), falling rose petals,"),

    STARRY_MAGIC("starry magic",  "(starry tornado:1.4), starry Nebula, beautiful detailed sky,"),

    MOON_MAGIC("moon magic",  "((moon)), starry sky, (lighting particle), fog, snow,(bloom),"),

    COLD_FULL_MOON("cold full moon",  "beautiful detailed glow, detailed ice, beautiful detailed water, (cold full moon), snowflake, (floating cloud:1.2),"),

    BURNING_FOREST("burning forest",  "((burning forest)), spark, light leaks, burning sky, flame, flames burning around, (flying sparks),"),

    DESTROYED_MAGIC("destroyed magic",  "((destroyed)),explosion, buildings in disarray, The residual eaves DuanBi, cumulus, mouldy, floating, wind, Dead end machine,(broken robot),(Mechanical robot girl), in the rubble of a devastated city,"),

    ROBOT_GIRL_MAGIC("robot girl magic",  "mecha clothes, robot girl, sliver bodysuit,((sliver)) and (broken) body,"),

    GOLD_MAGIC("gold magic",  "Extremely gorgeous metal style, Metal crown with ornate stripes, Various metals background, Sputtered molten iron, floating hair, Hair like melted metal, Clothes made of silver, Clothes with gold lace, flowing gold and silver, everything flowing and melt, flowing iron, flowing silver, lace flowing and melt,"),

    BONE_MAGIC("bone magic",  "ink,(((bone))), (((ribs))), rose, black hair, blue eyes, greyscale, no shadow, simple background, bright skin,"),

    WATER_FOREST_MAGIC("water forest magic",  "((an extremely delicate and beautiful)),floating, (detailed wet clothes), (detailed light),feather, nature, (sunlight), river, floating palace, beautiful and delicate water,(bloom),(shine),"),

    SPARK_MAGIC("spark magic",  "(blue spark),(red and blue hair),blue eyes, burning sky,flame,Rainbow in the sky,((Flames burning ice)),(((fire butterflies))),(((ice crystal texture wings))),(Flying sparks),(detailed ice),((a lot of luminous ice crystals)),((burning feathers)),(feathers made of ice),(frozen feathers),(((ice and fire together))),"),

    DRAGON_HORNS("dragon horns",  "(anger), dragon horns, (silver armor), metal, complex pattern, cape, indifference,"),

    FALLING_MAGIC("falling magic",  "((full body)),(helpless),tear, crying,(((((falling from the sky))))),((Weathering With You)),((falling)),((face towards the sky))，(hair flows upwards),((disheveled hair)),(1 girl), floating, beautiful detailed sky,"),

    UNDERWATER("underwater",  "((underwater)),(beautiful detailed water),((coral)),dynamic angle, floating,(detailed light),floating hair,(splash),((fishes)),leaves dress, feather, nature,(sunlight),(underwater forest),(bloom),(detailed glow),drenched, seaweed, fish,(((Tyndall effect))),"),

    SECRET_GARDEN("secret garden",  "(extremely detailed CG unity 8k wallpaper),(((masterpiece))), (((best quality))), ((ultra-detailed)), (best illustration),(best shadow), ((an extremely delicate and beautiful)),dynamic angle,floating, fairyland,dynamic angle,sea of flowers,beautiful detailed garden,wind,classic,spring, (detailed light),feather, nature, (sunlight), river, forest,(((floating palace))),((the best building)),beautiful and delicate water,(painting),(sketch),(bloom),(shine),"),

    PHOTOGRAPHY_MAGIC("photography magic",  "(((masterpiece))), ((the best quality, super fine illustrations, beautiful and delicate water)), ((very delicate light)), ((nature, painting)), ((fine lighting, more transparent stars, high-quality snowflakes, high-quality mountains, very fine 8KCG wallpapers)), (plateau), (((snow mountain))), sunrise, randomly distributed clouds, (snow field), cliff, ((rotating star sky)), ((lake in mountain stream)), luminous particles,"),

    MODERN_MAGIC("modern magic",  "1980s (style),simple background, retro artstyle,"),

    BLOOD_MAGIC("blood magic",  "(white hair), red long hair, red eyes, (full body), (((with sword))), angry face, (beautiful detailed eyes), Blood drop,Blood fog, floating hair, disheveled hair, Splashing blood,(Bloodstain),"),

    DRAGON_MAGIC("dragon magic",  "((dragon)), ((dragon background)),"),

    MECHANICAL_MAGIC("mechanical magic",  "hair fluttering in the wind,((mechanical arm armor)),((mechanical body armor)),riding motor, bodysuit,((ruins of city in war, fire, burning cars, burning buildings)),air force fleet in the sky,"),

    DRAGON_ARMOR("dragon armor",  "mecha clothes, robot girl, sliver bodysuit, dragon wings, ((a dragon stands behind the girl)), beautiful detailed sliver dragon armor,"),

    STAR_BUTTERFLIES("star & butterflies",  "((Beautiful butterflies in detail)),((Beautiful stars in detail)),(((halter dress ))),particle,(Starry sky in beautiful detail),(Hazy fog),(Ruins of beautiful details),(((Standing on the surface of the sea))),"),

    CASTLE_MAGIC("castle magic",  "blonde wavy hair, (shiny long hair), ((Gothic Lolita)), blue white skirt, ((short skirt)), black Headdress, bowknot, (((hair ornament))), (hair flower), Lace, cross-laced footwear, ribbon-trimmed sleeves, building architecture, ((gothic architecture)), starry sky, outdoors, church, (castle),"),

    DAWN_MAGIC("dawn magic",  "walking, waves, wind,(((glistening light of waves))),(detailed sunset glow),(floating flow),((coral)),(Luminous),coast,(floating colorful bubbles),beautiful detailed sky,(fluorescence),detailed shadow,(conch),beautiful detailed water, starfish, meteor, rainbow,(seabirds),(glinting stars), (glowworm),(splash),detailed cloud, shell,(fireworks),"),

    SNOWFLAKE_MAGIC("snowflake magic",  "beautiful detailed sky, night, stars, (red plum blossom),((winter)),(((snowflakes))), ((red and white flowers))，(starry sky),(sitting),((colorful)),scenery, lantern,(starfall),");

    @Getter
    private final String value;

    @Getter
    private final String words;

    MagicStyleType(String value, String words) {
        this.value = value;
        this.words = words;
    }

    @Override
    public String getImageUrl() {
        return name().toLowerCase() + ".png";
    }

    public static void main(String[] args) {
        for (MagicStyleType type : MagicStyleType.values()) {
            System.out.printf("%s,\"%s\",%n", type.value, type.getWords());
        }
    }

}
