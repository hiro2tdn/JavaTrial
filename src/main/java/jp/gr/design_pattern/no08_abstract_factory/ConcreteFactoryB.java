package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteFactoryB extends Factory {
    public Product1 createProduct1() {
        return new ConcreteProductB1("ConcreteFactoryB:createProduct1");
    }

    public Product2 createProduct2() {
        return new ConcreteProductB2("ConcreteFactoryB:createProduct2");
    }
}