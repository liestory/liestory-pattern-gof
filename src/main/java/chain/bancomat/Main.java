package chain.bancomat;

import java.util.Map;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        //значения
        //TODO: на невалидном значении не падает.
        String depositRuble1 = "2050 rub"; //невалидное значение
        String depositRuble2 = "3300 rub"; //валидное значение
        String depositRuble3 = "3300 $"; //валидное значение
        // объявления
        ValidateDeposit validateDeposit = new ValidateDeposit();
        Bancomat bancomat = new Bancomat();
        // depositRuble1
        System.out.println("Выдаем сумму " + depositRuble1);
        Map<Integer, Integer> deposit1 = validateDeposit.validateDeposit(depositRuble1);
        for (Map.Entry<Integer, Integer> item : deposit1.entrySet()) {
            bancomat.validate(item.getKey().toString(), validateDeposit.checkCurrency(depositRuble1));
            System.out.println("купюр " + item.getKey() + " " + item.getValue() + " колличество");
        }

        // depositRuble2
        System.out.println("Выдаем сумму " + depositRuble2);
        Map<Integer, Integer> deposit2 = validateDeposit.validateDeposit(depositRuble2);
        for (Map.Entry<Integer, Integer> item : deposit2.entrySet()) {
            bancomat.validate(item.getKey().toString(), validateDeposit.checkCurrency(depositRuble2));
            System.out.println("купюр " + item.getKey() + " " + item.getValue() + " колличество");
        }

        // depositRuble3
        System.out.println("Выдаем сумму " + depositRuble3);
        Map<Integer, Integer> deposit3 = validateDeposit.validateDeposit(depositRuble3);
        for (Map.Entry<Integer, Integer> item : deposit3.entrySet()) {
            bancomat.validate(item.getKey().toString(), validateDeposit.checkCurrency(depositRuble3));
            System.out.println("купюр " + item.getKey() + " " + item.getValue() + " колличество");
        }
    }
}
