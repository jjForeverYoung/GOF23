package o组合模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    void add(Company c) {
        children.add(c);
    }

    @Override
    void remove(Company c) {
        children.remove(c);
    }

    @Override
    void display(int depth) {
        System.out.println(Utils.getNum(depth) + name);
        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
