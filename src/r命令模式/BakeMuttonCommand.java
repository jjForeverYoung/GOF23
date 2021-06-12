package r命令模式;

public class BakeMuttonCommand extends Command {
    BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    void excuteCommand() {
        receiver.bakeMutton();
    }
}
