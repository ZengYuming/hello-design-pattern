package life;

public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        IWebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));
        IWebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use(new User("小菜"));
        IWebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use(new User("小菜"));
        IWebSite fl = factory.getWebSiteCategory("博客");
        fl.use(new User("小菜"));
        IWebSite fm = factory.getWebSiteCategory("博客");
        fm.use(new User("小菜"));
        IWebSite fn = factory.getWebSiteCategory("博客");
        fn.use(new User("小菜"));

        System.out.println("网站分类总数：" + factory.getWebSiteCount());
    }
}