package hiforce.pixel.comfy.model.node.prompt.style.extra.thing;

import hiforce.pixel.comfy.model.node.prompt.IPromptType;
import lombok.Getter;

/**
 * @author Rocky Yu
 * @since 2023/11/1
 */
public enum StudyItemType implements IPromptType {
    NOTEBOOK("notebook", "笔记本", "notebook"),
    PAINTBRUSH("paintbrush", "画笔", "paintbrush"),
    PENCIL("pencil", "铅笔", "pencil"),
    BOOK("book", "书", "book"),
    OPEN_BOOK("open_book", "翻开的书", "open_book"),
    BOOK_STACK("book_stack", "书摞", "book_stack"),
    BOOKSHELF("bookshelf", "书架", "bookshelf"),
    SCHOOL_BAG("school_bag", "上学包(手提包", "school_bag"),
    BACKPACK("backpack", "背包", "backpack");
    @Getter
    private final String value;

    @Getter
    private final String valueCn;

    @Getter
    private final String imageUrl = null;

    @Getter
    private final String words;

    StudyItemType(String value, String valueCn, String words) {
        this.value = value;
        this.valueCn = valueCn;
        this.words = words;
    }
}
