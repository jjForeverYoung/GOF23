package i建造者模式;

// 具体建造类
public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();

    @Override
    public void buildParaA() {
        product.add("部件A");
    }

    @Override
    public void buildParaB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
