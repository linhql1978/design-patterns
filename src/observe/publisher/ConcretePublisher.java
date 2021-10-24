package observe.publisher;

public class ConcretePublisher extends Publisher{

    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(subscriber -> subscriber.update("ConcretePublisher notify state changed to: "+this.state));
    }
}