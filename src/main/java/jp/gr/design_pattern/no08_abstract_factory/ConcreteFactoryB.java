package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteFactoryB extends AbstractFactory {
    public static final int id = 2;

    public AbstractProduct1 createProduct1() {
        return new ConcreteProductB1("工場B - 製品1");
    }

    public AbstractProduct2 createProduct2() {
        return new ConcreteProductB2("工場B - 製品2");
    }

    public AbstractProduct3 createProduct3() {
        return new ConcreteProductB3("工場B - 製品3");
    }
}
