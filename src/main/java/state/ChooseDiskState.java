package state;

/**
 * @author nemykin 15.11.2020
 */
public class ChooseDiskState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        System.out.println("выбран диск " + printContext.disk);
        return printContext.disk;
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
