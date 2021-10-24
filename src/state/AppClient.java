package state;

public class AppClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState());

        context.doing();

        // change state of context
        context.setState(new OtherConcreteState());
        context.doing();
    }
}
