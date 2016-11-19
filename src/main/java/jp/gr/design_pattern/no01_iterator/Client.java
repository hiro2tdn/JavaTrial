package jp.gr.design_pattern.no01_iterator;

/**
 * <pre>
 * 振る舞いに関するパターン
 * 集約オブジェクトを内包するオブジェクトが内部表現を公開することなく、その要素に順にアクセスする方法を提供します。
 * 1. Iterator(反復子)
 * 要素に順次アクセスするインタフェースを定めます。
 * 2. ConcreteIterator(具体的な反復子)
 * 「Iterator」が定めたインタフェースを実装します。順次アクセス方法・次要素の有無等の手順の詳細処理を定義します。また、上記処理の対象となるオブジェクト（ConcreteAggregate）を生成時（コンストラクタ処理）に保持しておきます。
 * 3. Aggregate(集合体)
 * 「Iterator」を作り出すインタフェースを定めます。
 * 4. ConcreteAggregate(具体的な集合体)
 * 「Aggregate」が定めたインタフェースを実装します。「iterator」メソッドで、自身のオブジェクトをコンストラクタ引数に「ConcreteAggregate」のオブジェクトを返します。（取扱い方法（次の要素の有無確認方法・次の要素の取得方法）の定まった集合体オブジェクトを返す）
 * 5. Item(集合体の各要素)
 * 集合体の要素です。
 * 6. Client(利用者)
 * 「Iterator」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.addItem(new Item("A"));
        a.addItem(new Item("B"));
        a.addItem(new Item("C"));
        a.addItem(new Item("D"));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            System.out.println(item.getName());
        }
    }
}
