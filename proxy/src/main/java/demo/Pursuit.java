package demo;

/**
 * 追求者类，实现送礼物接口
 */
public class Pursuit implements IGiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println("送给" + mm.getName() + "洋娃娃");
    }

    public void giveFlowers() {
        System.out.println("送给" + mm.getName() + "鲜花");
    }

    public void giveChocolate() {
        System.out.println("送给" + mm.getName() + "巧克力");
    }
}
