package decorator.text;

/**
 * @author nemykin 28.11.2020
 */
public abstract class WorkWithMessageDecorator implements WorkWithMessage {

    protected WorkWithMessage workWithMessage;

    public WorkWithMessageDecorator(WorkWithMessage workWithMessage) {
        this.workWithMessage = workWithMessage;
    }

    @Override
    public Message sendMessage(Message message) {
        return workWithMessage.sendMessage(message);
    }

    @Override
    public Message getMessage(Message message) {
        return workWithMessage.getMessage(message);
    }
}
