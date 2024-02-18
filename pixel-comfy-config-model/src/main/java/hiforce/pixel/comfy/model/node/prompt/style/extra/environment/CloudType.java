package hiforce.pixel.comfy.model.node.prompt.style.extra.environment;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CloudType implements IPromptType {
    CIRRUS("cirrus", "卷云", "cirrus"),
    CIRROCUMULUS("Cirrocumulus", "卷积云", "Cirrocumulus"),
    CIRROSTRATUS("Cirrostratus", "卷层云", "Cirrostratus"),
    ALTOCUMULUS("Altocumulus", "高积云", "Altocumulus"),
    ALTOSTRATUS("Altostratus", "高层云", "Altostratus"),
    STRATUS("stratus", "层云", "stratus"),
    STRATOCUMULUS("Stratocumulus", "层积云", "Stratocumulus"),
    CUMULUS("cumulus", "积云", "cumulus"),
    CUMULONIMBUS("Cumulonimbus", "积雨云", "Cumulonimbus"),
    NIMBOSTRATUS("Nimbostratus", "雨层云", "Nimbostratus"),
    CIRRUS_FIBRATUS("cirrus_fibratus", "毛卷云", "cirrus_fibratus"),
    CIRRUS_UNCINUS("cirrus_uncinus", "钩卷云", "cirrus_uncinus"),
    CIRRUS_SPISSATUS("cirrus_spissatus", "密卷云", "cirrus_spissatus"),
    CIRRUS_FLOCCUS("cirrus_floccus", "絮卷云", "cirrus_floccus"),
    CIRRUS_CASTELLANUS("cirrus_castellanus", "堡卷云", "cirrus_castellanus"),
    CIRRUS_INTORTUS("cirrus_intortus", "乱卷云", "cirrus_intortus"),
    CIRROCUMULUS_STRATIFORMIS("cirrocumulus_stratiformis", "层状卷积云", "cirrocumulus_stratiformis"),
    CIRROCUMULUS_FLOCCUS("cirrocumulus_floccus", "絮状卷积云", "cirrocumulus_floccus"),
    CIRROCUMULUS_CASTELLANUS("cirrocumulus_castellanus", "堡状卷积云", "cirrocumulus_castellanus"),
    CIRROCUMULUS_LACUNOSUS("cirrocumulus_lacunosus", "网状卷积云", "cirrocumulus_lacunosus"),
    CIRROSTRATUS_FIBRATUS("cirrostratus_fibratus", "毛卷层云", "cirrostratus_fibratus"),
    CIRROSTRATUS_NEBULOSUS("cirrostratus_nebulosus", "雾卷层云", "cirrostratus_nebulosus"),
    ALTOCUMULUS_STRATAFORMIS("altocumulus_strataformis", "层状高积云", "altocumulus_strataformis"),
    ALTOCUMULUS_LENTICULARIS("altocumulus_lenticularis", "荚状高积云", "altocumulus_lenticularis"),
    ALTOCUMULUS_CASTELLANUS("altocumulus_castellanus", "堡状高积云", "altocumulus_castellanus"),
    ALTOCUMULUS_FLOCCUS("altocumulus_floccus", "絮状高积云", "altocumulus_floccus"),
    ALTOCUMULUS_LACUNOSUS("altocumulus_lacunosus", "网状高积云", "altocumulus_lacunosus"),
    ALTOSTRATUS_UNDULATUS("altostratus_undulatus", "波状高层云", "altostratus_undulatus"),
    ALTOSTRATUS_DUPLICATES("altostratus_duplicates", "复合高层云", "altostratus_duplicates"),
    ALTOSTRATUS_PANNUS("altostratus_pannus", "破片高层云", "altostratus_pannus"),
    ALTOSTRATUS_TRANSLUCIDUS("altostratus_translucidus", "透光高层云", "altostratus_translucidus"),
    ALTOSTRATUS_OPACUS("altostratus_opacus", "蔽光高层云", "altostratus_opacus"),
    ALTOSTRATUS_RADIATUS("altostratus_radiatus", "辐状高层云", "altostratus_radiatus"),
    ALTOSTRATUS_MAMMATUS("altostratus_mammatus", "乳状高层云", "altostratus_mammatus"),
    STRATUS_FRACTUS("stratus_fractus", "碎层云", "stratus_fractus"),
    STRATUS_NEBULOSUS("stratus_nebulosus", "雾层云", "stratus_nebulosus"),
    STRATUS_UNDULATUS("stratus_undulatus", "波层云", "stratus_undulatus"),
    STRATOCUMULUS_STRATIFORMIS("stratocumulus_stratiformis", "层状层积云", "stratocumulus_stratiformis"),
    STRATOCUMULUS_CUMULOGENTIS("stratocumulus_cumulogentis", "积雨性层积云", "stratocumulus_cumulogentis"),
    STRATOCUMULUS_CASTELLANUS("stratocumulus_castellanus", "堡状层积云", "stratocumulus_castellanus"),
    STRATOCUMULUS_LENTICULARIS("stratocumulus_lenticularis", "荚状层积云", "stratocumulus_lenticularis"),
    STRATOCUMULUS_LACUNOSUS("stratocumulus_lacunosus", "絮状层积云", "stratocumulus_lacunosus"),
    CUMULUS_HUMILIS("cumulus_humilis", "淡积云", "cumulus_humilis"),
    CUMULUS_MEDIOCRIS("cumulus_mediocris", "中积云", "cumulus_mediocris"),
    CUMULUS_CONGESTUS("cumulus_congestus", "浓积云", "cumulus_congestus"),
    CUMULUS_FRACTUS("cumulus_fractus", "碎积云", "cumulus_fractus"),
    CUMULONIMBUS_CALVUS("cumulonimbus_calvus", "秃积雨云", "cumulonimbus_calvus"),
    CUMULONIMBUS_CAPILLATUS("cumulonimbus_capillatus", "鬃积雨云", "cumulonimbus_capillatus"),
    CUMULONIMBUS_INCUS("cumulonimbus_incus", "砧积雨云", "cumulonimbus_incus");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CloudType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
