package jp.gr.design_pattern.no01_iterator;

import java.util.Iterator;

/**
 * <pre>
 * 振る舞いに関するパターン
 * コンテナオブジェクトの要素を列挙する手段を独立させることによって、コンテナの内部仕様に依存しない反復子を提供する
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");

        Iterator<String> it = aggregate.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
