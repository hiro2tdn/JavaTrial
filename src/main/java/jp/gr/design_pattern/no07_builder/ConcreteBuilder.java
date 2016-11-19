package jp.gr.design_pattern.no07_builder;

public class ConcreteBuilder extends Builder {
    private StringBuffer sb = new StringBuffer();

    public void part1(String str) {
        sb.append("part1:" + str + System.getProperty("line.separator"));
    }

    public void part2(String str) {
        sb.append("part2:" + str + System.getProperty("line.separator"));
    }

    public Object getResult() {
        return sb.toString();
    }
}
