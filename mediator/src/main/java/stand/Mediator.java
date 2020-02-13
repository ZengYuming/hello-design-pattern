package stand;

/**
 * 具体中介者
 * 需要了解所有【具体同事对象】，并从具体对象接收消息，然后发送给另一个具体对象
 *
 */
public class Mediator extends IMediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }


    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notifyx(message);
        }else{
            colleagueA.notifyx(message);
        }
    }
}
