package jp.gr.design_pattern.no06_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 生成に関するパターン
 * 原型となるオブジェクトを元に複製します。
 * 1. Client(利用者)
 * 「ConcretePrototype」が実装しているオブジェクト複製メソッドを利用して、新しいオブジェクトを返します。
 * 2. Prototype(原型)
 * オブジェクト複製メソッドのインタフェースを定義します。上記メソッドを「ConcretePrototype」で実装する際に「clone()」メソッドを使用する場合は、「Prototype」に「Cloneable」インタフェースを実装させます。
 * 3. ConcretePrototype(具体的な原型)
 * 自身のオブジェクトを複製するメソッドを実装します。
 * 4. PrototypeUser(使用者)
 * 「Prototype」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    private Map<String, Prototype> hashmap = new HashMap<String, Prototype>();

    public void regist(String key, Prototype prototype) {
        hashmap.put(key, prototype);
    }

    public Prototype create(String key) {
        Prototype prototype = hashmap.get(key);
        return prototype.createClone();
    }
}
