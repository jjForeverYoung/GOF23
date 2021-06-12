package p迭代器模式;

import o组合模式.ConcreteCompany;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List list;
    private int cursor = 0;

    ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(cursor == list.size()){
            return false;
        }
        return true;
    }
}
