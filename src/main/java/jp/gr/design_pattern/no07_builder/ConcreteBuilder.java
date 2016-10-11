package jp.gr.design_pattern.no07_builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setBase("ConcreteBuilder:buildPart1");
    }

    @Override
    public void buildPart2() {
        product.setWall("ConcreteBuilder:buildPart2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
