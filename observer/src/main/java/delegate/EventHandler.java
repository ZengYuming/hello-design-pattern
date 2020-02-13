package delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * 主要用来保存观察者，以及提供通知观察者的方法。
 */
public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<Event>();

    }

    public void addEvent(Object object, String methodName, Object... args) {
        Event event = new Event(object, methodName, args);
        //保存传进来的观察者。
        objects.add(event);
    }

    public void notifyx() throws Exception {
        for (Event e : objects) {
            // 通过反射调用对应的方法
            e.invoke();
        }
    }
}