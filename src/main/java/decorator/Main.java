package decorator;

import decorator.text.DecodeText;
import decorator.text.DecodeTextDecorator;
import decorator.text.IDecodeText;
import decorator.text.LoggerDecorator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 19.10.2020
 */
public class Main {
    public static void main(String[] args) {
        IDecodeText iDecodeText = new DecodeText();
        iDecodeText = new DecodeTextDecorator(iDecodeText);
        iDecodeText = new LoggerDecorator(iDecodeText);

        /**
         * кодирование
         */
        HashMap<String, String> input = new HashMap<>();

        input.put("Login:=Sveta", "");
        input.put("Hello sweety", "");


        HashMap<String, String> result1 = iDecodeText.decodeText(input);
        for (Map.Entry<String, String> entry: result1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /**
         * декодирвоание
         */
        HashMap<String, String> output = new HashMap<>();
        output.put("Login:=Luda", "########");
        output.put("And you hello", "########");
        HashMap<String, String> result2 = iDecodeText.unCodeText(output);
        for (Map.Entry<String, String> entry: result2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
