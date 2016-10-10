package jp.gr.design_pattern.no06_prototype;

/**
 * インスタンスから別のインスタンスを複製する
 * <p>
 * 複製元をKeeperに保持する
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype p1 = new ConcretePrototype("1", "A");
        ConcretePrototype p2 = new ConcretePrototype("2", "B");

        PrototypeKeeper keeper = new PrototypeKeeper();
        keeper.put(p1.getId(), p1);
        keeper.put(p2.getId(), p2);

        System.out.println(((ConcretePrototype) keeper.createClone(p1.getId())).getName());
        System.out.println(((ConcretePrototype) keeper.createClone(p2.getId())).getName());
    }
}
