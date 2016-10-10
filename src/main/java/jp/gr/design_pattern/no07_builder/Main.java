package jp.gr.design_pattern.no07_builder;

/**
 * 初期化手順を細分化する
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getResult());
    }
}
