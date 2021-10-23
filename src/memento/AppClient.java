package memento;

import java.util.Stack;

public class AppClient {
    public static void main(String[] args) {
        Stack<Originator.Memento> careTaker = new Stack<>();
        Originator originator = new Originator();

        originator.setState("Save time 1");
        careTaker.push(originator.save());
        originator.setState("Save time 2");

        System.out.println(originator);
        originator.restore(careTaker.pop());
        System.out.println(originator);
    }
}
