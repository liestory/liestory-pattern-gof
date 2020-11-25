package chain.bancomat.banknote;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;
    private int deposit;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public boolean validate(String banknote, CurrencyType type) {
        return nextHandler != null && nextHandler.validate(banknote, type);
    }

    public String getCash(String banknote, CurrencyType type) {
        return nextHandler.getCash(banknote, type);
    }
}
