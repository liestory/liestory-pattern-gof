package chain.bancomat.dollar;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class FiftyDollarHandler extends DollarHandlerBase {

    protected int value = 50;


    public FiftyDollarHandler(BanknoteHandler nextHandler) {
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
