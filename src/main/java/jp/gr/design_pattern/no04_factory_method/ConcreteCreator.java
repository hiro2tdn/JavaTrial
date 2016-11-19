package jp.gr.design_pattern.no04_factory_method;

public class ConcreteCreator extends Creator {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
