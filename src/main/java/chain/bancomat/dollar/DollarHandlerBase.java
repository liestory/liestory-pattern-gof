package chain.bancomat.dollar;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class DollarHandlerBase extends BanknoteHandler {
    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(String banknote, CurrencyType type) {
        if (banknote.equals(String.valueOf(getValue())) && type == currencyType()) {
            return true;
        }
        return super.validate(banknote, type);
    }

    protected abstract int getValue();

    protected abstract CurrencyType currencyType();
}
