package 访问者模式;

public class Man extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
