package stand;

/**
 * 享元类接口
 * 通过这个接口，Flyweight可以接受并作用于外部状态
 */
public abstract class IFlyweight {
    public abstract void operation(int extrinsicstate);
}
