package g模板方法模式;

// 抽象模板
public abstract class AbstractClass {
    abstract void primitiveOperation1(); //抽象行为一,把公用的方法放到模板里,**************
    abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println();
    }
}
