package state;

/**
 * @author nemykin 15.11.2020
 */
public class PrintContext {

    public static final int COST_PAGE = 10;
    public int money;
    public String disk;
    public String document;
    public int countPrint;
    public State state;

    public PrintContext(int money, String disk, String document, int countPrint, State state) {
        this.money = money;
        this.disk = disk;
        this.document = document;
        this.countPrint = countPrint;
        this.state = new InitState();
    }

    public void depositMoney() {
        state.depositMoney(this);
    }

    public String chooseDisk() {
        return state.chooseDisk(this);
    }

    public String chooseDocument() {
        return state.chooseDocument(this);
    }

    public void printDocument() {
        state.printDocument(this);
    }

    public void endPrint() {
        state.endPrint(this);
    }

    public void withdrawMoney(PrintContext printContext) {
        state.withdrawMoney(this);
    }
}
