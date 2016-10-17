package jp.gr.design_pattern.no02_adapter.is;

import jp.gr.design_pattern.no02_adapter.Adaptee;

public class Adapter extends Adaptee implements Target {
    @Override
    public void requiredMethod() {
        oldMethod();
    }
}
