package visitor;

/**
 * @author nemykin 27.11.2020
 */
public class PerimetrVisitor extends Visitor {

    protected PerimetrVisitor(String operationName) {
        super(operationName);
    }

    @Override
    public void visit(Rectangle rectangle, Integer x, Integer y) {
        System.out.println("Perimetr " + rectangle.getName() + ":= " + (x + y));
    }

    @Override
    public void visit(Triangle triangle, Integer x, Integer y) {
        System.out.println("Perimetr " + triangle.getName() + ":= " + (x + y));
    }

    @Override
    public void visit(Square square, Integer x, Integer y) {
        System.out.println("Perimetr " + square.getName() + ":= " + (x + y));
    }
}
