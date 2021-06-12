package o组合模式;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
//
//
        root.display(1);
//        ConcreteCompany root1 = new ConcreteCompany("北京总公司");
//        root1.add(new HRDepartment("总公司人力资源部"));
//        root1.add(new FinanceDepartment("总公司财务部"));
//
//        ConcreteCompany comp3 = new ConcreteCompany("上海华东分公司");
//        comp3.add(new HRDepartment("华东分公司人力资源部"));
//        comp3.add(new FinanceDepartment("华东公司财务部"));
//        root1.add(comp3);
//
//        ConcreteCompany comp4 = new ConcreteCompany("南京办事处");
//        comp4.add(new HRDepartment("南京办事处人力资源部"));
//        comp4.add(new FinanceDepartment("南京办事处财务部"));
//        comp3.add(comp4);
//
//        ConcreteCompany comp5 = new ConcreteCompany("杭州办事处");
//        comp5.add(new HRDepartment("杭州办事处人力资源部"));
//        comp5.add(new FinanceDepartment("杭州办事处财务部"));
//        comp3.add(comp5);
//
//        System.out.println("结构图");
//        root1.display(1);
//        System.out.println("职责");
//        root1.display(1);

    }
}
