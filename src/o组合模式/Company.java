package o组合模式;

public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void add(Company c);
    abstract void remove(Company c);
    abstract void display(int depth); // 显示
    abstract void lineOfDuty(); // 旅行职责


}
