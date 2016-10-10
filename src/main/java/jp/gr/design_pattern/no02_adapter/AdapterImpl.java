package jp.gr.design_pattern.no02_adapter;

import jp.gr.design_pattern.no01_iterator.Item;

public class AdapterImpl implements TargetImpl {
    private Adaptee adaptee;

    public AdapterImpl() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void targetMethod(Item item) {
        adaptee.method(item);
    }
}
