package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductA1 extends AbstractProduct1 {
    public ConcreteProductA1(String name) {
        super(name);
    }

    public void execute() {
        System.out.println(name + " 完成(A1-execute)！");
    }
}
