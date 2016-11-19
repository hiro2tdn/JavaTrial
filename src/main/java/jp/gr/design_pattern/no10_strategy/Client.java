package jp.gr.design_pattern.no10_strategy;

/**
 * <pre>
 * 振る舞いに関するパターン
 * 一連のアルゴリズム(戦略)をカプセル化(部品化)し、動的なアルゴリズムの切替えを可能とします。
 * 1. Strategy(戦略)
 * 戦略のインタフェースを定義します。
 * 2. ConcreteStrategyA・B(具体的戦略)の役
 * 「Strategy」が定義したインタフェースを実装します。
 * 具体的な戦略を作成します。
 * 3. Context(状況判断)
 * 状況により「ConcreteStrategy」を切替えその戦略を利用します。
 * 利用するのは、あくまで「Strategy」で定義したメソッドです。
 * 4. Client(利用者)
 * 「Strategy」パターンを適用したクラスを用い処理を行います。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        System.out.println(context.contextMeshod());
        context.setStrategy(new ConcreteStrategyB());
        System.out.println(context.contextMeshod());
    }
}
