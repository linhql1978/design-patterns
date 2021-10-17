package mediator;

public interface Mediator {
    void communicate(Component component);
    void addComponent(Component component);
}
