package 访问者模式;

public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

    }
}
