package jp.gr.design_pattern.no04_factory_method;

public abstract class Product2 {
    protected String name;

    public Product2(String name) {
        this.name = name;
    }

    public abstract void execute();
}
