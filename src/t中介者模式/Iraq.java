package t中介者模式;

public class Iraq extends Country {

    Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获得对方信息： " + message);
    }
}

