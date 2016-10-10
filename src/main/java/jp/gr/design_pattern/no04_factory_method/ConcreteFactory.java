package jp.gr.design_pattern.no04_factory_method;

import jp.gr.design_pattern.no03_template_method.Product;
import jp.gr.design_pattern.no03_template_method.ConcreteProduct;

public class ConcreteFactory extends Factory {

    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
