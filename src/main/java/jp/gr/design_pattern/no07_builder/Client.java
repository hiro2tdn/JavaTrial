package jp.gr.design_pattern.no07_builder;

/**
 * <pre>
 * 生成に関するパターン
 * 複合化されたオブジェクトについて、その生成過程を隠蔽することにより、同じ過程で異なる内部形式のオブジェクトを生成できます。
 * 1. Client(依頼者)
 * 「Director」に建築指示を出します。
 * 2. Director(監督者)
 * 「ConcreteBuilder」の実態に関係なく、「Builder」に提供されているインタフェースのみを使用し、建築します。その構築過程は、「Client」から隠蔽します。
 * 3. Builder(建築者)
 * 建築過程の各メソッドのインタフェースを定めます。
 * 4. ConcreteBuilder(具体的な建築者)
 * 「Builder」が定めたインタフェースを実装します。 *
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        String result = "";
        Director director = new Director(new ConcreteBuilder());
        result = (String) director.construct();
        System.out.println(result);
    }
}
