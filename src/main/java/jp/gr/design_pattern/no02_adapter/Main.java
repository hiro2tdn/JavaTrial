package jp.gr.design_pattern.no02_adapter;

import jp.gr.design_pattern.no01_iterator.Item;

/**
 * 一皮かぶせて再利用
 */
public class Main {
    public static void main(String[] args) {
        TargetExtends target_e = new AdapterExtends();
        Item item_e = new Item("A");
        target_e.targetMethod(item_e);

        TargetImpl target_i = new AdapterImpl();
        Item item_i = new Item("B");
        target_i.targetMethod(item_i);
    }
}
