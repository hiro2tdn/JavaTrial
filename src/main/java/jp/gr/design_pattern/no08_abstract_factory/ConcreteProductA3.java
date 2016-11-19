package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductA3 extends AbstractProduct3 {
    public ConcreteProductA3(String name) {
        super(name);
    }

    public void action() {
        System.out.println(name + " 完成(A3-action)！");
    }
}
