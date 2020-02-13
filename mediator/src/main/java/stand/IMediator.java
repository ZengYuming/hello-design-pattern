package stand;

/**
 * 抽象中介者
 * 定义对象到中介者的接口
 */
public abstract class IMediator {
    //发送消息
    public abstract void send(String message,Colleague colleague);
}
