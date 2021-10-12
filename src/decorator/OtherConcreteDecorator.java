package decorator;

public class OtherConcreteDecorator extends Decorator{

    public OtherConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        this.component.doOperation();
        this.doAdditionalOperation();
    }

    @Override
    protected void doAdditionalOperation() {
        System.out.println("OtherConcreteDecorator do additional operation");
    }
}
