package hiforce.pixel.comfy.model.node.prompt.style.extra.apparel;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum UniformType implements IPromptType {
    ADAPTED_UNIFORM("adapted_uniform", "改装制服"),
    ANZIO_MILITARY_UNIFORM("anzio_military_uniform", "安齐奥军服"),
    ANZIO_SCHOOL_UNIFORM("anzio_school_uniform", "安齐奥校服"),
    ARIA_COMPANY_UNIFORM("aria_company_uniform", "亚利亚公司制服"),
    ASHFORD_ACADEMY_UNIFORM("ashford_academy_uniform", "阿什福特学院制服"),
    BC_FREEDOM_MILITARY_UNIFORM("bc_freedom_military_uniform", "BC自由学园制服"),
    CHALDEA_UNIFORM("chaldea_uniform", "迦勒底制服"),
    CHI_HATAN_MILITARY_UNIFORM("chi-hatan_military_uniform", "知波单学院制服"),
    FLEUR_DE_LAPIN_UNIFORM("fleur_de_lapin_uniform", "点兔女仆装"),
    GARREG_MACH_MONASTERY_UNIFORM("garreg_mach_monastery_uniform", "加尔格·马可大修道院制服"),
    GEM_UNIFORM_HOUSEKI_NO_KUNI("gem_uniform_(houseki_no_kuni)", "宝石之国的制服"),
    HANASAKIGAWA_SCHOOL_UNIFORM("hanasakigawa_school_uniform", "花咲川女子学园"),
    HIKARIZAKA_PRIVATE_HIGH_SCHOOL_UNIFORM("hikarizaka_private_high_school_uniform", "私立光坂高等学校校服"),
    HOMURAHARA_ACADEMY_UNIFORM("homurahara_academy_uniform", "穗群原学园制服"),
    KAMIYAMA_HIGH_SCHOOL_UNIFORM("kamiyama_high_school_uniform", "神山高中校服"),
    KEIZOKU_MILITARY_UNIFORM("keizoku_military_uniform", "继续高中军服"),
    KITA_HIGH_SCHOOL_UNIFORM("kita_high_school_uniform", "北高中制服"),
    KIYOSUMI_SCHOOL_UNIFORM("kiyosumi_school_uniform", "清澄高中校服"),
    LUNA_NOVA_SCHOOL_UNIFORM("luna_nova_school_uniform", "鲁纳诺娃魔法学校校服"),
    MEIJI_SCHOOLGIRL_UNIFORM("meiji_schoolgirl_uniform", "明治女学生制服"),
    MITAKIHARA_SCHOOL_UNIFORM("mitakihara_school_uniform", "见泷原中学校制服"),
    NAMI_JUNIOR_HIGH_SCHOOL_UNIFORM("nami_junior_high_school_uniform", "波路中学校服"),
    NANAIROGAOKA_MIDDLE_SCHOOL_UNIFORM("nanairogaoka_middle_school_uniform", "七色丘中学校服"),
    NANAMORI_SCHOOL_UNIFORM("nanamori_school_uniform", "七森中学校服"),
    NAOETSU_HIGH_SCHOOL_UNIFORM("naoetsu_high_school_uniform", "私立直江津高校制服"),
    NATIONAL_SHIN_OOSHIMA_SCHOOL_UNIFORM("national_shin_ooshima_school_uniform", "新大岛学园校服"),
    OOARAI_MILITARY_UNIFORM("ooarai_military_uniform", "大洗联队军装"),
    OOARAI_SCHOOL_UNIFORM("ooarai_school_uniform", "大洗联队校服"),
    OTONOKIZAKA_SCHOOL_UNIFORM("otonokizaka_school_uniform", "国立音乃木坂学院女子制服"),
    PARADIS_MILITARY_UNIFORM("paradis_military_uniform", "帕拉迪岛军装"),
    POLAR_CHALDEA_UNIFORM("polar_chaldea_uniform", "极地迦勒底制服"),
    PRAVDA_MILITARY_UNIFORM("pravda_military_uniform", "真理学院军装"),
    PRAVDA_SCHOOL_UNIFORM("pravda_school_uniform", "真理学院校服"),
    RABBIT_HOUSE_UNIFORM("rabbit_house_uniform", "点兔兔之家制服"),
    RAIMON_SOCCER_UNIFORM("raimon_soccer_uniform", "雷门足球队服"),
    RYOUOU_SCHOOL_UNIFORM("ryouou_school_uniform", "陵樱学园制服"),
    SAILOR_SENSHI_UNIFORM("sailor_senshi_uniform", "美少女战士制服"),
    SAKUGAWA_SCHOOL_UNIFORM("sakugawa_school_uniform", "栅川中学校服"),
    SAKURAGAOKA_HIGH_SCHOOL_UNIFORM("sakuragaoka_high_school_uniform", "樱丘女子高等学校校服"),
    SAUNDERS_MILITARY_UNIFORM("saunders_military_uniform", "桑德斯军装"),
    SAUNDERS_SCHOOL_UNIFORM("saunders_school_uniform", "桑德斯附高校服"),
    SEISHOU_ELEMENTARY_SCHOOL_UNIFORM("seishou_elementary_school_uniform", "圣祥大附小学校校服"),
    SHINDA_SEKAI_SENSEN_UNIFORM("shinda_sekai_sensen_uniform", "死后世界战线制服"),
    SHUUCHIIN_ACADEMY_UNIFORM("shuuchiin_academy_uniform", "秀知院学园制服"),
    SHUUJIN_ACADEMY_UNIFORM("shuujin_academy_uniform", "秀尽学院制服"),
    ST_GLORIANAS_MILITARY_UNIFORM("st._gloriana's_military_uniform", "圣葛罗莉安娜军装"),
    ST_GLORIANAS_SCHOOL_UNIFORM("st._gloriana's_school_uniform", "圣葛罗莉安娜女学园校服"),
    STARLIGHT_ACADEMY_UNIFORM("starlight_academy_uniform", "星光学园制服"),
    TOKISADAME_SCHOOL_UNIFORM("tokisadame_school_uniform", "时定高校校服"),
    TOKIWADAI_SCHOOL_UNIFORM("tokiwadai_school_uniform", "常盘台中学校服"),
    TOMOEDA_ELEMENTARY_SCHOOL_UNIFORM("tomoeda_elementary_school_uniform", "友枝小学校服"),
    TSAB_GROUND_MILITARY_UNIFORM("tsab_ground_military_uniform", "时空管理局军服"),
    UA_SCHOOL_UNIFORM("u.a._school_uniform", "雄英高中校服"),
    URANOHOSHI_SCHOOL_UNIFORM("uranohoshi_school_uniform", "浦之星女学院校服"),
    YASOGAMI_SCHOOL_UNIFORM("yasogami_school_uniform", "八十神高中校服"),
    MISMATCHED_BIKINI("mismatched_bikini", "双色比基尼"),
    MULTICOLORED_BIKINI("multicolored_bikini", "多色款比基尼");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    UniformType(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
