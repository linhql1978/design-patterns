package chainOfResponsibility;

public abstract class BaseHandler implements Handler {

    private LevelProcess levelProcess;
    private Handler nextHandler;

    public BaseHandler(LevelProcess levelProcess) {
        this.levelProcess = levelProcess;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(LevelProcess levelProcess, String msg) {
        if(this.levelProcess.getLevel() >= levelProcess.getLevel()){
            this.concreteHandle(msg);
        }
        if(this.nextHandler!=null){
            this.nextHandler.handle(levelProcess, msg);
        }
    }

    public abstract void concreteHandle(String msg);
}
