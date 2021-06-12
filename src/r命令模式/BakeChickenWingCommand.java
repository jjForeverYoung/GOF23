package r命令模式;

public class BakeChickenWingCommand extends Command{
    BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    void excuteCommand() {
        receiver.bakeChickenWing();
    }
}
