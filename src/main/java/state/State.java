package state;

/**
 * @author nemykin 15.11.2020
 */
public interface State {

    void depositMoney(PrintContext printContext);

    String chooseDisk(PrintContext printContext);

    String chooseDocument(PrintContext printContext);

    void printDocument(PrintContext printContext);

    void endPrint(PrintContext printContext);

    int withdrawMoney(PrintContext printContext);
}
