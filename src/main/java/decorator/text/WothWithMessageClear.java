package decorator.text;

/**
 * @author nemykin 31.10.2020
 */
public class WothWithMessageClear extends WorkWithMessageDecorator {

    public WothWithMessageClear(WorkWithMessage workWithMessage) {
        super(workWithMessage);
    }

    @Override
    public Message sendMessage(Message message) {
        System.out.println("Здесь отправлено чистое сообщение");
        return super.sendMessage(message);
    }

    @Override
    public Message getMessage(Message message) {
        System.out.println("Здесь получено чистое сообщение");
        return super.getMessage(message);
    }
}
