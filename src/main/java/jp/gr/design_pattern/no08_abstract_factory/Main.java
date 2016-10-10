package jp.gr.design_pattern.no08_abstract_factory;

/**
 * FactoryにConcreteFactoryの生成を任せる
 */
public class Main {
    public static void main(String[] args) throws Exception {
        {
            Factory factory = Factory.createFactory(ConcreteFactoryA.class.getName());
            Product1 product1 = factory.createProduct1();
            Product2 product2 = factory.createProduct2();
            product1.execute();
            product2.execute();
        }

        {
            Factory factory = Factory.createFactory(ConcreteFactoryB.class.getName());
            Product1 product1 = factory.createProduct1();
            Product2 product2 = factory.createProduct2();
            product1.execute();
            product2.execute();
        }
    }
}
