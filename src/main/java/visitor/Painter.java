package visitor;

/**
 * @author nemykin 26.11.2020
 */
public interface Painter {
    void draw(int x, int y);

    Double getArea();

    Double getPerimetr();

    String anything(Visitor visitor);
}
