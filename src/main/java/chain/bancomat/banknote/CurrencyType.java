package chain.bancomat.banknote;

import java.util.Arrays;
import java.util.List;

/**
 * CurrencyType.
 *
 * @author Ilya_Sukhachev
 */
public enum CurrencyType {
    EUR(Arrays.asList(100, 50, 10)),
    USD(Arrays.asList(10)),
    RUB(Arrays.asList(5000, 2000, 1000, 500, 200, 100));

    List<Integer> denominationBanknotesList;

    CurrencyType(List<Integer> denominationBanknotesList) {
        this.denominationBanknotesList = denominationBanknotesList;
    }

    public List<Integer> getDenominationBanknotesList() {
        return denominationBanknotesList;
    }
}
