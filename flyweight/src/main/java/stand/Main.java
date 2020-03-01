package stand;

public class Main {
    public static void main(String[] args) {
        int extrinsicstate = 22;//代码外部状态
        FlyweightFactory factory = new FlyweightFactory();

        IFlyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        IFlyweight fy = factory.getFlyweight("Y");
        fx.operation(--extrinsicstate);

        IFlyweight fz = factory.getFlyweight("Z");
        fx.operation(--extrinsicstate);

        IFlyweight unsharedFlyweight=new FlyweightUnsharedConcrete();
        unsharedFlyweight.operation(--extrinsicstate);
    }
}
