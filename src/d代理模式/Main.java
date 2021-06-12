package d代理模式;

public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("李美美");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlower();
    }
}
