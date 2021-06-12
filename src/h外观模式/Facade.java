package h外观模式;

// 外观类
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    // 方法组调用不同的具体方法
    public void methodA(){
        System.out.println("方法组一：");
        one.methodOne();
        three.methodThree();
    }

    public void methodB(){
        System.out.println("方法组二");
        two.methodTwo();
        one.methodOne();
    }
}
