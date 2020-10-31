package decorator.text;

import java.util.HashMap;

/**
 * @author nemykin 19.10.2020
 */
public interface IDecodeText {

    /**
     * кодирование сообщений
     * @param message
     * @return
     */
    Message decodeMessage(Message message);

    /**
     * декодирование сообщений
     * @param message
     * @return
     */
    Message unCodeMessage(Message message);


}
