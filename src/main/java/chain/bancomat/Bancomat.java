package chain.bancomat;

import chain.bancomat.banknote.BanknoteHandler;
import chain.bancomat.banknote.CurrencyType;
import chain.bancomat.dollar.FiftyDollarHandler;
import chain.bancomat.dollar.HundredDollarHandler;
import chain.bancomat.dollar.TenDollarHandler;
import chain.bancomat.ruble.FiveHundredRubleHandler;
import chain.bancomat.ruble.FiveThousandRubleHandler;
import chain.bancomat.ruble.HundredRubleHandler;
import chain.bancomat.ruble.ThousandRubleHandler;
import chain.bancomat.ruble.TwoHundredRubleHandler;
import chain.bancomat.ruble.TwoThousandRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        // доллары
        handler = new HundredDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new TenDollarHandler(handler);
        //рубли
        handler = new FiveThousandRubleHandler(handler);
        handler = new TwoThousandRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
        handler = new FiveHundredRubleHandler(handler);
        handler = new TwoHundredRubleHandler(handler);
        handler = new HundredRubleHandler(handler);

    }

    public boolean validate(String banknote, CurrencyType type) {
        return handler.validate(banknote, type);
    }

}
