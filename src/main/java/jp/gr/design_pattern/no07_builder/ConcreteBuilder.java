package jp.gr.design_pattern.no07_builder;

import jp.gr.design_pattern.ConcreteProduct;
import jp.gr.design_pattern.Product;

public class ConcreteBuilder implements Builder {
    private Product product = new ConcreteProduct();

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
