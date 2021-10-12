package facade;

public class Facade {
    private static Facade facade;
    private Subsystem subsystem;
    private OtherSubsystem otherSubsystem;

    private Facade(Subsystem subsystem, OtherSubsystem otherSubsystem) {
        this.subsystem = subsystem;
        this.otherSubsystem = otherSubsystem;
    }

    public static Facade getFacade(){
        if(facade==null){
            facade = new Facade(new Subsystem(),new OtherSubsystem());
        }

        return facade;
    }

    public void interactSubsystems(){
        this.subsystem.doSomething();
        this.otherSubsystem.doSomething();
    }
}
