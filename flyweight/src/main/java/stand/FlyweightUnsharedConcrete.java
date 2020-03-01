package stand;

/**
 * 不需要共享的Flyweight具体类（Flyweight不强制共享）
 */
public class FlyweightUnsharedConcrete extends IFlyweight {
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight：" + extrinsicstate);
    }
}
