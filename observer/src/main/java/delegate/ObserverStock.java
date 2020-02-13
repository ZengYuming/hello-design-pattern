package delegate;

import simple.Observer;
import simple.SubjectA;

/**
 * 看股票的同事（观察者）
 */
public class ObserverStock {
    private String name;
    private Subject subject;

    public ObserverStock(String name, Subject subject) {
        this.subject = subject;
        this.name = name;
    }

    public void closeStockMarket() {
        System.out.println(subject.getSubjectState() + name + "关闭股票行情，继续工作");
    }
}
