package chain.bancomat.banknote;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(String banknote, CurrencyType type) {
        return nextHandler != null && nextHandler.validate(banknote, type);
    }
}
