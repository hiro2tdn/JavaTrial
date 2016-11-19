package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteFactoryA extends AbstractFactory {
    public static final int id = 1;

    public AbstractProduct1 createProduct1() {
        return new ConcreteProductA1("工場A - 製品1");
    }

    public AbstractProduct2 createProduct2() {
        return new ConcreteProductA2("工場A - 製品2");
    }

    public AbstractProduct3 createProduct3() {
        return new ConcreteProductA3("工場A - 製品3");
    }
}
