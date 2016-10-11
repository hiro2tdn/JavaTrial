package jp.gr.design_pattern.no06_prototype;

public abstract class Prototype implements Cloneable {
    public String name;

    public Prototype(String name) {
        this.name = name;
    }

    public Prototype clone() throws CloneNotSupportedException {
        Prototype copy = (Prototype) super.clone();
        return copy;
    }

    public abstract void execute();
}
