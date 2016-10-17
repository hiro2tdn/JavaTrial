package jp.gr.design_pattern.no08_abstract_factory;

import jp.gr.design_pattern.Product;

public abstract class AbstractFactory {
    public static AbstractFactory createFactory(int id) {
        if (id == 1) {
            AbstractFactory factory = new ConcreteFactory();
            return factory;
        } else {
            return null;
        }
    }

    public abstract Product createProduct();
}
