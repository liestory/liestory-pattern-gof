package visitor;

/**
 * @author nemykin 26.11.2020
 */
public interface Visitor {

    String visitRectangle(Rectangle rectangle);

    String visitTriangle(Triangle triangle);

    String visitCircle(Square square);
}
