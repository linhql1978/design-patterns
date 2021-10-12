package decorator;

public class ConcreteComponent implements Component{
    @Override
    public void doOperation() {
        System.out.println("ConcreteComponent do operation");
    }
}
