package visitor;

/**
 * @author nemykin 26.11.2020
 */
public class Square implements Painter {
    private Integer x;
    private Integer y;

    public Square() {
    }

    public Square(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        if (x == y) {
            setX(x);
            setY(y);
            this.y = y;
            System.out.println("Рисую квадрат размером " + this.x + " на " + this.y);
        }
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
        return visitor.visitCircle(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
