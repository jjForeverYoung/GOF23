package o组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    Composite(String name) {
        super(name);
    }

    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    void display(int depth) {
        System.out.println(Utils.getNum(depth) + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
