package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.ProductImpl;
import jp.gr.design_pattern.Product;

public class CreatorImpl extends Creator {
    @Override
    public Product factoryMethod() {
        Product product = new ProductImpl();
        product.setBase("base");
        product.setWall("wall");
        return product;
    }
}
