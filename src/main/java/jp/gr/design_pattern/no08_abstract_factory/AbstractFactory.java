package jp.gr.design_pattern.no08_abstract_factory;

public abstract class AbstractFactory {
    public static AbstractFactory createFactory(String className) throws Exception {
        Class<?> c = Class.forName(className);
        AbstractFactory ret = (AbstractFactory) c.newInstance();
        return ret;
    }

    public abstract Product1 createProduct1();

    public abstract Product2 createProduct2();
}
