package chain.bancomat.dollar;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenDollarHandler extends DollarHandlerBase {

    protected int value = 10;

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

    @Override
    protected CurrencyType currencyType() {
        return CurrencyType.USD;
    }
}
