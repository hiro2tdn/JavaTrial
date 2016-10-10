package jp.gr.design_pattern.no01_iterator;

import java.util.Iterator;

/**
 * 並んだ物を順番に処理する
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");

        Iterator<String> it = aggregate.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
