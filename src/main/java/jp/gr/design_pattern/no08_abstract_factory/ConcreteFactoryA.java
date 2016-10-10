package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteFactoryA extends Factory {
    public Product1 createProduct1() {
        return new ConcreteProductA1("ConcreteFactoryA:createProduct1");
    }

    public Product2 createProduct2() {
        return new ConcreteProductA2("ConcreteFactoryA:createProduct2");
    }
}