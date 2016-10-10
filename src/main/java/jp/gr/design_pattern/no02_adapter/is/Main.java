package jp.gr.design_pattern.no02_adapter.is;

/**
 * インタフェースの差し替え(継承)
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter();
        adapter.execute("Main:main");
    }
}
