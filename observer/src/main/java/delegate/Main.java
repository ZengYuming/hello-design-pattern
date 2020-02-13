package delegate;

public class Main {
    public static void main(String[] args) {
        SubjectBoss subjectBoss = new SubjectBoss();

        ObserverStock observerStock = new ObserverStock("小米", subjectBoss);
        ObserverNBA observerNBA = new ObserverNBA("小明", subjectBoss);

        subjectBoss.eventHandler.addEvent(observerStock,"closeStockMarket",null);
        subjectBoss.eventHandler.addEvent(observerNBA,"closeNBADirectSeeding",null);

        subjectBoss.setSubjectState( "老板回来来");
        subjectBoss.notifyy();
    }
}
