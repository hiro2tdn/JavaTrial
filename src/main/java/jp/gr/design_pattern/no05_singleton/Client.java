package jp.gr.design_pattern.no05_singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * 生成に関するパターン
 * あるオブジェクトが単一であること（複数オブジェクト生成されていないこと）を保証します。
 * 1. Singleton(単独個体)
 * 唯一のオブジェクトを返す役です。getInstanceメソッドではいつも同じオブジェクトを返します。
 * 2. Client(利用者)
 * 「Singleton」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        List<Singleton> list = new ArrayList<Singleton>();
        list.add(Singleton.getInstance());
        list.add(Singleton.getInstance());
        list.add(Singleton.getInstance());
        Iterator<Singleton> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
