package jp.gr.design_pattern.no05_singleton;

/**
 * インスタンスが一つしかないことを保証する
 */
public class Main {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        instance.execute();

        instance = SingletonClass.getInstance();
        instance.execute();
    }
}
