package e工厂方法模式;
// 增加一种实体要相应增加一种实体的工厂,简单工厂和方法工厂的区别看书

public class Main {
    public static void main(String[] args) {
        int a = 10;
        IFactory factory = new UnderGraduateFactory(); // 如果要换成社区志愿者修改这里就可以了
        LeiFeng student = factory.createLeifeng();

        student.bugRice();
        student.sweep();
        student.wash();

    }
}
