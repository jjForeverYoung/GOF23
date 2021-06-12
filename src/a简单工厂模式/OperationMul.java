package a简单工厂模式;

public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
