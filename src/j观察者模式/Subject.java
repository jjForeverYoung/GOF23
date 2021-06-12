package j观察者模式;

public interface Subject {
    // 添加观察者
    void attach(Observer observer);
    // 移除观察者
    void detach(Observer observer);
    // 当主题方法改变时，这个方法被调用，通知所有的观察者
    void notify1();

}
