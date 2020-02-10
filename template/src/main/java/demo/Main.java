package demo;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass;
        abstractClass=new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass=new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
