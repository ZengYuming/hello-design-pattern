/**
 * 胖子建造器
 */
public class BuilderFat extends Builder {
    private Product product=new Product();

    public Product getResult() {
        return product;
    }

    public void buildHead() {
        product.add("胖子-Head");
    }

    public void buildBody() {
        product.add("胖子-body");
    }

    public void buildArmLeft() {
        product.add("胖子-left arm");
    }

    public void buildArmRight() {
        product.add("胖子-right arm");
    }

    public void buildLegLeft() {
        product.add("胖子-left leg");
    }

    public void buildLegRight() {
        product.add("胖子-right leg");
    }
}
