package visitor;

/**
 * @author nemykin 26.11.2020
 */
public class Triangle implements Painter {
    private Integer x;
    private Integer y;

    public Triangle() {
    }

    public Triangle(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        setX(x);
        setY(y);
        System.out.println("Рисуем квадратный треуголник с катетами " + this.x + " и " + this.y);
    }

    @Override
    public Double getArea() {
        if (x != null && y != null) {
            return Math.sqrt(x * x + y * y);
        }
        return null;
    }

    @Override
    public Double getPerimetr() {
        if (x != null && y != null) {
            return Double.valueOf((y * x) / 2);
        }
        return null;
    }

    @Override
    public String anything(Visitor visitor) {
        return visitor.visitTriangle(this);
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
