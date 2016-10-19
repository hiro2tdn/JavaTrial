package jp.gr.design_pattern.no08_abstract_factory;

import jp.gr.design_pattern.Product;

public abstract class Factory {
    public static Factory createFactory(int id) {
        if (id == 1) {
            Factory factory = new FactoryImpl();
            return factory;
        } else {
            return null;
        }
    }

    public abstract Product createProduct();
}
