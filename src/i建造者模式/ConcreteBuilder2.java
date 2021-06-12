package i建造者模式;

// 具体建造类
public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();

    @Override
    public void buildParaA() {
        product.add("部件X");
    }

    @Override
    public void buildParaB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
