package command;

public class AppClient {
    public static void main(String[] args) {
        Receiver receiver = new ReceiverImpl();
        Invoker invoker = new Invoker(new ActionCommand(receiver),new OtherActionCommand(receiver));

        invoker.requestActionCommand();
        invoker.requestOtherActionCommand();
    }
}
