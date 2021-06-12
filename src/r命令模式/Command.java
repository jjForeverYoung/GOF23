package r命令模式;

public abstract class Command {
    protected Barbecuer receiver;

    Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    abstract void excuteCommand();
}
