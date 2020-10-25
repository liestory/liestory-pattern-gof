package decorator.text;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nemykin 25.10.2020
 */
@Getter
@Setter
public class Message {
    private String sender;
    private String addressee;
    private String text;
}
