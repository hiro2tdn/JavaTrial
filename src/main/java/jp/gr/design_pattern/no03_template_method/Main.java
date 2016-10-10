package jp.gr.design_pattern.no03_template_method;

import jp.gr.design_pattern.no01_iterator.Item;

/**
 * 具体的な処理をサブクラスにまかせる
 */
public class Main {
    public static void main(String[] args) {
        Product product = new ConcreteProduct();
        Item item = new Item("A");
        product.templateMethod(item);
    }
}
