package chain.bancomat.ruble;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * @author nemykin 02.11.2020
 */
public class TwoHundredRubleHandler extends RubleHandlerBase {
    protected int value = 200;

    public TwoHundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }

    @Override
    protected CurrencyType currencyType() {
        return CurrencyType.RUB;
    }
}
