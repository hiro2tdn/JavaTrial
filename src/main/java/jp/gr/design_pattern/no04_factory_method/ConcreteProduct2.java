package jp.gr.design_pattern.no04_factory_method;

public class ConcreteProduct2 extends Product2 {
    public ConcreteProduct2(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProduct2:execute");
    }
}
