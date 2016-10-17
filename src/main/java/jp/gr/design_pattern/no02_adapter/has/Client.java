package jp.gr.design_pattern.no02_adapter.has;

/**
 * <pre>
 * 構造に関するパターン
 * 既存のクラスに対して修正を加えることなく、インタフェースを変更する(委譲)
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.requiredMethod();
    }
}
