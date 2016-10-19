package jp.gr.design_pattern.no08_abstract_factory;

import jp.gr.design_pattern.ProductImpl;
import jp.gr.design_pattern.Product;

public class FactoryImpl extends Factory {
    @Override
    public Product createProduct() {
        Product product = new ProductImpl();
        product.setBase("base");
        product.setWall("wall");
        return product;
    }
}