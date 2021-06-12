package u享元模式;

public class ConcreteWebSite extends WebSite {
    private String name;
    ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    void use(User user) {
        System.out.println("网站分类:" + name + "用户:" + user.getName());
    }
}
