package x单例模式;

// 保证一个类只有一个实例，并提供一个访问它的全局访问点
public class Main {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1 == s2);
    }
}
