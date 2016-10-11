package jp.gr.design_pattern.no03_template_method;

public class ConcreteTemplate extends Template {
    public void execute1(String name) {
        System.out.println(name + " -> ConcreteTemplate:execute1");
    }

    public void execute2(String name) {
        System.out.println(name + " -> ConcreteTemplate:execute2");
    }
}
