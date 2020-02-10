package demo;

/**
 * 实现一个模版方法
 * 定义算法骨架
 */
public abstract class AbstractClass {
    //留给子类实现
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    /**
     * 模版方法
     * 定义算法骨架，逻辑的组成是一组抽象方法，子类实现
     */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
