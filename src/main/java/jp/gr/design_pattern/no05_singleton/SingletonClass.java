package jp.gr.design_pattern.no05_singleton;

public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();
    private static int count = 0;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public void execute() {
        System.out.println("SingletonClass:useSingleton:" + count++);
    }

}