package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum WeaponType implements IPromptType {
    WEAPON("weapon", "武器", "weapon"),
    WEAPON_ON_BACK("weapon_on_back", "背上的武器", "weapon_on_back"),
    WEAPON_OVER_SHOULDER("weapon_over_shoulder", "肩上的武器", "weapon_over_shoulder"),
    HUGE_WEAPON("huge_weapon", "大尺寸武器", "huge_weapon"),
    PLANTED_WEAPON("planted_weapon", "往地上插的武器", "planted_weapon"),
    BROKEN_WEAPON("broken_weapon", "破碎的武器", "broken_weapon"),
    PLANTED_SWORD("planted_sword", "立剑(planted立", "planted_sword"),
    SWORD("sword", "刀", "sword"),
    SCABBARD("scabbard", "刀鞘", "scabbard"),
    UNSHEATHING("unsheathing", "出鞘", "unsheathing"),
    KATANA("katana", "武士刀", "katana"),
    SABER_WEAPON("saber_(weapon)", "军刀(武器)", "saber_(weapon)"),
    SCYTHE("scythe", "镰刀", "scythe"),
    NOSE_HATCHET("nose_hatchet", "柴刀", "nose_hatchet"),
    DAGGER("dagger", "匕首", "dagger"),
    SCISSORS("scissors", "剪刀", "scissors"),
    AXE("axe", "斧头", "axe"),
    HATCHET("hatchet", "短斧", "hatchet"),
    STAKE("stake", "棍子", "stake"),
    LANCE("lance", "长矛", "lance"),
    TRIDENT("trident", "三叉戟", "trident"),
    BOW_WEAPON("bow_(weapon)", "弓", "bow_(weapon)"),
    ARROW("arrow", "箭", "arrow"),
    CLAW_WEAPON("claw_(weapon)", "爪(武器)", "claw_(weapon)"),
    RIFLE("rifle,", "步枪", "rifle,"),
    GUN("gun", "枪", "gun"),
    HANDGUN("handgun", "手枪", "handgun"),
    THOMPSON_SUBMACHINE_GUN("thompson_submachine_gun", "汤普森冲锋枪", "thompson_submachine_gun"),
    MAGAZINE_WEAPON("magazine_(weapon)", "弹匣(武器)", "magazine_(weapon)"),
    DYNAMITE("dynamite", "甘油炸药", "dynamite"),
    BOMB("bomb", "炸弹", "bomb"),
    TRACK_MISSILES("track missiles", "跟踪导弹", "track missiles"),
    COMPLEX_TRAJECTORY("complex Trajectory", "轨迹拖尾", "complex Trajectory"),
    TANK("tank", "坦克", "tank"),
    CANNON("cannon", "大炮", "cannon"),
    MILITARY_VEHICLE("military_vehicle", "军用载具", "military_vehicle"),
    MOTORCYCLE("motorcycle", "摩托车", "motorcycle"),
    SHIP("ship", "船舶", "ship"),
    WATERCRAFT("watercraft", "船舶", "watercraft"),
    CAR("car", "汽车", "car"),
    MACHINE("machine", "机械", "machine"),
    MACHINERY("machinery", "机械武装", "machinery"),
    MECHANICAL_ARMS("mechanical_arms", "机械臂", "mechanical_arms"),
    MECHANIZATION("mechanization", "机械化", "mechanization"),
    ROBOT_EARS("robot_ears", "机械耳", "robot_ears"),
    ROBOT_JOINTS("robot_joints", "机械关节", "robot_joints"),
    VARIABLE_FIGHTER("variable_fighter", "超时空要塞机体", "variable_fighter"),
    SORCERERS_SUTRA_SCROLL("sorcerer's_sutra_scroll", "魔人经卷", "sorcerer's_sutra_scroll") ;
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    WeaponType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
