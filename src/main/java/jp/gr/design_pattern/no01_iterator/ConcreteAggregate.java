package jp.gr.design_pattern.no01_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Item> items = new ArrayList<Item>();

    public Iterator<Item> iterator() {
        return new ConcreteIterator(this);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getSize() {
        return items.size();
    }

    public Item getItemAt(int index) {
        return (Item) items.get(index);
    }
}
