package state;

/**
 * @author nemykin 15.11.2020
 */
public abstract class StateBase implements State {

    @Override
    public abstract void depositMoney(PrintContext printContext);

    @Override
    public abstract String chooseDisk(PrintContext printContext);

    @Override
    public abstract String chooseDocument(PrintContext printContext);

    @Override
    public abstract void printDocument(PrintContext printContext);

    @Override
    public abstract void endPrint(PrintContext printContext);

    @Override
    public void withdrawMoney(PrintContext printContext) {
        printContext.money = printContext.money - (printContext.countPrint * PrintContext.COST_PAGE);
        System.out.println("Деньги возвращены " + printContext.money);
    }
}
