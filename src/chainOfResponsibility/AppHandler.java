package chainOfResponsibility;

public class AppHandler {
    public static Handler getHandler(){
        Handler concreteHandler = new ConcreteHandler(LevelProcess.MEDIUM);
        Handler otherConcreteHandler = new OtherConcreteHandler(LevelProcess.EASY);

        otherConcreteHandler.setNextHandler(concreteHandler);

        return otherConcreteHandler;
    }
}
