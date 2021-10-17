package mediator;

public class AppClient {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Component lowComponent = new LowComponent(mediator,LevelCommunicate.LOW);
        Component mediumComponent = new MediumComponent(mediator,LevelCommunicate.MEDIUM);
        Component highComponent = new HighComponent(mediator,LevelCommunicate.HIGH);

        mediator.addComponent(lowComponent);
        mediator.addComponent(mediumComponent);
        mediator.addComponent(highComponent);

        mediumComponent.requestCommunicate();
    }
}
