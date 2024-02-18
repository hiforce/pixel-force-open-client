package hiforce.pixel.comfy.model.node.prompt;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public interface IPromptGroup {

    String getText();

    String getTextCn();

    default Class<? extends IPromptType> getTypeClass() {
        return null;
    }

    default IPromptType[] getPromptTypes() {
        return getTypeClass().getEnumConstants();
    }
}
