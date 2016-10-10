package jp.gr.design_pattern.no01_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<String> list = new ArrayList<String>();

    @Override
    public Iterator<String> iterator() {
        return new ConcreteIterator(this);
    }

    public void add(String s) {
        list.add(s);
    }

    public int getSize() {
        return list.size();
    }

    public String getAt(int index) {
        return list.get(index);
    }
}
