package demo;

public class Main {
    public static void main(String[] args) {
        PrototypeA prototypeA = new PrototypeA("1");
        Prototype clonePrototypeA = prototypeA.clone();
        System.out.println(clonePrototypeA.getId());
    }
}
