package jp.gr.design_pattern.no08_abstract_factory;

import jp.gr.design_pattern.ConcreteProduct;
import jp.gr.design_pattern.Product;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        Product product = new ConcreteProduct();
        product.setBase("base");
        product.setWall("wall");
        return product;
    }
}