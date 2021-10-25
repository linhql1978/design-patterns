package visitor.doubleDispatch;

public interface Visitor {
    void visit(ConcreteElement concreteElement);
    void visit(OtherConcreteElement otherConcreteElement);
}
