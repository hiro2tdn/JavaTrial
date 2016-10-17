package jp.gr.design_pattern.no02_adapter.has;

import jp.gr.design_pattern.no02_adapter.Adaptee;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void requiredMethod() {
        adaptee.oldMethod();
    }
}
