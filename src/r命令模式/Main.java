package r命令模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();
        // 开门营业 顾客点菜
        girl.setOrders(bakeMuttonCommand1);
        girl.setOrders(bakeMuttonCommand2);
        girl.setOrders(bakeChickenWingCommand);
        girl.cancleOrder(bakeMuttonCommand2);

        // 点菜完毕，通知厨房
        girl.notify1();
    }
}

