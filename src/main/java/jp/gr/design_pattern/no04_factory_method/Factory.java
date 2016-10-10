package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.no03_template_method.Product;

public abstract class Factory {
    public abstract Product factoryMethod();

    public final Product create() {
        Product item = factoryMethod();
        return item;
    }
}