package jp.gr.design_pattern.no04_factory_method;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        System.out.println("ConcreteFactory:factoryMethod");
        return new ConcreteProduct();
    }
}
