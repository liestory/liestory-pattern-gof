package visitor;

/**
 * @author nemykin 27.11.2020
 */
public class Square extends VisitorPainter {
    public Square(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor, Integer x, Integer y) {
        visitor.visit(this, x, y);
    }

}
