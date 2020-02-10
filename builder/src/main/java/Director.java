/**
 * 指挥者类
 * 目的：根据用户的选择一步一步建造，封装建造过程
 */
public class Director {

    public Director() {
    }

    public void build(Builder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    }
}
