package b策略模式;
/*
    用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */

class CashContext {
    private CashSuper cs;
    // 初始化时传入具体的策略对象
//    CashContext(CashSuper cs){
//        this.cs = cs;
//    }

    public CashContext(String type){
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300反100":
                cs = new CashReturn("300","100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
    }

    //上下文接口
    // 根据具体的策略对象，调用其算法的方法
    double getResult(double money){
        return cs.acceptCash(money);
    }
}
