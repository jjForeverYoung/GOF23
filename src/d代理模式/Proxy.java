package d代理模式;

public class Proxy implements IGiveGift { //实现相同的接口，这样就代理类就可以代替实体
    private Pursuit gg; //保存一个引用使得代理可以访问实体
    Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlower() {
        gg.giveFlower();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
