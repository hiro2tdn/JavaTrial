package jp.gr.design_pattern.no06_prototype;

public class ConcretePrototype extends Prototype {
    private int id;

    public ConcretePrototype(int id) {
        this.id = id;
    }

    public Prototype createClone() {
        ConcretePrototype concretePrototype = null;
        try {
            concretePrototype = (ConcretePrototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }

    public int getId() {
        return id;
    }
}
