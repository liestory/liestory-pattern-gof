package decorator;

import decorator.text.Message;

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
        /**TODO:  я не могу корректно собрать в цепочку для проверки.
         * хотя я вроде делаю все верно. Прошу подсказать, где я нарушил логику.
         */
//        IDecodeText iDecodeText =
//
//        Message resultSend = new WorkWithMessage(message).sendMessage(new LoggerDecorator())
        /**
         * кодирование
         */
        /**
         * декодирвоание
         */
//        HashMap<String, String> output = new HashMap<>();
//        output.put("Login:=Luda", "########");
//        output.put("And you hello", "########");
//        HashMap<String, String> result2 = iDecodeText.unCodeMessage(output);
//        for (Map.Entry<String, String> entry: result2.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
    }
}
