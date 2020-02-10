/**
 * 瘦子建造器
 */
public class BuilderThin extends Builder {
    private Product product = new Product();

    public Product getResult() {
        return product;
    }

    public void buildHead() {
        product.add("瘦子-Head");
    }

    public void buildBody() {
        product.add("瘦子-body");
    }

    public void buildArmLeft() {
        product.add("瘦子-left arm");
    }

    public void buildArmRight() {
        product.add("瘦子-right arm");
    }

    public void buildLegLeft() {
        product.add("瘦子-left leg");
    }

    public void buildLegRight() {
        product.add("瘦子-right leg");
    }
}