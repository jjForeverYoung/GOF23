package c装饰模式;

// 在不改变对象自身的基础上，在程序运行期间给对象动态的添加职责（如这里的person对象）
public class Main {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        System.out.println("第一种装扮");

        Sneaker nike = new Sneaker();
        BigTrouser levis = new BigTrouser();
        TShirts gucci = new TShirts();

        // 装饰过程，顺序可以调换    levis的component是nike  gucci的component是levis  nike的component是person  递归调用
        gucci.decorate(levis);
        levis.decorate(nike);
        nike.decorate(person);
        gucci.show();
    }
}
