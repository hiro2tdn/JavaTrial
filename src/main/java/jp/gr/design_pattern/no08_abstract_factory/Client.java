package jp.gr.design_pattern.no08_abstract_factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * 生成に関するパターン
 * 互いに関連する一連のオブジェクト郡を、その具象クラスに依存しないで生成するためのインタフェースを提供します。
 * 1. AbstractProduct1・2・3(抽象的な製品)
 * 「AbstractFactory」(抽象的な工場)によって生成される抽象的なオブジェクト(部品・製品)のインタフェースを定義します。
 * 2. ConcreteProductA1・A2・A3、ConcreteProductB1・B2・B3(具体的な製品)
 * 「AbstractProduct1・2・3」のインタフェースを実装します。
 * 3. AbstractFactory(抽象的な工場)
 * 「AbstractProduct1・2・3」を生成するためのインタフェースを定義します。
 * ※Factoryオブジェクト「ConcreteFactoryA」「ConcreteFactoryB」(具体的な工場)を生成するためのクラスメソッドを定義します。
 * 4. ConcreteFactoryA・ConcreteFactoryB(具体的な工場)
 * 「AbstractFactory」のインタフェースを実装します。
 * 5. Client(利用者)
 * 「AbstractProduct1・2・3」「AbstractFactory」が提供するインタフェースのみを使用して処理を行います。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        List<AbstractFactory> factorys = new ArrayList<AbstractFactory>();
        factorys.add(AbstractFactory.createFactory(ConcreteFactoryA.id));
        factorys.add(AbstractFactory.createFactory(ConcreteFactoryB.id));
        Iterator<AbstractFactory> it = factorys.iterator();
        while (it.hasNext()) {
            AbstractFactory factory = it.next();
            AbstractProduct1 product1 = factory.createProduct1();
            AbstractProduct2 product2 = factory.createProduct2();
            AbstractProduct3 product3 = factory.createProduct3();
            product1.execute();
            product2.run();
            product3.action();
        }
    }
}
