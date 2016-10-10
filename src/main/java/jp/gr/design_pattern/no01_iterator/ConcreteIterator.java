package jp.gr.design_pattern.no01_iterator;

import java.util.Iterator;

public class ConcreteIterator implements Iterator<Item> {
    private ConcreteAggregate itemAggregate;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate itemAggregate) {
        this.itemAggregate = itemAggregate;
    }

    public boolean hasNext() {
        if (index < itemAggregate.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    public Item next() {
        return itemAggregate.getItemAt(index++);
    }
}
