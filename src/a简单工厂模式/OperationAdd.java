package a简单工厂模式;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result;
        result = numberA + numberB;
        return result;
    }
}
