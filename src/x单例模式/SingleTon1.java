package x单例模式;

// 多线程模式下的饿汉式单例模式：双重锁定   但是双重锁定又出现了问题:https://blog.csdn.net/mnb65482/article/details/80458571
public class SingleTon1 {
    private  static SingleTon1 singleTon;
    private SingleTon1() { }
    public static SingleTon1 getInstance() {
        //添加逻辑，如果实例化过就直接返回，当实例不存在时才加锁
        if (singleTon == null) {
            //多线程访问下有可能出现if同时成立的情况创建两个对象，需要添加锁
            synchronized (SingleTon.class) {
                //双重验证
                if (singleTon == null) {
                    singleTon = new SingleTon1();
                }
            }
        }
        return singleTon;
    }
}
