package delegate;

import simple.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类（抽象通知者类）
 * 现实中，"抽象通知者"由于
 */
public abstract class Subject {
    //通知
    void notifyy() {

    }

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
