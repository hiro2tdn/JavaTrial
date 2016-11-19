package jp.gr.design_pattern.no09_bridge;

/**
 * <pre>
 * 構造に関するパターン
 * あるクラスにおける機能拡張と実装を分離し、それらを独立して管理します。
 * 1. Abstraction(抽象化)
 * 機能追加の継承関係の最上位クラスです。「Implementor」を内部に保持し、「Implementor」のメソッドを使用した基本的な機能を提供します。
 * 2. RefinedAbstraction(改善した抽象化)
 * 「Abstraction」を機能追加したクラスです。「Abstraction」とは、機能追加の継承関係にあります。
 * 3. Implementor(実装者)
 * 機能実装の継承関係の最上位クラスです。「Abstraction」が使用するメソッドのインタフェースを定義します。
 * 4. ConcreteImplementor(具体的な実装者)
 * 「Implementor」が定めたインタフェースを実装します。
 * 5. Client(利用者)
 * 「Bridge」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction(new ConcreteImplementor());
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.abstractionMethod();
        refinedAbstraction.abstractionMethod();
        refinedAbstraction.refinedMethod();
    }
}
