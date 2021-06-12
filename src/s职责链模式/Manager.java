package s职责链模式;

public abstract class Manager {
    protected String name;
    // 管理者的上级
    protected Manager superior;

    Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    abstract public void requestApplications(Request request);


}
