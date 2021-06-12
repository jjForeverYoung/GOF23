package x单例模式;

// 饿汉式:静态初始化的方式在自己被加载时就将自己实例化（大话设计模式概念）
public class SingleTon {
    // 为什么说加载的时候就进行了实例化？？？？
    private static SingleTon singleTon = new SingleTon(); // 静态变量当被初始化的时候才会执行new SingleTon()，那么为什么会说浪费资源呢？
    private SingleTon(){} //构造方法需要私有化，堵死了外界通过new创建此实例的可能
    public static SingleTon getInstance(){
        return singleTon;
    }

    /*
          *是否 Lazy 初始化：否
          *是否多线程安全：是，天生线程安全
          *实现难度：易
          *描述：这种方式比较常用，但容易产生垃圾对象。
          *优点：没有加锁，执行效率会提高。
          *缺点：类加载时就初始化，浪费内存。
          *它基于 classloder 机制避免了多线程的同步问题，
          * 不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
         * 在单例模式中大多数都是调用 getInstance 方法，
          * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
          * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
          */

    //  这里有解答https://www.v2ex.com/t/469375

}
