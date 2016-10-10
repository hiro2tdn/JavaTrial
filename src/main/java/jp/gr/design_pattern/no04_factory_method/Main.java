package jp.gr.design_pattern.no04_factory_method;

/**
 * ConcreteFactoryにConcreteProductの生成を任せる
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product1 product1 = factory.createProduct1();
        Product2 product2 = factory.createProduct2();
        product1.execute();
        product2.execute();
    }
}
