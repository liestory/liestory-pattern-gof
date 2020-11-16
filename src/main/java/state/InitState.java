package state;

/**
 * @author nemykin 15.11.2020
 */
public class InitState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Внесено денег  " + context.money);
        context.state = new ChooseDiskState();
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        throw new RuntimeException("Workflow is wrong");
    }

    @Override
    public String chooseDocument(PrintContext printContext) {
        throw new RuntimeException("Workflow is wrong");
    }

    @Override
    public void printDocument(PrintContext printContext) {
        throw new RuntimeException("Workflow is wrong");
    }

    @Override
    public void endPrint(PrintContext printContext) {
        throw new RuntimeException("Workflow is wrong");
    }
}
