package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductB2 extends Product2 {
    public ConcreteProductB2(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProductB2:execute");
    }
}
