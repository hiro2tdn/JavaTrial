package jp.gr.design_pattern.no07_builder;

public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product getResult();
}
