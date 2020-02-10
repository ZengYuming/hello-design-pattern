/**
 * 外观类
 * 知道哪些子系统类负责处理请求，将客户的请求代理给适当的子系统对象
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        two.methodTwo();
        three.methodThree();
    }
}
