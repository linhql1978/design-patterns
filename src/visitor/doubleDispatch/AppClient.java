package visitor.doubleDispatch;

public class AppClient {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Element concreteElement = new ConcreteElement();
        Element otherConcreteElement = new OtherConcreteElement();

        concreteElement.accept(visitor);
        otherConcreteElement.accept(visitor);
    }
}
