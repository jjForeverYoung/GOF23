package b策略模式;

import java.util.ArrayList;
import java.util.List;

// 适合解决对象之间依赖关系
class Main {
    public static void main(String[] args) {

        CashContext csSuper = new CashContext("打8折"); //传入具体的策略
        double totalPrices = csSuper.getResult(1000);
        System.out.println(totalPrices);


    }
}
