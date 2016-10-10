package jp.gr.design_pattern.no08_abstract_factory;

public abstract class Product1 {
    protected String name;

    public Product1(String name) {
        this.name = name;
    }

    public abstract void execute();
}
