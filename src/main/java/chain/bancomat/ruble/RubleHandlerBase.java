package chain.bancomat.ruble;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * @author nemykin 02.11.2020
 */
public abstract class RubleHandlerBase extends BanknoteHandler {
    protected RubleHandlerBase(BanknoteHandler nextHandler) {
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
