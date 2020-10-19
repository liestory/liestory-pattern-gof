package decorator.text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 19.10.2020
 */
public class DecodeText implements IDecodeText {

    @Override
    public HashMap<String, String> decodeText(HashMap<String, String> text) {
        HashMap<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> textEntry : text.entrySet()) {
            if (!textEntry.getValue().equals("")) {
                result.put(textEntry.getKey(), "########");
                System.out.println(textEntry.getKey() + " c парамметром " + result.get(textEntry));
            }
        }
        return result;
    }

    @Override
    public HashMap<String, String> unCodeText(HashMap<String, String> text) {
        HashMap<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> textEntry : text.entrySet()) {
            if (textEntry.getValue().equals("########")) {
                result.put(textEntry.getKey(), "");
                System.out.println(textEntry.getKey() + " c парамметром " + result.get(textEntry));
            }
        }
        return result;
    }

}
