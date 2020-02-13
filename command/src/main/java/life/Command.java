package life;

/**
 * 抽象命令
 * 绑定命令执行者是谁
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    //执行命令
    abstract public void executeCommand();
}
