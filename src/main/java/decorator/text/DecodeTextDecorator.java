package decorator.text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 19.10.2020
 */
public class DecodeTextDecorator implements IDecodeText {

    private Message message;

    public DecodeTextDecorator( Message message) {
        this.message = message;
    }

    @Override
    public Message decodeMessage(Message message) {
        this.message.setSender(decodeText(message.getSender()));
        this.message.setText(decodeText(message.getText()));
        this.message.setAddressee(decodeText(message.getAddressee()));
        return this.message;
    }

    @Override
    public Message unCodeMessage(Message message) {
        this.message.setSender(unCodeText(message.getSender()));
        this.message.setText(unCodeText(message.getText()));
        this.message.setAddressee(unCodeText(message.getAddressee()));
        return this.message;
    }

    /**
     * вспомогательный метод для кодирования 1 элемента
     *
     * @param text
     * @return
     */
    private Map<String, String> decodeText(Map<String, String> text) {
        HashMap<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> textEntry : text.entrySet()) {
            if (textEntry.getValue().equals("") && textEntry.getKey().contains("Login:=")) {
                result.put(textEntry.getKey(), "########");
            } else {
                result.put(textEntry.getKey(), "");
            }
        }
        return result;
    }

    /**
     * вспомогательный метод для декодирования 1 элемента
     *
     * @param text
     * @return
     */
    private Map<String, String> unCodeText(Map<String, String> text) {
        HashMap<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> textEntry : text.entrySet()) {
            if (!textEntry.getValue().equals("########") && textEntry.getKey().contains("Login:=")) {
                result.put(textEntry.getKey(), "");
            } else {
                result.put(textEntry.getKey(), "########");
            }
        }
        return result;
    }

}
