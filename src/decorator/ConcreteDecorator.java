package decorator;

public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        this.doAdditionalOperation();
        this.component.doOperation();
    }

    @Override
    protected void doAdditionalOperation() {
        System.out.println("ConcreteDecorator do additional operation");
    }
}
