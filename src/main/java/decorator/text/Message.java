package decorator.text;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nemykin 25.10.2020
 */

public class Message {
    private Map<String, String> sender;
    private Map<String, String> addressee;
    private Map<String, String> text;

    public Map<String, String> getSender() {
        return sender;
    }

    public void setSender(Map<String, String> sender) {
        this.sender = sender;
    }

    public Map<String, String> getAddressee() {
        return addressee;
    }

    public void setAddressee(Map<String, String> addressee) {
        this.addressee = addressee;
    }

    public Map<String, String> getText() {
        return text;
    }

    public void setText(Map<String, String> text) {
        this.text = text;
    }
}
