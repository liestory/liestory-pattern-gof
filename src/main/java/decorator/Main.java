package decorator;

import decorator.text.Message;
import decorator.text.WorkWithMessageWithCrypte;
import decorator.text.WothWithMessageClear;

import java.util.AbstractMap;
import java.util.Map;

/**
 * @author nemykin 19.10.2020
 */
public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setSender(Map.ofEntries(new AbstractMap.SimpleEntry<String, String>("Login:=Sveta", "")));
        message.setAddressee(Map.ofEntries(new AbstractMap.SimpleEntry<String, String>("Login:=Luda", "")));
        message.setText(Map.ofEntries(new AbstractMap.SimpleEntry<String, String>("Hello sweety", "")));
        WothWithMessageClear wothWithMessageClear = new WothWithMessageClear(new WorkWithMessageWithCrypte());

        Message result1;
        result1 = wothWithMessageClear.getMessage(message);
        System.out.println("result:= "+ result1.getText());
        result1 = wothWithMessageClear.sendMessage(message);
        System.out.println("result:= "+ result1.getText());

    }
}
