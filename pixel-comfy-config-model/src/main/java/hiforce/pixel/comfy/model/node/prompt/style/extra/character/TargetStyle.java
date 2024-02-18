package hiforce.pixel.comfy.model.node.prompt.style.extra.character;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public enum TargetStyle implements IPromptType {
    GIRL("girl", "女孩"),
    FEMALE("female", "女性"),
    MALE("male", "男性"),
    MATURE_FEMALE("mature_female", "成熟女性"),
    ONE_GIRL("1girl", "1女孩"),
    TWO_GIRL("2girl", "2女孩"),
    THREE_GIRL("3girl", "3女孩"),
    MULTI_GIRL("multiple_girls", "多个女孩"),
    LITTLE_GIRL("little_girl", "小女孩"),
    BOY("boy", "男孩"),
    ONE_BOY("1boy", "1男孩"),
    TWO_BOY("2boy", "2男孩"),
    THREE_BOY("3boy", "3男孩"),
    LITTLE_BOY("little_boy", "小男孩"),
    SOLO("solo", "单人"),
    SHOTA("shota", "正太"),
    LOLI("loli", "萝莉"),
    KAWAII("kawaii", "可爱"),
    MESUGAKI("mesugaki", "雌小鬼"),
    ADORABLE_GIRL("adorable_girl", "可爱的女孩"),
    BISHOUJO("bishoujo", "美少女"),
    GYARU("gyaru", "辣妹"),
    SISTERS("sisters", "姐妹"),
    OJOUSAMA("ojousama", "大小姐"),
    MATURE("mature", "成熟"),
    FEMALE_PERVERT("female_pervert", "痴女"),
    MILF("milf", "熟女"),
    OTOKO_NO_KO("otoko_no_ko", "伪娘"),
    CROSSDRESSING("crossdressing", "异装伪娘");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    TargetStyle(String value, String valueCn) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = value;
    }
}
