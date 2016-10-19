package jp.gr.design_pattern.no07_builder;

import jp.gr.design_pattern.ProductImpl;
import jp.gr.design_pattern.Product;

public class BuilderImpl implements Builder {
    private Product product = new ProductImpl();

    @Override
    public void buildPart1() {
        product.setBase("base");
    }

    @Override
    public void buildPart2() {
        product.setWall("wall");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
