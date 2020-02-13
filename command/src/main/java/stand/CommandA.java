package stand;

/**
 * 具体命令（烤羊肉串）
 * 将一个接收者（命令执行者）对象绑定于一个动作，调用接收者相应的命令
 */
public class CommandA extends Command {
    public CommandA(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        receiver.action();
    }

}
