package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductA1 extends Product1 {
    public ConcreteProductA1(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProductA1:execute");
    }
}
