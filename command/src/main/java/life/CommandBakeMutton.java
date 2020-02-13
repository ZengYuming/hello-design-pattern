package life;

/**
 * 具体命令类，烤羊肉命令
 */
public class CommandBakeMutton extends Command {

    public CommandBakeMutton(Barbecuer receiver) {
        super(receiver);
    }

    public void executeCommand() {
        receiver.bakeMutton();
    }
}
