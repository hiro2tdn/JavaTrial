package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductB1 extends Product1 {
    public ConcreteProductB1(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProductB1:execute");
    }
}
