package d代理模式;

public class Pursuit implements IGiveGift {
    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "  送你洋娃娃");
    }

    @Override
    public void giveFlower() {
        System.out.println(mm.getName() + "  送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "  送你巧克力");
    }
}
