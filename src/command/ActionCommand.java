package command;

public class ActionCommand implements Command{

    private Receiver receiver;

    public ActionCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ActionCommand is trigger");
        this.receiver.action();
    }
}
