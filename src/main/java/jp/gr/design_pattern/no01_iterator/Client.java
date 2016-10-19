package jp.gr.design_pattern.no01_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * 振る舞いに関するパターン
 * コンテナオブジェクトの要素を列挙する手段を独立させることによって、コンテナの内部仕様に依存しない反復子を提供する
 * Iterator パターンは、java.util.Iteratorインターフェースで利用されています。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        List<String> aggregate = new ArrayList<>();
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
