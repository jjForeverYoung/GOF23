package b策略模式;

// 正常收费子类
class CashNormal extends CashSuper {

    @Override
    double acceptCash(double money) {
        return money;
    }
}
