package jp.gr.design_pattern.no07_builder;

public class Product {
    private String base;
    private String wall;

    public void setBase(String base) {
        this.base = base;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void execute() {
        System.out.println(base);
        System.out.println(wall);
        System.out.println("Product:execute");
    }
}
