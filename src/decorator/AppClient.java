package decorator;

public class AppClient {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.doOperation();

        Component concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.doOperation();

        Component otherConcreteDecorator = new OtherConcreteDecorator(concreteComponent);
        otherConcreteDecorator.doOperation();
    }
}
