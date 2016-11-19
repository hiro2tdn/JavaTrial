package jp.gr.design_pattern.no08_abstract_factory;

public abstract class AbstractProduct1 {
    protected String name;

    public AbstractProduct1(String name) {
        this.name = name;
    }

    public abstract void execute();
}
