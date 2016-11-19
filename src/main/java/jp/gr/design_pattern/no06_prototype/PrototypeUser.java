package jp.gr.design_pattern.no06_prototype;

public class PrototypeUser {
    public static void main(String[] args) {
        Client client = new Client();
        ConcretePrototype cp1 = new ConcretePrototype(0);
        ConcretePrototype cp2 = new ConcretePrototype(1);
        ConcretePrototype cp3 = new ConcretePrototype(2);
        client.regist("0", cp1);
        client.regist("1", cp2);
        client.regist("2", cp3);
        Prototype prototype1 = client.create("0");
        Prototype prototype2 = client.create("1");
        Prototype prototype3 = client.create("2");
        System.out.println(((ConcretePrototype) prototype1).getId());
        System.out.println(((ConcretePrototype) prototype2).getId());
        System.out.println(((ConcretePrototype) prototype3).getId());
    }
}
