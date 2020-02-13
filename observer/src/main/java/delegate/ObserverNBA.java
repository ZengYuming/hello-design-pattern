package delegate;

/**
 * 看NBA的同事（观察者）
 */
public class ObserverNBA {
    private String name;
    private Subject subject;

    public ObserverNBA(String name, Subject subject) {
        this.subject = subject;
        this.name = name;
    }

    /**
     * 关闭NBA
     */
    public void closeNBADirectSeeding() {
        System.out.println(subject.getSubjectState() + name + "关闭NBA，继续工作");
    }
}
