package observe.publisher;

public class OtherConcretePublisher extends Publisher{
    @Override
    public void notifySubscribers() {
        this.subscribers.forEach(subscriber -> subscriber.update("OtherConcretePublisher notify state changed to: "+this.state));
    }
}