package state;

/**
 * @author nemykin 16.11.2020
 */
public class WithdrawMoneyState extends StateBase {
    @Override
    public void depositMoney(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }

    @Override
    public String chooseDocument(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }

    @Override
    public void printDocument(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }

    @Override
    public void endPrint(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }

    @Override
    public void withdrawMoney(PrintContext printContext) {
        throw new RuntimeException("Возвращено " + printContext.money + " денег из-за ошибки");
    }
}
