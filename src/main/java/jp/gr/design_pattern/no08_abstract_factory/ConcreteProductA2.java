package jp.gr.design_pattern.no08_abstract_factory;

public class ConcreteProductA2 extends AbstractProduct2 {
    public ConcreteProductA2(String name) {
        super(name);
    }

    public void run() {
        System.out.println(name + " 完成(A2-run)！");
    }
}
