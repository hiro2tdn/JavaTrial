package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductA2 extends Product2 {
    public ConcreteProductA2(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " -> ConcreteProductA2:execute");
    }
}
