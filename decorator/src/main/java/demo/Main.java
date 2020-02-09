package demo;

public class Main {
    public static void main(String[] args) {
        ComponentA componentA=new ComponentA();
        DecoratorA decoratorA=new DecoratorA();
        DecoratorB decoratorB=new DecoratorB();
        decoratorA.setComponent(componentA);
        decoratorB.setComponent(decoratorA);
        decoratorB.operate();
    }
}
