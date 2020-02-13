package stand;

/**
 * 具体同事对象类
 * 绑定中介者
 * 每个具体同事只知道自己的行为，而不了解其他同事类的情况，单它们却都认识中介对象
 */
public class ColleagueA extends Colleague {

    public ColleagueA(IMediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        //通过中介发送信息
        mediator.send(message, this);
    }

    public void notifyx(String message) {
        System.out.println("同事A得到信息" + message);
    }
}
