package jp.gr.design_pattern.no04_factory_method;

/**
 * <pre>
 * 生成に関するパターン
 * 他のクラスのコンストラクタをサブクラスで上書き可能な自分のメソッドに置き換えることで、
 * アプリケーションに特化したオブジェクトの生成をサブクラスに追い出し、クラスの再利用性を高める
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.anOperation();
    }
}
