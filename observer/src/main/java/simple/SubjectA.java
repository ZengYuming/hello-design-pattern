package simple;

/**
 * 具体主题类(比如看股票，看NBA)，将有关状态存入具体观察者
 */
public class SubjectA extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
