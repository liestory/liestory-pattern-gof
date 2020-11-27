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

    @Override
    public String getCash(String banknote, CurrencyType type) {
        int deposit = Integer.parseInt(banknote);
        while (deposit >= getValue() && validate(String.valueOf(getValue()), type)) {
            System.out.println("Выдаем купюру " + getValue() + " " + type.name());
            deposit = deposit - getValue();
        }
        if (deposit > 0 && deposit < 100 && validate("100", type)) {
            System.out.println("Не валидная сумма для выдачи");
            return null;
        }
        if (deposit == 0) {
            System.out.println("Валидная сумма для выдачи");
            return null;
        }
        return super.getCash(String.valueOf(deposit), type);
    }

    protected abstract int getValue();

    protected abstract CurrencyType currencyType();
}
