package jp.gr.design_pattern.no07_builder;

import jp.gr.design_pattern.Product;

public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product getResult();
}
