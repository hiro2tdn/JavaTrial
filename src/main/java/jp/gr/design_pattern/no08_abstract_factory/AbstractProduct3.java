package jp.gr.design_pattern.no08_abstract_factory;

public abstract class AbstractProduct3 {
    protected String name;

    public AbstractProduct3(String name) {
        this.name = name;
    }

    public abstract void action();
}
