package observe.publisher;

import observe.subscriber.Subscriber;

import java.util.LinkedList;
import java.util.List;

public abstract class Publisher {

    protected String state;
    protected List<Subscriber> subscribers = new LinkedList<>();

    public void subscribe(Subscriber subscriber) {
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
            System.out.println("Subscribe success");
        }else{
            System.out.println("You already subscribe");
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
            System.out.println("Unsubscribe success");
        }else{
            System.out.println("You not already subscribe");
        }
    }

    public void changeState(String state){
        this.state = state;
        this.notifySubscribers();
    }

    protected abstract void notifySubscribers();
}
