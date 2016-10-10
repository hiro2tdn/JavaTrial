package jp.gr.design_pattern.no04_factory_method;

public class ConcreteFactory implements Factory {
    public Product1 createProduct1() {
        return new ConcreteProduct1("ConcreteFactory:createProduct1");
    }

    public Product2 createProduct2() {
        return new ConcreteProduct2("ConcreteFactory:createProduct2");
    }
}
