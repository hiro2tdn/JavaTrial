package jp.gr.design_pattern.no06_prototype;

public class ConcretePrototype extends Prototype {
    private int count = 0;

    @Override
    public void execute() {
        System.out.println("ConcretePrototype#execute:" + count++);
    }
}
