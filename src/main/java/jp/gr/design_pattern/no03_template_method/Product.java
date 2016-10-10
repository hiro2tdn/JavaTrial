package jp.gr.design_pattern.no03_template_method;

import jp.gr.design_pattern.no01_iterator.Item;

public abstract class Product {
    public abstract void method1(Item item);

    public abstract void method2(Item item);

    public void templateMethod(Item item) {
        method1(item);
        method2(item);
    }
}