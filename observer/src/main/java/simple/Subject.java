package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类（抽象通知者类）
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<Observer>();
    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notifyy(){
        for (Observer x:observers
             ) {
            x.update();
        }
    }
}
