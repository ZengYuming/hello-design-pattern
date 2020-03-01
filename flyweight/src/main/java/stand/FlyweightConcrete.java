package stand;

/**
 * 具体类
 * 为内部状态增加存储空间
 */
public class FlyweightConcrete extends IFlyweight {
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}
