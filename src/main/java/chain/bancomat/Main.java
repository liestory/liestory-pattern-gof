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
        System.out.println("Запрос суммы " + depositRuble1 + " " + CurrencyType.RUB);
        bancomat.getCash(depositRuble1, CurrencyType.RUB);
        System.out.println("Запрос суммы " + depositRuble2 + " " + CurrencyType.RUB);
        bancomat.getCash(depositRuble2, CurrencyType.RUB);
        System.out.println("Запрос суммы " + depositRuble3 + " " + CurrencyType.USD);
        bancomat.getCash(depositRuble3, CurrencyType.USD);
    }
}
