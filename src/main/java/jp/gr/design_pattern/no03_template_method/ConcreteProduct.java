package jp.gr.design_pattern.no03_template_method;

import jp.gr.design_pattern.no01_iterator.Item;

public class ConcreteProduct extends Product {
    public void method1(Item item) {
        System.out.println("method1:" + item.getName());
    };

    public void method2(Item item) {
        System.out.println("method2:" + item.getName());
    };
}
