package jp.gr.design_pattern.no03_template_method;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void method1() {
        System.out.println("ConcreteClass#method1");
    }

    @Override
    protected void method2() {
        System.out.println("ConcreteClass#method2");
    }
}
