package chainOfResponsibility;

public class AppClient {
    public static void main(String[] args) {
        Handler handler = AppHandler.getHandler();

        handler.handle(LevelProcess.MEDIUM, "Hahaha");
        handler.handle(LevelProcess.EASY, "Hihihi");
    }
}
