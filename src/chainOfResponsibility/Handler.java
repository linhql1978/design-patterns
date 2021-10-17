package chainOfResponsibility;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(LevelProcess levelProcess, String msg);
}
