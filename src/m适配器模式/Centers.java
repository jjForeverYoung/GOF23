package m适配器模式;

public class Centers extends Player {
    public Centers(String name) {
        super(name);

    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + name + "进攻");
    }
}
