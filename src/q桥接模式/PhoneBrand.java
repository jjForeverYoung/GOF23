package q桥接模式;

public abstract class PhoneBrand {
    protected PhoneSoft soft;

    public void setSoft(PhoneSoft soft) {
        this.soft = soft;
    }

    abstract void run();
}
