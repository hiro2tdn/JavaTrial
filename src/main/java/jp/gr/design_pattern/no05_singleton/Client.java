package jp.gr.design_pattern.no05_singleton;

/**
 * <pre>
 * 生成に関するパターン
 * そのクラスのインスタンスが1つしか生成されないことを保証する
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.execute();
        instance = Singleton.getInstance();
        instance.execute();
    }
}
