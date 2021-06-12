package o组合模式;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company c) {

    }

    @Override
    void remove(Company c) {

    }

    @Override
    void display(int depth) {
        System.out.println(Utils.getNum(depth) + name);
    }

    @Override
    void lineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
