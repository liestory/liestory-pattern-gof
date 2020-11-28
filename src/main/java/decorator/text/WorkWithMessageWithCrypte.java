package decorator.text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 28.11.2020
 */
public class WorkWithMessageWithCrypte implements WorkWithMessage {

    @Override
    public Message sendMessage(Message message) {
        System.out.println("Здесь отправлено crypto сообщение");
        Message messageRes = new Message();
        messageRes.setSender(decodeText(message.getSender()));
        messageRes.setText(decodeText(message.getText()));
        messageRes.setAddressee(decodeText(message.getAddressee()));
        return messageRes;
    }

    @Override
    public Message getMessage(Message message) {
        System.out.println("Здесь получено crypto сообщение");
        Message messageRes = new Message();
        messageRes.setSender(unCodeText(message.getSender()));
        messageRes.setText(unCodeText(message.getText()));
        messageRes.setAddressee(unCodeText(message.getAddressee()));
        return messageRes;
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
