package jp.gr.design_pattern.no08_abstract_factory;

/**
 * <pre>
 * 生成に関するパターン
 * 関連するインスタンス群を生成するための API を集約することによって、複数のモジュール群の再利用を効率化する
 * </pre>
 */
public class Client {
    public static void main(String[] args) throws Exception {
        AbstractFactory factory = AbstractFactory.createFactory(ConcreteFactory.class.getName());
        Product1 product1 = factory.createProduct1();
        product1.execute();
        Product2 product2 = factory.createProduct2();
        product2.execute();
    }

}
