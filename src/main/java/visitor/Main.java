package visitor;

/**
 * @author nemykin 26.11.2020
 */
public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        Painter[] painters = {new Square(), new Triangle(), new Rectangle()};
        for (Painter painter : painters) {
            // сюда не должен попасть квадрат, тк проверку не пройдет.
            // Но если исправить значение на равное, все увидим
            painter.draw(x, y);
            painter.getArea();
            painter.getPerimetr();
        }
    }
}
