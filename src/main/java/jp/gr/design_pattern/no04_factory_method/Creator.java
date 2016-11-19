package jp.gr.design_pattern.no04_factory_method;

public abstract class Creator {
    public abstract Product factoryMethod();

    public final Product create() {
        Product product = factoryMethod();
        return product;
    }
}
