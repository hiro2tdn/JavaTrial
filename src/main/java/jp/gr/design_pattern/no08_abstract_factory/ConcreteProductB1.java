package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductB1 extends AbstractProduct1 {
    public ConcreteProductB1(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " 完成(B1-execute)！");
    }
}
