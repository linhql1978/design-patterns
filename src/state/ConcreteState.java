package state;

public class ConcreteState implements State{
    @Override
    public void doingSomething() {
        System.out.println("ConcreteState doing something");
    }
}
