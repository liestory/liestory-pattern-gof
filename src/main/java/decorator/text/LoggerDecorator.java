package decorator.text;

/**
 * @author nemykin 19.10.2020
 */
public class LoggerDecorator extends DecodeTextDecorator {

    public LoggerDecorator(Message message) {
        super(message);
    }

    /**
     * @param message
     * @return
     */
    @Override
    public Message decodeMessage(Message message) {
        System.out.println("Началось закодирование текста ");
        return super.decodeMessage(message);
    }

    /**
     * @param message
     * @return
     */
    @Override
    public Message unCodeMessage(Message message) {
        System.out.println("Началось раскодирование текста ");
        return super.unCodeMessage(message);
    }
}
