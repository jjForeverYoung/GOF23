package g模板方法模式;

//具体实现类A
public class ConcreteClassA extends AbstractClass{

    @Override
    void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
