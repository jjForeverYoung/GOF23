package n备忘录模式;

// 发起人类
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return (new Memento(state)); //将当前的状态保存起来
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("State =" + state);
    }
}
