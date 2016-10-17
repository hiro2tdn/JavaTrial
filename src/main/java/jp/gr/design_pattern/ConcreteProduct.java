package jp.gr.design_pattern;

public class ConcreteProduct extends Product {
    private String base;
    private String wall;

    public void setBase(String base) {
        this.base = base;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void execute() {
        System.out.println("Product:execute(" + base + "," + wall + ")");
    }
}
