/**
 * 建造者
 * 用来定义构建过程
 */
public abstract class Builder {
    public abstract Product getResult();

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
