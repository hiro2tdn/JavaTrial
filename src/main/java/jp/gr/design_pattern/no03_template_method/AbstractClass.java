package jp.gr.design_pattern.no03_template_method;

public abstract class AbstractClass {
    public void templateMethod() {
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
}