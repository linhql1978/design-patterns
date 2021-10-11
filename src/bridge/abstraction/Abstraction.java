package bridge.abstraction;

import bridge.implemention.Implementor;

public abstract class Abstraction {
    protected Implementor implementor;

    public abstract void doSomething();

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
}
