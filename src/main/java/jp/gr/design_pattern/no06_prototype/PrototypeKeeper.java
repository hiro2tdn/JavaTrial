package jp.gr.design_pattern.no06_prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeKeeper {
    private Map<String, Prototype> map;

    public PrototypeKeeper() {
        map = new HashMap<String, Prototype>();
    }

    public void put(String key, Prototype prototype) {
        map.put(key, prototype);
    }

    public Prototype createClone(String key) {
        Prototype prototype = map.get(key);
        return prototype.createClone();
    }
}