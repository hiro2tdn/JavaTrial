package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductB3 extends AbstractProduct3 {
    public ConcreteProductB3(String name) {
        super(name);
    }

    public void action() {
        System.out.println(name + " 完成(B3-action)！");
    }
}
