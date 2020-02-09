package demo;

public class DecoratorA extends Decorator {
    @Override
    public void operate() {
        //先执行原Component的operate，即对原Component进行修饰
        super.operate();
        System.out.println("做一些A装饰");
    }
}
