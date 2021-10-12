package facade;

public class AppClient {
    public static void main(String[] args) {
        Facade facade = Facade.getFacade();

        facade.interactSubsystems();
    }
}
