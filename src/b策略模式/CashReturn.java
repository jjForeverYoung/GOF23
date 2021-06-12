package b策略模式;

class CashReturn extends CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
