package jp.gr.design_pattern.no04_factory_method;

public class ConcreteProduct extends Product {
    @Override
    public void execute() {
        System.out.println("ConcreteProduct:execute");
    }
}
