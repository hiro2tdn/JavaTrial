package jp.gr.design_pattern.no02_adapter.is;

import jp.gr.design_pattern.no02_adapter.Adaptee;

public class ConcreteAdapter extends Adaptee implements Adapter {
    @Override
    public void execute(String name) {
        execute(name, "ConcreteAdapter:execute");
    }
}
