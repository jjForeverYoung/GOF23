package 访问者模式;

public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + this.getClass().toString()+"时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + this.getClass().toString()+"时，背后多半有一个不成功的男人");
    }
}
