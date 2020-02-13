package life;

/**
 * 具体命令类，烤鸡翅命令
 */
public class CommandBakeChickenWing extends Command {

    public CommandBakeChickenWing(Barbecuer receiver) {
        super(receiver);
    }

    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
