package jp.gr.design_pattern.no03_template_method;

/**
 * 具体的な処理をサブクラスにまかせる
 */
public class Main {
    public static void main(String[] args) {
        Template template = new ConcreteTemplate();
        template.execute("Main:main");
    }
}
