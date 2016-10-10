package jp.gr.design_pattern.no07_builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.execute1("Director:construct");
        builder.execute2("Director:construct");
        builder.execute3("Director:construct");
    }
}
