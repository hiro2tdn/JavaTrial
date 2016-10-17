package jp.gr.design_pattern.no08_abstract_factory;

import jp.gr.design_pattern.Product;

/**
 * <pre>
 * 生成に関するパターン
 * 関連するインスタンス群を生成するための API を集約することによって、複数のモジュール群の再利用を効率化する
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.createFactory(1);
        Product product = factory.createProduct();
        product.execute();
    }
}
