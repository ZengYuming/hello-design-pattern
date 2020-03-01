package life;

public class WebSiteA extends IWebSite {
    private String name;

    public WebSiteA(String name) {
        this.name = name;
    }

    public void use(User user) {
        System.out.println("网站分类：" + name + ",用户：" + user.getName());
    }
}
