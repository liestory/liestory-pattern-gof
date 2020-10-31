package decorator.text;

/**
 * @author nemykin 31.10.2020
 */
public class WothWithMessageImpl extends LoggerDecorator implements WorkWithMessage {
    public WothWithMessageImpl(Message message) {
        super(message);
    }

    @Override
    public Message sendMessage(Message message) {
        return super.decodeMessage(message);
    }

    @Override
    public Message getMessage(Message message) {
        return super.unCodeMessage(message);
    }
}
