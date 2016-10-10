package jp.gr.design_pattern.no07_builder;

public interface Builder {
    public void execute1(String name);

    public void execute2(String name);

    public void execute3(String name);

    public Object getResult();
}
