package jp.gr.design_pattern.no06_prototype;

public class ConcretePrototype extends Prototype {
    public ConcretePrototype(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println(name);
        System.out.println("ConcretePrototype1:execute");
    }
}
