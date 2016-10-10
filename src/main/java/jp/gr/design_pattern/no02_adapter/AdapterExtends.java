package jp.gr.design_pattern.no02_adapter;

import jp.gr.design_pattern.no01_iterator.Item;

public class AdapterExtends extends Adaptee implements TargetExtends {
    public void targetMethod(Item item) {
        method(item);
    }
}
