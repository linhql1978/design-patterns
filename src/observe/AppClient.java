package observe;

import observe.publisher.ConcretePublisher;
import observe.publisher.OtherConcretePublisher;
import observe.publisher.Publisher;
import observe.subscriber.ConcreteSubscriber;
import observe.subscriber.OtherConcreteSubscriber;
import observe.subscriber.Subscriber;

public class AppClient {
    public static void main(String[] args) {
        Publisher concretePublisher = new ConcretePublisher();
        Publisher otherConcretePublisher = new OtherConcretePublisher();

        Subscriber concreteSubscriber = new ConcreteSubscriber();
        Subscriber otherConcreteSubscriber = new OtherConcreteSubscriber();

        concretePublisher.subscribe(concreteSubscriber);

        otherConcretePublisher.subscribe(concreteSubscriber);
        otherConcretePublisher.subscribe(otherConcreteSubscriber);

        concretePublisher.changeState("Hahaha");
        otherConcretePublisher.changeState("Hihihi");
    }
}
