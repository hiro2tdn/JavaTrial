package jp.gr.design_pattern.no02_adapter;

public class Adaptee {
    public void execute(String name1, String name2) {
        System.out.println(name1 + " -> " + name2 + " -> Adaptee:execute");
    }
}
