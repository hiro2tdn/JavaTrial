package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductB2 extends AbstractProduct2 {
    public ConcreteProductB2(String name) {
        super(name);
    }

    public void run() {
        System.out.println(name + " 完成(B2-run)！");
    }
}
