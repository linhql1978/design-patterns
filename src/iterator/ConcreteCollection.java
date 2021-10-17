package iterator;

import java.util.List;

public class ConcreteCollection implements Collection{

    private List<Item> items;

    public ConcreteCollection(List<Item> items) {
        this.items = items;
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    public class ConcreteIterator implements Iterator{
        private int positionCurrent = 0;

        @Override
        public Item getNext() {
            return items.get(positionCurrent++);
        }

        @Override
        public boolean hasNext() {
            return positionCurrent < items.size();
        }
    }
}
