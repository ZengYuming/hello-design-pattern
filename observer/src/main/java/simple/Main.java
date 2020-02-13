package simple;

public class Main {
    public static void main(String[] args) {
        SubjectA subjectA = new SubjectA();
        subjectA.attach(new ObserverA(subjectA, "小米"));
        subjectA.attach(new ObserverA(subjectA, "小明"));
        subjectA.attach(new ObserverA(subjectA, "小黄"));
        subjectA.setSubjectState("ABC");
        subjectA.notifyy();
    }
}
