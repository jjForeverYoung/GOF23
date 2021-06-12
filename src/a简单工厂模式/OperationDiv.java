package a简单工厂模式;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if (numberB == 0){
            throw new Exception("除数不能为0.");
        }
        return numberA / numberB;
    }
}
