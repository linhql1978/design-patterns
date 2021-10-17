package command;

public class OtherActionCommand implements Command{

    private Receiver receiver;

    public OtherActionCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OtherActionCommand is trigger");
        this.receiver.otherAction();
    }
}
