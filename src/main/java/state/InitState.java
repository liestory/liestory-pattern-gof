package state;

/**
 * @author nemykin 15.11.2020
 */
public class InitState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Внесено денег  " + context.money);
        context.state = new ();
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        return null;
    }

    @Override
    public String chooseDocument(PrintContext printContext) {
        return null;
    }

    @Override
    public void printDocument(PrintContext printContext) {
    }

    @Override
    public void endPrint(PrintContext printContext) {
    }

}
