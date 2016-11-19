package jp.gr.design_pattern.no03_template_method;

/**
 * <pre>
 * 振る舞いに関するパターン
 * 1. AbstractClass(抽象クラス)
 * テンプレートメソッドを実装します。また、テンプレートメソッドで使用するメソッドを抽象メソッドで定義します。
 * 2. ConcreteClass(具象クラス)
 * 「AbstractClass」で定義した抽象メソッドを実装します。ここで実装した抽象メソッドは、「AbstractClass」のテンプレートメソッドで使用されます。
 * 3. Client(利用者)
 * 「Template Method」パターンを適用したクラスを利用し処理します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass AC = new ConcreteClass();
        AC.templateMethod();
    }
}
