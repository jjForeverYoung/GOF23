package c装饰模式;

// 服饰类  Decarator
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null){
            component.show();
        }
    }
}
