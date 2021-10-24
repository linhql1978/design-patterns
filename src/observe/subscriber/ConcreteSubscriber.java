package observe.subscriber;

public class ConcreteSubscriber implements Subscriber{
    @Override
    public void update(String msg) {
        System.out.println("ConcreteSubscriber update: "+msg);
    }
}
