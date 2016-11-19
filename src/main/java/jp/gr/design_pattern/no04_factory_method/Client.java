package jp.gr.design_pattern.no04_factory_method;

/**
 * <pre>
 * 生成に関するパターン
 * 実際に生成するオブジェクトに依存しない、オブジェクト生成のインタフェースを提供します。
 * 1. Creator(作成者)
 * 「Product」を作成します。オブジェクトの生成手順のみを定義し、実際の生成については、サブクラス(「ConcreteCreator」)が行います。
 * 2. Product(製品)
 * 当パターンで生成されるオブジェクト(「ConcreteProduct」)のインタフェースを決定します。
 * 3. ConcreteCreator(具体的な作成者)
 * 具体的な製品を作ります。
 * 4. ConcreteProduct(具体的な製品)
 * 具体的な製品を決定します。
 * 5. Client(利用者)
 * 「Factory Method」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.method1();
        product.method2();
    }
}
