package state;

/**
 * @author nemykin 16.11.2020
 */
public class ChooseDocumentState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
        throw new RuntimeException("Workflow is wrong");
    }

    @Override
    public String chooseDisk(PrintContext printContext) {
        throw new RuntimeException("Workflow is wrong");
    }

    @Override
    public String chooseDocument(PrintContext printContext) {
        System.out.println("Выбран документ " + printContext.document);
        return printContext.document;
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
