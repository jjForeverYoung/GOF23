package t中介者模式;

public class USA extends Country {

    USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("美国获得对方信息： " + message);
    }
}
