package p迭代器模式;

// 聚集抽象类
public interface Aggregate {
    void add(Object obj);
    void remove(Object object);
    Iterator iterator();
}
