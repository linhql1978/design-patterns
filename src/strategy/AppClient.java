package strategy;

public class AppClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy());

        context.doingSomething("HAHAHA");

        // change strategy
        context.setStrategy(new OtherConcreteStrategy());
        context.doingSomething("HIHIHI");
    }
}
