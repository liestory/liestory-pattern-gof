package visitor;

/**
 * @author nemykin 27.11.2020
 */
public class Rectangle extends VisitorPainter {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor, Integer x, Integer y) {
        visitor.visit(this, x, y);
    }
}
