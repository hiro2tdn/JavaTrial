package jp.gr.design_pattern.no01_iterator;

import java.util.Iterator;

public class ConcreteIterator implements Iterator<String> {
    private ConcreteAggregate aggregate;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public String next() {
        return aggregate.getAt(index++);
    }

    @Override
    public boolean hasNext() {
        if (index < aggregate.getSize()) {
            return true;
        } else {
            return false;
        }
    }
}
