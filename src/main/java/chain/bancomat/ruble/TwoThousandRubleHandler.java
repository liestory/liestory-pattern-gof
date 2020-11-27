package chain.bancomat.ruble;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;

/**
 * @author nemykin 02.11.2020
 */
public class TwoThousandRubleHandler extends RubleHandlerBase {

    protected int value = 2000;

    public TwoThousandRubleHandler(BanknoteHandler nextHandler) {
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
