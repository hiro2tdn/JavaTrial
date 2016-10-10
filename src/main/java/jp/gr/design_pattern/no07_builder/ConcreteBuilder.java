package jp.gr.design_pattern.no07_builder;

public class ConcreteBuilder implements Builder {
    private StringBuffer sb = new StringBuffer();

    public void execute1(String name) {
        sb.append(name + " -> ConcreteBuilder:execute1" + System.getProperty("line.separator"));
    }

    public void execute2(String name) {
        sb.append(name + " -> ConcreteBuilder:execute2" + System.getProperty("line.separator"));
    }

    public void execute3(String name) {
        sb.append(name + " -> ConcreteBuilder:execute3" + System.getProperty("line.separator"));
    }

    public Object getResult() {
        return sb.toString();
    }
}
