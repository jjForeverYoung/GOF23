package j观察者模式;

import java.util.ArrayList;
import java.util.List;

public class MagazineSubject implements Subject {
    //存放订阅者
    private List<Observer> observers=new ArrayList<Observer>();
    //期刊版本
    private int version;


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notify1() {
        for (Observer observer : observers) {
            observer.update(version);
        }
    }

    //该杂志发行了新版本
    public void publish(){
        //新版本
        this.version++;
        //信息更新完毕，通知所有观察者
        notify1();
    }
}
