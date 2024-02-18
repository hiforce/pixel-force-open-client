package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum DigitalEquipmentType implements IPromptType {
    COMPUTER("computer", "电脑", "computer"),
    MOUSE("mouse", "鼠标", "mouse"),
    CELLPHONE("cellphone", "手机", "cellphone"),
    SMARTPHONES("Smartphones", "智能手机", "Smartphones"),
    HANDHELD_GAME_CONSOLE_("handheld_game_console_", "掌上游戏机", "handheld_game_console_"),
    NINTENDO_3DS("nintendo_3ds", "任天堂3ds", "nintendo_3ds"),
    NINTENDO_DS("nintendo_ds", "任天堂ds", "nintendo_ds"),
    NINTENDO_SWITCH("nintendo_switch", "任天堂switch", "nintendo_switch"),
    BUTTONS("buttons", "按钮", "buttons"),
    POWER_LINES("power_lines", "电源线", "power_lines"),
    CABLE("cable", "电缆", "cable");

    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    DigitalEquipmentType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
