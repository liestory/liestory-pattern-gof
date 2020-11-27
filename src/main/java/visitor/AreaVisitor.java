package visitor;

/**
 * @author nemykin 27.11.2020
 */
public class AreaVisitor extends Visitor {

    protected AreaVisitor(String operationName) {
        super(operationName);
    }

    @Override
    public void visit(Rectangle rectangle, Integer x, Integer y) {
        System.out.println("Area " + rectangle.getName() + ":= " + (x * y));
    }

    @Override
    public void visit(Triangle triangle, Integer x, Integer y) {
        System.out.println("Area " + triangle.getName() + ":= " + Math.sqrt(x * x + y * y));
    }

    @Override
    public void visit(Square square, Integer x, Integer y) {
        System.out.println("Area " + square.getName() + ":= " + (x * y));
    }
}
