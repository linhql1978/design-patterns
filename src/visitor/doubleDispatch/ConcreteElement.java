package visitor.doubleDispatch;

public class ConcreteElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
