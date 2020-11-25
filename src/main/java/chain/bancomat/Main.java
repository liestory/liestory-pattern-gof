package chain.bancomat;

import chain.bancomat.banknote.CurrencyType;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        //значения
        String depositRuble1 = "2050"; //невалидное значение
        String depositRuble2 = "3300"; //валидное значение
        String depositRuble3 = "3300"; //валидное значение
        // объявления
        Bancomat bancomat = new Bancomat();
        // depositRuble1
        System.out.println("Выдаем сумму " + depositRuble1 + " " + CurrencyType.RUB);
        System.out.println("Выдаем сумму " + depositRuble2 + " " + CurrencyType.RUB);
        System.out.println("Выдаем сумму " + depositRuble3 + " " + CurrencyType.USD);
        bancomat.validate(bancomat.getCash(depositRuble1, CurrencyType.RUB), CurrencyType.RUB);
        bancomat.validate(bancomat.getCash(depositRuble2, CurrencyType.RUB), CurrencyType.RUB);
        bancomat.validate(bancomat.getCash(depositRuble3, CurrencyType.USD), CurrencyType.USD);
    }
}
