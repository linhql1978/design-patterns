package command;

public class ReceiverImpl implements Receiver{
    @Override
    public void action() {
        System.out.println("ReceiverImpl: action");
    }

    @Override
    public void otherAction() {
        System.out.println("ReceiverImpl: otherAction");
    }
}
