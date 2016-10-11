package jp.gr.design_pattern.no06_prototype;

/**
 * <pre>
 * 生成に関するパターン
 * 生成されるオブジェクトの種別がプロトタイプ（典型）的なインスタンスであるときに使用され、
 * このプロトタイプを複製して新しいオブジェクトを生成する
 * </pre>
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype("Client:main");
        prototype.execute();
        ConcretePrototype copy = (ConcretePrototype) prototype.clone();
        copy.execute();
    }
}
