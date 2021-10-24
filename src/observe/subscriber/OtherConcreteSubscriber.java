package observe.subscriber;

public class OtherConcreteSubscriber implements Subscriber{
    @Override
    public void update(String msg) {
        System.out.println("OtherConcreteSubscriber update: "+msg);
    }
}
