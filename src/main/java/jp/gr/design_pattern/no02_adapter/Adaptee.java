package jp.gr.design_pattern.no02_adapter;

import jp.gr.design_pattern.no01_iterator.Item;

public class Adaptee {
    public void method(Item item) {
        System.out.println("method:" + item.getName());
    }
}
