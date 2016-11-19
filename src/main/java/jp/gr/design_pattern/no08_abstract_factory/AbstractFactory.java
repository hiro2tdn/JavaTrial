package jp.gr.design_pattern.no08_abstract_factory;

public abstract class AbstractFactory {
    public static AbstractFactory createFactory(int factoryId) {
        switch (factoryId) {
        case ConcreteFactoryA.id:
            return new ConcreteFactoryA();
        case ConcreteFactoryB.id:
            return new ConcreteFactoryB();
        default:
            return null;
        }
    }

    public abstract AbstractProduct1 createProduct1();

    public abstract AbstractProduct2 createProduct2();

    public abstract AbstractProduct3 createProduct3();
}
