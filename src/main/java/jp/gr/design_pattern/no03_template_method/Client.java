package jp.gr.design_pattern.no03_template_method;

/**
 * <pre>
 * 振る舞いに関するパターン
 * ある処理のおおまかなアルゴリズムをあらかじめ決めておいて、そのアルゴリズムの具体的な設計をサブクラスに任せる
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Template template = new TemplateImpl();
        template.templateMethod();
    }
}
