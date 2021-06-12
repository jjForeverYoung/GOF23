package p迭代器模式;


public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("小明");
        aggregate.add("小红");
        aggregate.add("小刚");
        Iterator it = aggregate.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(4|7);

    }
}
