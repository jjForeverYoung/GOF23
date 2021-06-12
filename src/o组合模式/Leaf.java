package o组合模式;

import javafx.beans.property.StringPropertyBase;

public class Leaf extends Component {
    Leaf(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        System.out.println("不能增加叶结点");
    }

    @Override
    void remove(Component c) {
        System.out.println("不能移除叶结点");
    }

    @Override
    void display(int depth) {
        System.out.println(Utils.getNum(depth) + name);
    }
}
