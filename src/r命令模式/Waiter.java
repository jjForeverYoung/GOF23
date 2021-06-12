package r命令模式;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrders(Command command) {
        orders.add(command);
        System.out.println("增加订单" + command.toString() + new Date().toString());
    }

    public void cancleOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单" + command.toString() + new Date().toString());
    }

    public void notify1(){
        for (Command order : orders) {
            order.excuteCommand();
        }
    }
}
