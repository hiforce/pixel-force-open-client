package hiforce.pixel.comfy.model.node.prompt.style.extra.shot;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum CloseUpShotType implements IPromptType {
    CLOSE_UP("close-up", "特写镜头", "close-up"),
    MACRO_SHOT("macro_shot", "微距镜头", "macro_shot"),
    INSET("inset", "插入其他镜头或图片", "inset"),
    CROSS_SECTION("cross-section", "剖面图", "cross-section"),
    X_RAY("x-ray", "X射线", "x-ray"),
    SOLO_FOCUS("solo_focus", "聚焦在单个人物(适合复杂场景)", "solo_focus"),
    XX_FOCUS("xx_focus", "聚焦在xx上", "xx_focus"),
    FACE_FOCUS("face_focus", "聚焦在面部", "face_focus"),
    EYES_FOCUS("eyes_focus", "聚焦在眼睛", "eyes_focus"),
    FOOT_FOCUS("foot_focus", "聚焦在脚上", "foot_focus"),
    HIP_FOCUS("hip_focus", "聚焦在臀部", "hip_focus"),
    ASS_FOCUS("ass_focus", "聚焦在屁股上", "ass_focus"),
    VEHICLE_FOCUS("vehicle_focus", "聚焦在载具上", "vehicle_focus"),
    BETWEEN_LEGS("between_legs", "(强调)两腿之间", "between_legs"),
    BETWEEN_BREASTS("between_breasts", "(突出)胸部", "between_breasts"),
    BETWEEN_FINGERS("between_fingers", "(突出)指间", "between_fingers"),
    PEEKING("peeking", "偷窥", "peeking"),
    PEEKING_OUT("peeking_out", "偷窥(的姿态)", "peeking_out"),
    PEEPING("peeping", "偷窥(强调视角)", "peeping"),
    MIDRIFF_PEEK("midriff_peek", "肚脐偷看", "midriff_peek"),
    ARMPIT_PEEK("armpit_peek", "腋窝偷看", "armpit_peek"),
    PUSSY_PEEK("pussy_peek", "浦西偷看", "pussy_peek"),
    PANTY_PEEK("panty_peek", "内裤偷看", "panty_peek"),
    PANTYSHOT("pantyshot", "内裤走光", "pantyshot"),
    CAUGHT("caught", "被抓现行", "caught");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    CloseUpShotType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
