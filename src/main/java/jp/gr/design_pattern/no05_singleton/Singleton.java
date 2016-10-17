package jp.gr.design_pattern.no05_singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private static int count = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void execute() {
        System.out.println("Singleton#execute:" + count++);
    }

}