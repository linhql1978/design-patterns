package iterator;

import java.util.Arrays;

public class AppClient {
    public static void main(String[] args) {
        Collection collection = new ConcreteCollection(Arrays.asList(new Item("Apple", 10), new Item("Milk", 20)));
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
