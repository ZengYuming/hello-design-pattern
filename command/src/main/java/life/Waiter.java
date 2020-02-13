package life;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员
 * 记录命令，通知执行者执行命令
 */
public class Waiter {
    private List<Command> commandList = new ArrayList<Command>();

    //设置订单（记录命令）
    public void setOrder(Command command) {
        if (command.toString().equals("no chicken")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            commandList.add(command);
            System.out.println("增加订单：" + command.toString() + "时间：" + new Date().getTime());
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        commandList.remove(command);
        System.out.println("取消订单：" + command.toString() + "时间：" + new Date().getTime());

    }

    //通知执行者执行命令
    public void notifyx() {
        for (Command x : commandList) {
            x.executeCommand();
        }
    }
}
