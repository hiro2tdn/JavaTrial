package jp.gr.design_pattern.no04_factory_method;

public class ConcreteProduct1 extends Product1 {
    public ConcreteProduct1(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProduct1:execute");
    }
}
