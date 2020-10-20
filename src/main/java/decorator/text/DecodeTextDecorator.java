package decorator.text;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 19.10.2020
 */
public class DecodeTextDecorator implements IDecodeText {
    protected IDecodeText iDecodeText;

    public DecodeTextDecorator(IDecodeText iDecodeText) {
        this.iDecodeText = iDecodeText;
    }

    @Override
    public HashMap<String, String> decodeText(HashMap<String, String> text) {
        return iDecodeText.decodeText(beforeDecodeTextByLogin(text));
    }

    @Override
    public HashMap<String, String> unCodeText(HashMap<String, String> text) {
        return iDecodeText.decodeText(beforeUnCodeTextByLogin(text));
    }

    protected HashMap<String, String> beforeDecodeTextByLogin(HashMap<String, String> text) {
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

    protected HashMap<String, String> beforeUnCodeTextByLogin(HashMap<String, String> text) {
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
