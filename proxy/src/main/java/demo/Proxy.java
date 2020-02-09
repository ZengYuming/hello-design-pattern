package demo;

/**
 * 追求者类，实现送礼物接口
 */
public class Proxy implements IGiveGift {
    //（追求者）被代理对象
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    public void giveDolls() {
        gg.giveDolls();
    }

    public void giveFlowers() {
        gg.giveFlowers();
    }

    public void giveChocolate() {
        gg.giveChocolate();
    }
}
