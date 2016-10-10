package jp.gr.design_pattern.no03_template_method;

public abstract class Template {
    public abstract void execute1(String name);

    public abstract void execute2(String name);

    public void execute(String name) {
        execute1(name);
        execute2(name);
    }
}