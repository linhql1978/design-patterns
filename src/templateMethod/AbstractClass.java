package templateMethod;

public abstract class AbstractClass {
    public void templateMethod(){
        this.step();
        this.otherStep();
    }

    protected void step(){
        System.out.println("Step default");
    }

    protected abstract void otherStep();
}
