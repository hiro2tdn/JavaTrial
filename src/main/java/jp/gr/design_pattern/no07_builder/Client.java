package jp.gr.design_pattern.no07_builder;

import jp.gr.design_pattern.Product;

/**
 * <pre>
 * 生成に関するパターン
 * オブジェクトの生成過程を抽象化することによって、動的なオブジェクトの生成を可能にする。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new BuilderImpl();
        Director director = new Director(builder);
        Product product = director.construct();
        product.execute();
    }
}
