package stand;

/**
 * 抽象同事对象类
 * 绑定中介者
 */
public abstract class Colleague {
    protected IMediator mediator;

    public Colleague(IMediator mediator) {
        this.mediator = mediator;
    }
}
