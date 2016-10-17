package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.ConcreteProduct;
import jp.gr.design_pattern.Product;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        Product product = new ConcreteProduct();
        product.setBase("base");
        product.setWall("wall");
        return product;
    }
}
