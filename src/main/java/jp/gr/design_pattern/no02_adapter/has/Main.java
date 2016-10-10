package jp.gr.design_pattern.no02_adapter.has;

/**
 * インタフェースの差し替え(委譲)
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter();
        adapter.execute("Main:main");
    }
}
