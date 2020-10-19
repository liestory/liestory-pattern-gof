package decorator.text;

import java.util.HashMap;

/**
 * @author nemykin 19.10.2020
 */
public class LoggerDecorator extends DecodeTextDecorator {

    public LoggerDecorator(IDecodeText iDecodeText) {
        super(iDecodeText);
    }

    /**
     * @param text
     * @return
     */
    @Override
    public HashMap<String, String> decodeText(HashMap<String, String> text) {
        System.out.println("Началось закодирование текста ");
        return super.decodeText(text);
    }

    /**
     * @param text
     * @return
     */
    @Override
    public HashMap<String, String> unCodeText(HashMap<String, String> text) {
        System.out.println("Началось раскодирование текста ");
        return super.unCodeText(text);
    }

    @Override
    protected HashMap<String, String> beforeDecodeTextByLogin(HashMap<String, String> text) {
        System.out.println("Закодирование заголовка");
        return super.beforeDecodeTextByLogin(text);
    }

    @Override
    protected HashMap<String, String> beforeUnCodeTextByLogin(HashMap<String, String> text) {
        System.out.println("Раскодирование заголовка");
        return super.beforeUnCodeTextByLogin(text);
    }

}
