package c装饰模式;

// 具体服饰类
public class TShirts extends Finery{
    @Override
    public void show() {
        System.out.print("大T恤  ");
        super.show();
    }
}
