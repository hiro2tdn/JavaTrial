package jp.gr.design_pattern.no02_adapter.has;

public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    public void targetMethod1() {
        adaptee.method1();
    }

    public void targetMethod2() {
        adaptee.method2();
    }
}
