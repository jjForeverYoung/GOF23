package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    public void attach(Person element){
        elements.add(element);
    }

    public void detach(Person element){
        elements.remove(element);
    }

    public void display(Action visitor){
        for (Person element : elements) {
            element.accept(visitor);
        }
    }
}
