package u享元模式;

public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use(new User("星星"));

        WebSite f1 = factory.getWebSiteCategory("博客");
        f1.use(new User("佳佳"));

        WebSite f2 = factory.getWebSiteCategory("博客");
        f2.use(new User("疾风亚索"));

        WebSite f3 = factory.getWebSiteCategory("博客");
        f3.use(new User("沙雕"));

        System.out.println("网站分类总数" + factory.getWebSiteCount());
    }
}
