package o组合模式;

abstract class Component {
    protected String name;
    Component(String name){
        this.name = name;
    }

    abstract void add(Component c);
    abstract void remove(Component c);
    abstract void display(int depth);
}
