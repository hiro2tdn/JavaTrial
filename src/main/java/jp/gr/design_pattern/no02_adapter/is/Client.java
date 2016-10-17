package jp.gr.design_pattern.no02_adapter.is;

/**
 * <pre>
 * 構造に関するパターン
 * 既存のクラスに対して修正を加えることなく、インタフェースを変更する(継承)
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.requiredMethod();
    }
}
