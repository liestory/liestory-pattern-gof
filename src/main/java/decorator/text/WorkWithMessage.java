package decorator.text;

/**
 * @author nemykin 31.10.2020
 */
public interface WorkWithMessage {
    /**
     * отправить сообщение
     * @param message
     * @return
     */
    Message sendMessage(Message message);

    /**
     * получить сообщение
     * @param message
     * @return
     */
    Message getMessage(Message message);
}
