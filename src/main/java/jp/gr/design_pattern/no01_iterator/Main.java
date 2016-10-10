package jp.gr.design_pattern.no01_iterator;

import java.util.Iterator;

/**
 * 並んだ物を順番に処理
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate target = new ConcreteAggregate();
        target.addItem(new Item("A"));
        target.addItem(new Item("B"));
        target.addItem(new Item("C"));
        target.addItem(new Item("D"));

        Iterator<Item> it = target.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            System.out.println(item.getName());
        }
    }
}
