package chain.bancomat;

import chain.bancomat.banknote.CurrencyType;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author nemykin 02.11.2020
 */
public class ValidateDeposit {

    /**
     * общая валидация купюр
     *
     * @param deposit - {@key - наминал купюры,@value - колличество даанных купюр }
     * @return
     */
    public Map<Integer, Integer> validateDeposit(String deposit) {
        List<String> depositList = Stream.of(deposit.split(" "))
                .collect(Collectors.toList());
        CurrencyType currencyType = checkCurrency(depositList.get(1));
        return countingBanknotes(Integer.parseInt(depositList.get(0)), currencyType);
    }

    /**
     * вспомогательное действие для подсчета купюр искомого значения в сумме
     * TODO: не понимаю как мне взять список наминала купюр по другому.
     * TODO: создал конструктор к валютам и получаю наминалы купюр оттуда.
     *
     * @param deposit
     * @return
     */
    @SneakyThrows
    private Map<Integer, Integer> countingBanknotes(int deposit, CurrencyType type) {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> integerList = type.getDenominationBanknotesList();
        for (int i : integerList) {
            if (deposit > i) {
                Double res = Math.floor(deposit / i);
                result.put(i, res.intValue());
                deposit = deposit - res.intValue() * i;
            } else if (deposit == 0) {
                break;
            }
        }
        if (deposit > 0)
            result.put(99, deposit);
        return result;
    }

    /**
     * вспомогательный метод определения валюты
     *
     * @param depositCurrencyText
     * @return
     */
    public CurrencyType checkCurrency(String depositCurrencyText) {
        CurrencyType resultType;
        switch (depositCurrencyText.toLowerCase()) {
            case "руб":
                resultType = CurrencyType.RUB;
                break;
            case "рубль":
                resultType = CurrencyType.RUB;
                break;
            case "rub":
                resultType = CurrencyType.RUB;
                break;
            case "$":
                resultType = CurrencyType.USD;
                break;
            case "доллар":
                resultType = CurrencyType.USD;
                break;
            case "usd":
                resultType = CurrencyType.USD;
                break;
            case "евро":
                resultType = CurrencyType.USD;
                break;
            case "eur":
                resultType = CurrencyType.EUR;
                break;
            default:
                resultType = null;
        }
        return resultType;
    }
}
