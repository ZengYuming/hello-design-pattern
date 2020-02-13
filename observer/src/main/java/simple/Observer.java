package simple;

/**
 * 观察者，为观察者定义接口，在得到主题通知时更新自己
 */
public interface Observer {
    void update();
}
