package q桥接模式;

public class Main {
    public static void main(String[] args) {
        PhoneBrand brand = new AppleBrand();
        brand.setSoft(new PhoneGame());
        brand.run();

        brand.setSoft(new PhoneAddressList());
        brand.run();

        brand = new XiaoMiBrand();
        brand.setSoft(new PhoneGame());
        brand.run();

        brand.setSoft(new PhoneAddressList());
        brand.run();

    }
}
