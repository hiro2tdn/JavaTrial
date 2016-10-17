package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.Product;

public abstract class Creator {
    protected abstract Product factoryMethod();

    public void anOperation() {
        Product product = factoryMethod();
        product.execute();
    }
}
