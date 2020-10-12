package builder;

/**
 * @author nemykin 12.10.2020
 */
public class Main {

    public static void main(String[] args) {
        runBuilder();
    }

    private static void runBuilder() {
        String check = new Email()
                .addSubject("заголовок")
                .addFrom("check@check.to")
                .addTo("to@check.to")
                .addCopy("copy1@check.to,copy2@check.to")
                .addContext("тело текста", "От сheck")
                .build();
        System.out.println(check);
    }
}
