package jp.gr.design_pattern.no07_builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() {
        builder.part1("工程１");
        builder.part2("工程２");
        return builder.getResult();
    }
}
