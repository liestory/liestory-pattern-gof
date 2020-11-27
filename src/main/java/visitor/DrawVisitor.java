package visitor;

/**
 * @author nemykin 27.11.2020
 */
public class DrawVisitor extends Visitor {

    protected DrawVisitor(String operationName) {
        super(operationName);

    }

    @Override
    public void visit(Rectangle rectangle, Integer x, Integer y) {
        System.out.println("Рисую прямоугольник размером " + x + " на " + y);
    }

    @Override
    public void visit(Triangle triangle, Integer x, Integer y) {
        System.out.println("Рисуем квадратный треуголник с катетами " + x + " и " + y);
    }

    @Override
    public void visit(Square square, Integer x, Integer y) {
        System.out.println("Рисую квадрат размером " + x + " на " + y);
    }
}
