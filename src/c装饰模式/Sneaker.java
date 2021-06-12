package c装饰模式;

public class Sneaker extends Finery {
    @Override
    public void show() {
        System.out.print("破球鞋  ");
        super.show();
    }
}
