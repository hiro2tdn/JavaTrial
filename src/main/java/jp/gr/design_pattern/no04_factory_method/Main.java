package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.no01_iterator.Item;
import jp.gr.design_pattern.no03_template_method.Product;

/**
 * インスタンス作成をサブクラスにまかせる
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        Item item = new Item("A");
        product.templateMethod(item);
    }
}
