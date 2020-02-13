package simple;

/**
 * 观察者（比如，同事A），为观察者定义接口，在得到主题通知时更新自己
 */
public class ObserverA implements Observer {
    private String name;
    private String observerState;
    private SubjectA subject;

    public ObserverA(SubjectA subjectA, String name) {
        this.subject = subjectA;
        this.name = name;
    }

    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "的状态是：" + observerState);
    }

    public SubjectA getSubject() {
        return subject;
    }

    public void setSubject(SubjectA subject) {
        this.subject = subject;
    }
}
