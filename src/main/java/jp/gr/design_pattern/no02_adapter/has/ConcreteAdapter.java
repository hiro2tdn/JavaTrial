package jp.gr.design_pattern.no02_adapter.has;

import jp.gr.design_pattern.no02_adapter.Adaptee;

public class ConcreteAdapter implements Adapter {
    private Adaptee adaptee;

    public ConcreteAdapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void execute(String name) {
        adaptee.execute(name, "ConcreteAdapter:execute");
    }
}
