package visitor.doubleDispatch;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElement concreteElement) {
        System.out.println("ConcreteVisitor visit ConcreteElement: " + concreteElement);
    }

    @Override
    public void visit(OtherConcreteElement otherConcreteElement) {
        System.out.println("ConcreteVisitor visit OtherConcreteElement: " + otherConcreteElement);
    }
}
