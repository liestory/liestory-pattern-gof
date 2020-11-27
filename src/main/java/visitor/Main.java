package visitor;

/**
 * @author nemykin 26.11.2020
 */
public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        VisitorPainter[] painters = {new Square("квадрат"),
                new Triangle("треугольник"),
                new Rectangle("прямоугольник")};
        DrawVisitor drawVisitor = new DrawVisitor("рисовать");
        AreaVisitor areaVisitor = new AreaVisitor("площадь");
        PerimetrVisitor perimetrVisitor = new PerimetrVisitor("периметр");
        for (VisitorPainter painter : painters) {
            painter.accept(drawVisitor, x, y);
            painter.accept(areaVisitor, x, y);
            painter.accept(perimetrVisitor, x, y);
        }

    }
}
