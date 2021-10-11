package bridge.abstraction;

import bridge.implemention.Implementor;

public class ConcreteAbstraction extends Abstraction{
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSomething() {
        System.out.println("ConcreteAbstraction do something");
        this.implementor.doOperation();
    }
}
