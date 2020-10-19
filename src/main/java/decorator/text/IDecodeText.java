package decorator.text;

import java.util.HashMap;

/**
 * @author nemykin 19.10.2020
 */
public interface IDecodeText {

    /**
     *
     * @param text
     * @return
     */
    HashMap<String, String> decodeText(HashMap<String, String> text);

    /**
     *
     * @param text
     * @return
     */
    HashMap<String, String> unCodeText(HashMap<String, String> text);


}
