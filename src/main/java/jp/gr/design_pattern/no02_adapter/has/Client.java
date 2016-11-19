package jp.gr.design_pattern.no02_adapter.has;

/**
 * <pre>
 * 構造に関するパターン
 * 互換性のないインタフェースを持つクラス同士の接続を可能にします。(委譲)
 * 1. Client(利用者)
 * 「Target」のメソッドを利用して処理を行います。
 * 2. Target(対象)
 * 要求されているメソッド(インタフェース)を定めます。
 * 3. Adaptee(適合される側)
 * 既存のメソッドを提供します。このメソッドの機能を「Target」のインタフェースに適合させ利用します。
 * 4. Adapter(適合させる)
 * 「Adaptee」のメソッドのインタフェースを吸収し、「Target」から利用できるインタフェースに変換します。実装方法としては、以下の2通りあります。
 * ・「Target」が「abstract class」で定義されている場合
 * 「Adaptee」に委譲する方法(2.委譲を利用した方法)で実装します。
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}
