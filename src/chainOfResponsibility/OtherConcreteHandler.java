package chainOfResponsibility;

public class OtherConcreteHandler extends BaseHandler{
    public OtherConcreteHandler(LevelProcess levelProcess) {
        super(levelProcess);
    }

    @Override
    public void concreteHandle(String msg) {
        System.out.println("OtherConcreteHandler handle: "+msg);
    }
}
