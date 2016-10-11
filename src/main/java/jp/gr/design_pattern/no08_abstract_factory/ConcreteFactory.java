package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public Product1 createProduct1() {
        System.out.println("ConcreteFactory:createProduct1");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 createProduct2() {
        System.out.println("ConcreteFactory:createProduct2");
        return new ConcreteProduct2();
    }
}