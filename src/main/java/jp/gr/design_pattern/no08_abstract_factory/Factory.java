package jp.gr.design_pattern.no08_abstract_factory;

public abstract class Factory {
    public static Factory createFactory(String className) throws Exception {
        Class<?> c = Class.forName(className);
        Factory ret = (Factory) c.newInstance();
        return ret;
    }

    public abstract Product1 createProduct1();

    public abstract Product2 createProduct2();
}
