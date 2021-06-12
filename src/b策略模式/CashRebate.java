package b策略模式;


// 打折
class CashRebate extends CashSuper {

    private double moneyRebate ;

    CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
    @Override
    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
