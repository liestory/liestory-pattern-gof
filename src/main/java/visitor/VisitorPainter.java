package visitor;

/**
 * @author nemykin 27.11.2020
 */
public abstract class VisitorPainter {

    private String name;

    public VisitorPainter(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor, Integer x, Integer y);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
