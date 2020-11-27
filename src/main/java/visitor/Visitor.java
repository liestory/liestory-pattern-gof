package visitor;

/**
 * @author nemykin 26.11.2020
 */
public abstract class Visitor {

    private String operationName;

    protected Visitor(String operationName) {
        this.operationName = operationName;
    }


    public abstract void visit(Rectangle rectangle, Integer x, Integer y);

    public abstract void visit(Triangle triangle, Integer x, Integer y);

    public abstract void visit(Square square, Integer x, Integer y);

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

}
