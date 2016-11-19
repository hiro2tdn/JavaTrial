package jp.gr.design_pattern.no08_abstract_factory;

public abstract class AbstractProduct2 {
    protected String name;

    public AbstractProduct2(String name) {
        this.name = name;
    }

    public abstract void run();
}
