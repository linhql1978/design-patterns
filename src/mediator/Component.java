package mediator;

public abstract class Component {
    protected Mediator mediator;
    protected LevelCommunicate levelCommunicate;

    public LevelCommunicate getLevelCommunicate() {
        return levelCommunicate;
    }

    public Component(Mediator mediator, LevelCommunicate levelCommunicate) {
        this.mediator = mediator;
        this.levelCommunicate = levelCommunicate;
    }

    public abstract void requestCommunicate();

    public abstract void acceptCommunicate();
}
