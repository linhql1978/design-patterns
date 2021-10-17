package chainOfResponsibility;

public class ConcreteHandler extends BaseHandler{
    public ConcreteHandler(LevelProcess levelProcess) {
        super(levelProcess);
    }

    @Override
    public void concreteHandle(String msg) {
        System.out.println("ConcreteHandler handle: "+ msg);
    }
}
