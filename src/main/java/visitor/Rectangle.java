package visitor;

/**
 * @author nemykin 26.11.2020
 */
public class Rectangle implements Painter {
    private Integer x;
    private Integer y;

    public Rectangle() {
    }

    public Rectangle(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        setX(x);
        setY(y);
        this.y = y;
        System.out.println("Рисую прямоугольник размером " + this.x + " на " + this.y);
    }

    @Override
    public Double getArea() {
        if (x == y && x != null && y != null) {
            return Double.valueOf(x * y);
        }
        return null;
    }

    @Override
    public Double getPerimetr() {
        if (x == y && x != null && y != null) {
            return Double.valueOf(x + y);
        }
        return null;
    }

    @Override
    public String anything(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
