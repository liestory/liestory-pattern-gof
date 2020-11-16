package state;

/**
 * @author nemykin 16.11.2020
 */
public class ErrorState extends StateBase {

    @Override
    public void depositMoney(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }

    @Override
    public String chooseDocument(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }

    @Override
    public void printDocument(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }

    @Override
    public void endPrint(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }

    @Override
    public void withdrawMoney(PrintContext printContext) {
        throw new RuntimeException("It's error");
    }
}
