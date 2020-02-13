package delegate;


/**
 * 老板主题类（抽象通知者类）
 * 现实中，"抽象通知者"由于
 */
public class SubjectBoss extends Subject {
    public EventHandler eventHandler=new EventHandler();

    private String subjectState;

    public void Notify() {

    }

    @Override
    void notifyy() {
        try {
            eventHandler.notifyx();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getSubjectState() {
        return subjectState;
    }

    @Override
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}