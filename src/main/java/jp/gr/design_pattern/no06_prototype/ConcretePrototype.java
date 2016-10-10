package jp.gr.design_pattern.no06_prototype;

public class ConcretePrototype implements Prototype {
    private String id;
    private String name;

    public ConcretePrototype(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Prototype createClone() {
        ConcretePrototype prototype = null;
        try {
            prototype = (ConcretePrototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
