package command;

public class Invoker {
    private Command actionCommand;
    private Command otherActionCommand;

    public Invoker(Command actionCommand, Command otherActionCommand) {
        this.actionCommand = actionCommand;
        this.otherActionCommand = otherActionCommand;
    }

    public void requestActionCommand(){
        System.out.println("Invoker request action");
        this.actionCommand.execute();
    }

    public void requestOtherActionCommand(){
        System.out.println("Invoker request other action");
        this.otherActionCommand.execute();
    }
}
