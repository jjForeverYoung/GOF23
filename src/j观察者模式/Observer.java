package j观察者模式;

interface Observer {
    // 当主题状态改变时，更新通知
    void update(int version);

}
