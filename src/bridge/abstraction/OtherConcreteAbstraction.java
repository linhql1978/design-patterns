package bridge.abstraction;

import bridge.implemention.Implementor;

public class OtherConcreteAbstraction extends Abstraction{
    public OtherConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSomething() {
        System.out.println("OtherConcreteAbstraction do something");
        this.implementor.doOperation();
    }
}
