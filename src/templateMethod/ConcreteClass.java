package templateMethod;

public class ConcreteClass extends AbstractClass{
    @Override
    protected void otherStep() {
        System.out.println("ConcreteClass implement otherStep");
    }
}
