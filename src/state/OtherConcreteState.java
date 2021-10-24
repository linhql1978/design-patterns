package state;

public class OtherConcreteState implements State{
    @Override
    public void doingSomething() {
        System.out.println("OtherConcreteState doing something");
    }
}
