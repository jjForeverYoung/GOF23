package x单例模式;

// 懒汉式，等到第一次主动使用才会将自己实例化
public class SingleTonLazy {
    private static SingleTonLazy singTon;
    private SingleTonLazy(){}
    public static SingleTonLazy getInstance(){
        if (singTon == null){
            singTon = new SingleTonLazy();
        }
        return singTon;
    }
}
