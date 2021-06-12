package a简单工厂模式;

import java.util.Scanner;

/**
 * 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。

     因为在简单工厂模式中用于创建实例的方法是静态(static)方法，因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式，但不属于GOF23种设计模式
     ————————————————
     版权声明：本文为CSDN博主「小旋锋」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
     原文链接：https://blog.csdn.net/wwwdc1012/article/details/82504040
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double numberA = sc.nextDouble();
        System.out.println("请输入操作符");
        String operation = sc.next();
        System.out.println("请输入第二个数字");
        double numberB = sc.nextDouble();
        try {
            Operation oper = OperationFactory.createOperate(operation);
            oper.numberA = numberA;
            oper.numberB = numberB;
            double result = oper.getResult();
            System.out.println("结果为" + result);
        }catch (Exception e){
            System.out.println("您的输入有误！");
        }finally {
            sc.close();
        }

    }
}
