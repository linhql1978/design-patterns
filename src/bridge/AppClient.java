package bridge;

import bridge.abstraction.Abstraction;
import bridge.abstraction.OtherConcreteAbstraction;
import bridge.implemention.OtherConcreteImplementor;

public class AppClient {
    public static void main(String[] args) {
//        Abstraction abstraction = new ConcreteAbstraction(new ConcreteImplementor());
        Abstraction abstraction = new OtherConcreteAbstraction(new OtherConcreteImplementor());

        abstraction.doSomething();
    }
}
